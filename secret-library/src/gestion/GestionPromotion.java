package gestion;

import classe.DetailCommande;
import classe.Promotion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionPromotion {

    private Connection connexion;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public GestionPromotion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Promotion p) {
        try {
            String query = "INSERT INTO promotion (IDEVENEMENT,CODEISBN) VALUES(?, ?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, p.getIdEvenement());
            stmt.setString(2, p.getCodeISBN());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPromotion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM promotion ";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPromotion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(Promotion p, int idEvenement, String codeISBN) {
        try {
            String query = "UPDATE promotion SET "
                    + "IDEVENEMENT=?, "
                    + "CODEISBN =? "
                    + "WHERE idEvenement = " + idEvenement
                    + " AND codeISBN = " + codeISBN;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, idEvenement);
            stmt.setString(2, codeISBN);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPromotion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(Promotion p, int idEvenement, String codeISBN) {
        String query = "DELETE FROM client WHERE idEvenement = " + idEvenement
                + " AND codeISBN = " + codeISBN;
        Statement stmt;
        try {
            stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPromotion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
