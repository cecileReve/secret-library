package gestion;

import classe.Livre;
import classe.Precision;
import classe.SousTheme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cdi311
 */
public class GestionPrecision {

    private Connection connexion;

    public GestionPrecision(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Livre livre, SousTheme st) {
        try {
            String query = "INSERT INTO precision (NOMSOUSTHEME,CODEISBN) VALUES(?, ?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, st.getNomSousTheme());
            stmt.setString(2, livre.getcodeISBN());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPrecision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM precision ";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionPrecision.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(Precision precision, String codeISBN, String nomSousTheme) {
        try {
            String query = "UPDATE precision SET "
                    + "nomSousTheme=?, "
                    + "CODEISBN =? "
                    + "WHERE nomSousTheme = " + nomSousTheme
                    + " AND codeISBN = " + codeISBN;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, precision.getNomSousTheme());
            stmt.setString(2, precision.getCodeISBN());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPrecision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(Precision precision, String codeISBN, String nomSousTheme) {
        String query = "DELETE FROM precision WHERE nomSousTheme = " + nomSousTheme
                + " AND codeISBN = " + codeISBN;
        Statement stmt;
        try {
            stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionPrecision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
