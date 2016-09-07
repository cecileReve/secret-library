package gestion;

import classe.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionClient {

    private Connection connexion;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public GestionClient(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Client c) {
        try {
            String query = "INSERT INTO client VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, c.getIdStatut());
            stmt.setString(2, c.getNomClient());
            stmt.setString(3, c.getPrenomClient());
            stmt.setString(4, c.getTelClient());
            stmt.setDate(5, c.getNaissanceClient());
            stmt.setString(6, c.getEmailClient());
            stmt.setString(7, c.getMdpClient());
            stmt.setDate(8, c.getDateInscription());
            stmt.setDate(9, c.getDateDesinscription());
            stmt.setString(10, c.getCommentaireClient());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM client";
            Statement stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
   
    public void sqlUpdate(Client c, int idClient) {
        try {
            String query = "UPDATE Client SET idStatut = ?, nomClient = ?, prenomClient = ?, "
                    + "telClient = ?, naissance client = ?, emailClient = ?, "
                    + "mdpClient = ?, dateInscription = ?, dateDesinscription = ?, "
                    + "commentaireClient = ? "
                    + "WHERE idClient = " + idClient;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, c.getIdStatut());
            stmt.setString(2, c.getNomClient());
            stmt.setString(3, c.getPrenomClient());
            stmt.setString(4, c.getTelClient());
            stmt.setDate(5, c.getNaissanceClient());
            stmt.setString(6, c.getEmailClient());
            stmt.setString(7, c.getMdpClient());
            stmt.setDate(8, c.getDateInscription());
            stmt.setDate(9, c.getDateDesinscription());
            stmt.setString(10, c.getCommentaireClient());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(Client c, int idClient) {
        
        try {
            String query = "DELETE FROM client WHERE idClient = " + idClient;
            Statement stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
