package gestion;

import classe.DetailCommande;
import classe.Promotion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionPromotion {

    private Connection connexion;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public GestionPromotion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Promotion p) {
        try {
            String query = "INSERT INTO promotion VALUES(?, ?)"
                    + "JOIN Livre ON Livre.codeISBN = promotion.codeISBN"
                    + "JOIN Evenement ON Evenement.idEvenement = promotion.idEvenement";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, p.getIdEvenement());
            stmt.setString(2, p.getCodeISBN());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPromotion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sqlRead() {
        try {
            String query = "SELECT * FROM promotion "
                    + "JOIN Livre ON Livre.codeISBN = promotion.codeISBN"
                    + "JOIN Evenement ON Evenement.idEvenement = promotion.idEvenement";
            Statement stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionPromotion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void sqlUpdate(Promotion p, int idEvenement, String codeISBN){
        try {
            String query = "UPDATE promotion VALUES(?, ?)"
                    + "JOIN Livre ON Livre.codeISBN = promotion.codeISBN"
                    + "JOIN Evenement ON Evenement.idEvenement = promotion.idEvenement"
                      + "WHERE idEvenement = " + idEvenement
                      + "AND codeISBN = " + codeISBN;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1,idEvenement);
            stmt.setString(2, codeISBN);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPromotion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    public void sqlDelete (Promotion p,int idEvenement, String codeISBN){
        String query = "DELETE FROM client WHERE idEvenement = " + idEvenement 
                      + "AND codeISBN = " + codeISBN;
            Statement stmt;
        try {
            stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionPromotion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    
    
    
    
    
    }
