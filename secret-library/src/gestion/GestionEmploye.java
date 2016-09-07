package gestion;

import classe.Employe;
import classe.Livre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionEmploye {

    private Connection connexion = null;

    public GestionEmploye(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Employe employe) {

        try {
            String query = "INSERT INTO employe ("
                    + "numSecuEmploye,"
                    + "nomEmploye,"
                    + "prenomEmploye,"
                    + "dateNaissanceEmploye,"
                    + "telEmploye,"
                    + "mailEmploye,"
                    + "loginEmploye,"
                    + "mdpEmploye,"
                    + "commentaireEmploye) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, employe.getNumSecuEmploye());
            stmt.setString(2, employe.getNomEmploye());
            stmt.setString(3, employe.getPrenomEmploye());
            stmt.setDate(4, employe.getDateNaissanceEmploye());
            stmt.setString(5, employe.getTelEmploye());
            stmt.setString(6, employe.getMailEmploye());
            stmt.setString(7, employe.getLoginEmploye());
            stmt.setString(8, employe.getMdpEmploye());
            stmt.setString(9, employe.getCommentaireEmploye());
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM employe";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(Employe employe, String numSecuEmploye) {
        try {
            String query = "UPDATE employe SET NUMSECUEMPLOYE=?,NOMEMPLOYE=?,PRENOMEMPLOYE=?,DATENAISSANCEEMPLOYE=?,TELEMPLOYE=?,EMAILEMPLOYE=?,LOGINEMPLOYE=?,MDPEMPLOYE=?,COMMENTAIREEMPLOYE=? WHERE NUMSECUEMPLOYE = " + numSecuEmploye;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, employe.getNumSecuEmploye());
            stmt.setString(2, employe.getNomEmploye());
            stmt.setString(3, employe.getPrenomEmploye());
            stmt.setDate(4, employe.getDateNaissanceEmploye());
            stmt.setString(5, employe.getTelEmploye());
            stmt.setString(6, employe.getMailEmploye());
            stmt.setString(7, employe.getLoginEmploye());
            stmt.setString(8, employe.getMdpEmploye());
            stmt.setString(9, employe.getCommentaireEmploye());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            System.err.println("3)Oops:SQL:" + ex.getErrorCode() + "/" + ex.getMessage());
        }
    }

    public void sqlDelete(Employe employe, String numSecuEmploye) {
        try {
            String query = "DELETE FROM employe WHERE NUMSECUEMPLOYE = " + numSecuEmploye;
            Statement stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
