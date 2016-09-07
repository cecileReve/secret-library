
package gestion;

import classe.Entreprise;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionEntreprise {
    
     private Connection connexion;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public GestionEntreprise(Connection connexion) {
        this.connexion = connexion;
    }
    
    public void sqlCreate(Entreprise ent){
         try {
             String query = "INSERT INTO Entreprise VALUES(?, ?, ?)";
             PreparedStatement stmt = connexion.prepareStatement(query);
             stmt.setString(1, ent.getNomEntreprise());
             stmt.setString(2, ent.getSiretEntreprise());
             stmt.setString(3, ent.getLogoEntreprise());
             stmt.executeQuery();
         } catch (SQLException ex) {
             Logger.getLogger(GestionEntreprise.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public ResultSet sqlRead (){
        ResultSet rs = null;
         try {             
             String query = "SELECT * FROM Entreprise";
             Statement stmt = connexion.createStatement();
             rs = stmt.executeQuery(query);
         } catch (SQLException ex) {
             Logger.getLogger(GestionEntreprise.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;
    }
    
    public void sqlUpdate(Entreprise ent, int idEntreprise){
         try {
             String query = "UPDATE Entreprise SET nomEntreprise = ?, siretEntreprise = ?, logoEntreprise = ? "
                     + "WHERE idEntreprise = " + idEntreprise;
             PreparedStatement stmt = connexion.prepareStatement(query);
             stmt.setString(1, ent.getNomEntreprise());
             stmt.setString(2, ent.getSiretEntreprise());
             stmt.setString(3, ent.getLogoEntreprise());
             stmt.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(GestionEntreprise.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void sqlDelete(Entreprise ent, int idEntreprise){
         try {
             String query = "DELETE FROM Entreprise WHERE idEntreprise = " + idEntreprise;
             Statement stmt = connexion.createStatement();
             stmt.executeQuery(query);
         } catch (SQLException ex) {
             Logger.getLogger(GestionEntreprise.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
