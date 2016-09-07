package gestion;

import classe.EnregistrementLivraison;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionEnregistrementLivraison {

    private Connection connexion = null;

    public GestionEnregistrementLivraison(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(EnregistrementLivraison el) {
        try {
            String query = "INSERT INTO enregistrementLivraison VALUES(?,?,?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, el.getIdClient());
            stmt.setInt(2, el.getIdAdresse());
            stmt.setTimestamp(3, el.getDateEnregistrementLivraison());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEnregistrementLivraison.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM enregistrementLivraison"
                    + "JOIN client ON client.idClient = enregistrementLivraison.idClient"
                    + "JOIN adresse ON adresse.idAdresse = enregistrementLivraison.idAdresse";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionEnregistrementLivraison.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(EnregistrementLivraison el, int idClient, int idPanier) {
        try {
            String query = "UPDATE enregistrementLivraison Values(?,?,?)WHERE idClient=" + idClient
                    + "AND idPanier=" + idPanier;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, el.getIdClient());
            stmt.setInt(2, el.getIdAdresse());
            stmt.setTimestamp(3, el.getDateEnregistrementLivraison());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEnregistrementLivraison.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void sqlDelete(EnregistrementLivraison el, int idClient, int idPanier){
        try {
            String query = "DELETE FROM enregistrementLivraison WHERE idClient=" + idClient
                    + "AND idPanier=" + idPanier;
            
            Statement stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionEnregistrementLivraison.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
