
package gestion;

import classe.Ecriture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionEcriture {
    
     private Connection connexion;
    
    public GestionEcriture(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }
    
    public void sqlCreate(Ecriture ecriture){
         try {
             String query = "INSERT INTO ecriture VALUES(?,?)";
             PreparedStatement stmt = connexion.prepareStatement(query);
             stmt.setInt(1, ecriture.getIdAuteur());
             stmt.setString(2, ecriture.getCodeISBN());
             stmt.executeQuery();
         } catch (SQLException ex) {
             Logger.getLogger(GestionEcriture.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public ResultSet sqlRead(){
         ResultSet rs = null;
         try {
             String query = "SELECT * FROM ecriture";
             Statement stmt = connexion.createStatement();
             rs = stmt.executeQuery(query);
         } catch (SQLException ex) {
             Logger.getLogger(GestionEcriture.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;
    }
    
    public void sqlUpdate(Ecriture ecriture, int idAuteur, String codeISBN){
         try {
             String query = "UPDATE ecriture SET idAuteur=?, codeISBN=?";
             PreparedStatement stmt = connexion.prepareStatement(query);
             stmt.setInt(1, ecriture.getIdAuteur());
             stmt.setString(2, ecriture.getCodeISBN());
             stmt.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(GestionEcriture.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    public void sqlDelete(Ecriture ecriture, int idAuteur, String codeISBN){
         try {
             String query = "DELETE FROM ecriture";
             Statement stmt = connexion.createStatement();
             stmt.executeQuery(query);
         } catch (SQLException ex) {
             Logger.getLogger(GestionEcriture.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
