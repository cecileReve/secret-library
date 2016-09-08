package gestion;

import classe.Editeur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionEditeur {

    private Connection connexion;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public GestionEditeur(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Editeur ed) {
        try {
            String query = "INSERT INTO Editeur VALUES(?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, ed.getNomEditeur());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEditeur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM Editeur";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionEditeur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(Editeur ed, String nomEditeur) {
        try {
            String query = "UPDATE Editeur SET nomEditeur = ? "
                    + "WHERE nomEditeur = " + nomEditeur;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, ed.getNomEditeur());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEditeur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(Editeur ed, String nomEditeur) {
        try {
            String query = "DELETE FROM Editeur WHERE nomEditeur = " + nomEditeur;
            Statement stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEditeur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
