
package gestion;

import classe.Prix;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionPrix {
    
    private Connection connexion;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public GestionPrix(Connection connexion) {
        this.connexion = connexion;
    }
    
    public void sqlCreate(Prix pr){
        try {
            String query = "INSERT INTO Prix VALUES (?, ?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setFloat(1, pr.getMontantHT());
            stmt.setDate(2, pr.getDateMajPrix());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPrix.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet sqlRead(){
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM Prix";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionPrix.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void sqlUpdate(Prix pr, int idPrix){
        try {
            String query = "UPDATE Prix SET montantHT = ?, dateMajPrix = ? "
                    + "WHERE idPrix =' " + idPrix+"'";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setFloat(1, pr.getMontantHT());
            stmt.setDate(2, pr.getDateMajPrix());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPrix.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete(Prix cat, int idPrix) {
        try {
            String query = "DELETE FROM Prix WHERE idPrix = " + idPrix;
            Statement stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
