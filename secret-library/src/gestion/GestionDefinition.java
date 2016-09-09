package gestion;

import classe.Definition;
import classe.Livre;
import classe.MotClef;
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
public class GestionDefinition {

    private Connection connexion;

    public GestionDefinition(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Livre livre, MotClef motclef) {
        try {
            String query = "INSERT INTO DEFINITION (NOMMOTCLEF,CODEISBN) VALUES(?, ?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, motclef.getNomMotClef());
            stmt.setString(2, livre.getcodeISBN());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDefinition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM DEFINITION";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionDefinition.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void sqlUpdate(Definition definition, String nomMotClef, String codeISBN) {
        try {
            String query = "UPDATE DEFINITION SET "
                    + "nomMotClef=?, "
                    + "CODEISBN =? "
                    + "WHERE nomMotClef = '" + nomMotClef+"'"
                    + " AND codeISBN = '" + codeISBN+"'";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, definition.getNomMotClef());
            stmt.setString(2, definition.getCodeISBN());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDefinition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete(Definition definition, String nomMotClef, String codeISBN) {
        String query = "DELETE FROM DEFINITION WHERE nomMotClef = " + nomMotClef
                + " AND codeISBN = " + codeISBN;
        Statement stmt;
        try {
            stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDefinition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
