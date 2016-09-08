
package gestion;

import classe.Auteur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionAuteur {
    
    private Connection connexion;
    
    public GestionAuteur(Connection connexion) {
        this.connexion = connexion;
    }
     
    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }
    
    public void sqlCreate(Auteur auteur){
        try {
            String query = "INSERT INTO "
                    + "AUTEUR (NOMAUTEUR,PRENOMAUTEUR)"
                    + "VALUES(?,?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, auteur.getNomAuteur());
            stmt.setString(2, auteur.getPrenomAuteur());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAuteur.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    public ResultSet sqlRead(){
         ResultSet rs = null;
        try {
            String query = "SELECT * FROM AUTEUR";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAuteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void sqlUpdate(Auteur auteur, int idAuteur){
        try {
            String query = "UPDATE AUTEUR SET "
                    + "idAuteur=?, "
                    + "nomAuteur=?, "
                    + "prenomAuteur=?"
                    +"WHERE idAuteur="+idAuteur;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, auteur.getIdAuteur());
            stmt.setString(2, auteur.getNomAuteur());
            stmt.setString(3, auteur.getPrenomAuteur());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAuteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete(Auteur auteur, int idAuteur){
        try {
            String query = "DELETE FROM auteur"
                    +"WHERE idAuteur="+idAuteur;
            Statement stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAuteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
