package gestion;

import classe.MotClef;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionMotClef {

    private Connection connexion;

    public GestionMotClef(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(MotClef motClef) {
        try {
            String query = "INSERT INTO motClef Values(?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, motClef.getNomMotClef());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionMotClef.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM motClef";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionMotClef.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(MotClef motClef, String nomMotClef) {
        try {
            String query = "UPDATE motclef SET nomMotClef=?"
                    + "WHERE nomMotClef='" + nomMotClef+"'";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, motClef.getNomMotClef());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionMotClef.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(MotClef motClef, String nomMotClef) {
        try {
            String query = "DELETE FROM motClef WHERE nomMotClef = " + nomMotClef;
            Statement stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionMotClef.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
