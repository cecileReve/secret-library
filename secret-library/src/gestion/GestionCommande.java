package gestion;

import classe.Commande;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionCommande {

    private Connection connexion;

    public GestionCommande(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Commande commande) {
        try {
            String query = "INSERT INTO COMMANDE VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) "
                    + "JOIN ADRESSE a1 ON COMMANDE.IDADRESSEFACTURATION = a1.IDADRESSE"
                    + "JOIN ADRESSE a2 ON COMMANDE.IDADRESSELIVRAISON = a2.IDADRESSE"
                    + "JOIN CLIENT ON COMMANDE.IDCLIENT = CLIENT.IDCLIENT"
                    + "JOIN TRANSPORTEUR ON COMMANDE.CODETRANSPORTEUR = TRANSPORTEUR.CODETRANSPORTEUR"
                    + "JOIN STATUT ON COMMANDE.IDSTATUT = STATUT.IDSTATUT";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, commande.getIdCommande());
            stmt.setString(2, commande.getCodeTransporteur());
            stmt.setInt(3, commande.getIdAdresseLivraison());
            stmt.setInt(4, commande.getIdAdresseFacturation());
            stmt.setInt(5, commande.getIdClient());
            stmt.setInt(6, commande.getIdStatut());
            stmt.setTimestamp(7, commande.getDateCommande());
            stmt.setString(8, commande.getIpCommande());
            stmt.setString(9, commande.getNumeroTransaction());
            stmt.setString(10, commande.getCommantaireCommande());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet sqlRead(){
        ResultSet rs = null;
        try {
            String query = "SELECT COMMANDE"
                    + "JOIN ADRESSE a1 ON COMMANDE.IDADRESSEFACTURATION = a1.IDADRESSE"
                    + "JOIN ADRESSE a2 ON COMMANDE.IDADRESSELIVRAISON = a2.IDADRESSE"
                    + "JOIN CLIENT ON COMMANDE.IDCLIENT = CLIENT.IDCLIENT"
                    + "JOIN TRANSPORTEUR ON COMMANDE.CODETRANSPORTEUR = TRANSPORTEUR.CODETRANSPORTEUR"
                    + "JOIN STATUT ON COMMANDE.IDSTATUT = STATUT.IDSTATUT";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void sqlUpdate(Commande commande, int idCommande){
        try {
            String query = "UPDATE COMMANDE SET IDCOMMANDE=?, CODETRANSPORTEUR=?, IDADRESSELIVRAISON=?, IDADRESSEFACTURATION=?, IDCLIENT=?, IDSTATUT=?, DATECOMMANDE=?, IPCOMMANDE=?, NUMEROTRANSACTION=?, COMMENTAIRECOMMANDE=? "
                    + "JOIN ADRESSE a1 ON COMMANDE.IDADRESSEFACTURATION = a1.IDADRESSE"
                    + "JOIN ADRESSE a2 ON COMMANDE.IDADRESSELIVRAISON = a2.IDADRESSE"
                    + "JOIN CLIENT ON COMMANDE.IDCLIENT = CLIENT.IDCLIENT"
                    + "JOIN TRANSPORTEUR ON COMMANDE.CODETRANSPORTEUR = TRANSPORTEUR.CODETRANSPORTEUR"
                    + "JOIN STATUT ON COMMANDE.IDSTATUT = STATUT.IDSTATUT"
                    + "WHERE IDCOMMANDE ="+ idCommande;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, commande.getIdCommande());
            stmt.setString(2, commande.getCodeTransporteur());
            stmt.setInt(3, commande.getIdAdresseLivraison());
            stmt.setInt(4, commande.getIdAdresseFacturation());
            stmt.setInt(5, commande.getIdClient());
            stmt.setInt(6, commande.getIdStatut());
            stmt.setTimestamp(7, commande.getDateCommande());
            stmt.setString(8, commande.getIpCommande());
            stmt.setString(9, commande.getNumeroTransaction());
            stmt.setString(10, commande.getCommantaireCommande());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete (Commande commande, int idCommande){
        try {
            String query = "DELETE FROM COMMANDE"
                    + "JOIN ADRESSE a1 ON COMMANDE.IDADRESSEFACTURATION = a1.IDADRESSE"
                    + "JOIN ADRESSE a2 ON COMMANDE.IDADRESSELIVRAISON = a2.IDADRESSE"
                    + "JOIN CLIENT ON COMMANDE.IDCLIENT = CLIENT.IDCLIENT"
                    + "JOIN TRANSPORTEUR ON COMMANDE.CODETRANSPORTEUR = TRANSPORTEUR.CODETRANSPORTEUR"
                    + "JOIN STATUT ON COMMANDE.IDSTATUT = STATUT.IDSTATUT"
                    + "WHERE IDCOMMANDE ="+ idCommande;
            Statement stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
