package gestion;

import classe.Panier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionPanier {

    private Connection connexion;

    public GestionPanier(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Panier p) {
        try {
            String query = "INSERT INTO panier Values(?,?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, p.getIdClient());
            stmt.setString(2, p.getNomPanier());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPanier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM panier"
                    + "JOIN client ON client.idClient = panier.idPanier";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPanier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(Panier p, int idPanier) {
        try {
            String query = "UPDATE panier SET idClient=?,nomPanier=? WHERE idPanier=" + idPanier;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, p.getIdClient());
            stmt.setString(2, p.getNomPanier());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPanier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete(Panier p, int idPanier){
        try {
            String query = "DELETE FROM Panier WHERE idPanier=" + idPanier;
            Statement stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionPanier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
