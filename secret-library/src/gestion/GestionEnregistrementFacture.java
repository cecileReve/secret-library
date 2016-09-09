package gestion;

import classe.EnregistrementFacture;
import classe.EnregistrementLivraison;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionEnregistrementFacture {

    private Connection connexion = null;

    public GestionEnregistrementFacture(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(EnregistrementFacture ef) {
        try {
            String query = "INSERT INTO enregistrementFacture VALUES(?,?,?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, ef.getIdClient());
            stmt.setInt(2, ef.getIdAdresse());
            stmt.setTimestamp(3, ef.getDateEnregistrementFacture());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEnregistrementFacture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM enregistrementFacture"
                    + "JOIN client ON client.idClient = enregistrementFacture.idClient"
                    + "JOIN adresse ON adresse.idAdresse = enregistrementFacture.idAdresse";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionEnregistrementLivraison.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(EnregistrementFacture el, int idClient, int idAdresse) {
        try {
            String query = "UPDATE enregistrementFacture SET idClient=?,idAdresse=? WHERE idClient='" + idClient+"'"
                    + "AND idAdresse='" + idAdresse+"'";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, el.getIdClient());
            stmt.setInt(2, el.getIdAdresse());
            stmt.setTimestamp(3, el.getDateEnregistrementFacture());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEnregistrementLivraison.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sqlDelete(EnregistrementLivraison el, int idClient, int idAdresse) {
        try {
            String query = "DELETE FROM enregistrementFacture WHERE idClient=" + idClient
                    + "AND idAdresse=" + idAdresse;

            Statement stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEnregistrementLivraison.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
