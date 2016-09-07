package gestion;

import classe.DetailPanier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionDetailPanier {

    private Connection connexion;

    public GestionDetailPanier(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(DetailPanier dp) {
        try {
            String query = "INSERT INTO detailPanier VALUES(?,?)";

            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, dp.getIdDetailPanier());
            stmt.setInt(2, dp.getIdPanier());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDetailPanier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM detailPanier"
                    + "JOIN panier ON panier.idPanier=detailPanier.idPanier";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionDetailPanier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(DetailPanier dp, int idDetailPanier) {
        try {
            String query = "UPDATE detailPanier SET idDetailPanier=?,idPanier=? WHERE idDetailPanier=" + idDetailPanier;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, dp.getIdDetailPanier());
            stmt.setInt(2, dp.getIdPanier());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDetailPanier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sqlDelete(DetailPanier dp, int idDetailPanier) {

        try {
            String query = "DELETE FROM detailPanier WHERE idDetailPanier=" + idDetailPanier;
            Statement stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionDetailPanier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
