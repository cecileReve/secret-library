package gestion;

import classe.Theme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionTheme {

    private Connection connexion;

    public GestionTheme(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Theme theme) {

        try {
            String query = "INSERT INTO THEME(NOMTHEME) VALUES(?)";
            PreparedStatement stmt;
            stmt = connexion.prepareStatement(query);
            stmt.setString(1, theme.getNomTheme());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM THEME ";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void sqlUpdate(Theme theme, String nomTheme) {
        try {
            String query = "UPDATE THEME SET "
                    + "NOMTHEME =? "
                    + "WHERE NOMTHEME = " + nomTheme;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, nomTheme);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestionTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete(Theme theme, String nomTheme) {
        String query = "DELETE FROM THEME WHERE nomTheme = " + nomTheme;
        Statement stmt;
        try {
            stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionTheme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
