package gestion;

import classe.DetailCommande;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionDetailCommande {

    private Connection connexion;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public GestionDetailCommande(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(DetailCommande dc) {
        try {
            String query = "INSERT INTO DetailCommande(CodeISBN,IdCommande,IdEvenement,QuantiteDetailCommance,PrixHTDetailCommande,TauxTVADetailCommannde) VALUES(?, ?, ?, ?, ?, ?) ";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, dc.getCodeISBN());
            stmt.setInt(2, dc.getIdCommande());
            stmt.setInt(3, dc.getIdEvenement());
            stmt.setInt(4, dc.getQuantiteDetailCommande());
            stmt.setFloat(5, dc.getPrixHTDetailCommande());
            stmt.setFloat(6, dc.getTauxTVADetailCommande());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDetailCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM DetailCommande ";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionDetailCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(DetailCommande dc, int idDetailCommande) {
        try {
            String query = "UPDATE detailCommande SET "
                    + "CodeISBN = ?, "
                    + "IdCommande = ?, "
                    + "IdEvenement = ?, "
                    + "QuantiteDetailCommance = ?, "
                    + "PrixHTDetailCommande = ?, "
                    + "TauxTVADetailCommannde = ? "
                    + "WHERE idDetailCommande = '" + idDetailCommande+"'";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, dc.getCodeISBN());
            stmt.setInt(2, dc.getIdCommande());
            stmt.setInt(3, dc.getIdEvenement());
            stmt.setInt(4, dc.getQuantiteDetailCommande());
            stmt.setFloat(5, dc.getPrixHTDetailCommande());
            stmt.setFloat(6, dc.getTauxTVADetailCommande());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDetailCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(DetailCommande dc, int idDetailCommande) {
        try {
            String query = "DELETE FROM DetailCommande WHERE idDetailCOmmande = " + idDetailCommande;
            Statement stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDetailCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
