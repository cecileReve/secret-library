package gestion;

import classe.Cout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionCout {

    private Connection connexion;

    public GestionCout(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Cout cout) {

        try {
            String query = "INSERT INTO COUT(CODEISBN,IDPRIX) VALUES (?,?)";
            PreparedStatement stmt;
            stmt = connexion.prepareStatement(query);
            stmt.setString(1, cout.getCodeISBN());
            stmt.setInt(2, cout.getIdPrix());
            stmt.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(GestionCout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM THEME ";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionCout.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(Cout cout, String codeISBN, int idPrix) {
        try {
            String query = "UPDATE COUT SET"
                    + " CODEISBN =? ,"
                    + " IDPRIX=?"
                    + " WHERE CODEISBN = '" + codeISBN+"'"
                    + " AND IDPRIX = '" + idPrix+"'";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, cout.getCodeISBN());
            stmt.setInt(2, cout.getIdPrix());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionCout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(Cout cout, String codeISBN, int idPrix) {
        String query = "DELETE FROM COUT"
                + " WHERE CODEISBN = " + codeISBN
                + " AND IDPRIX = " + idPrix;
        Statement stmt;
        try {
            stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionCout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
