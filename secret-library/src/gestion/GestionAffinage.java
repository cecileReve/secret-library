package gestion;

import classe.Affinage;
import classe.SousTheme;
import classe.Theme;
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
public class GestionAffinage {

    private Connection connexion;

    public GestionAffinage(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Theme th, SousTheme st) {
        try {
            String query = "INSERT INTO AFFINAGE (NOMTHEME,NOMSOUSTHEME) VALUES(?, ?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, th.getNomTheme());
            stmt.setString(2, st.getNomSousTheme());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAffinage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM AFFINAGE";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionAffinage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void sqlUpdate(Affinage affinage, String nomTheme, String nomSousTheme) {
        try {
            String query = "UPDATE AFFINAGE SET "
                    + "nomTheme=?, "
                    + "nomSousTheme =? "
                    + "WHERE nomTheme = " + nomTheme
                    + " AND nomSousTheme = " + nomSousTheme;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, affinage.getNomTheme());
            stmt.setString(2, affinage.getNomSousTheme());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAffinage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete(Affinage affinage, String nomTheme, String nomSousTheme) {
        String query = "DELETE FROM AFFINAGE WHERE nomTheme = " + nomTheme
                + " AND nomSousTheme = " + nomSousTheme;
        Statement stmt;
        try {
            stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAffinage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
