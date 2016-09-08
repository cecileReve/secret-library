
package gestion;

import classe.SousTheme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionSousTheme {
    
    private Connection connexion;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public GestionSousTheme(Connection connexion) {
        this.connexion = connexion;
    }
    
    public void sqlCreate(SousTheme sst){
        try {
            String query = "INSERT INTO SousTheme VALUES(?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, sst.getNomSousTheme());
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionSousTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM SousTheme";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionSousTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void sqlUpdate (SousTheme sst, String nomSousTheme){
        try {
            String query = "UPDATE SousTheme SET nomSousTheme = ? "
                    + "WHERE nomSousTheme = " + nomSousTheme;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, sst.getNomSousTheme());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionSousTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete(SousTheme sst, String nomSousTheme){
        try {
            String query = "DELETE FROM SousTheme WHERE nomSousTheme = " + nomSousTheme;
            Statement stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionSousTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
