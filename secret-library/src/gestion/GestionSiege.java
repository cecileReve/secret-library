package gestion;

import classe.Adresse;
import classe.Entreprise;
import classe.Siege;
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
public class GestionSiege {
private Connection connexion;

    public GestionSiege(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Entreprise ent, Adresse adr) {
        try {
            String query = "INSERT INTO SIEGE (IDENTREPRISE, IDADRESSE) VALUES(?, ?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, ent.getIdEntreprise());
            stmt.setInt(2, adr.getIdAdresse());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionSiege.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM SIEGE";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionSiege.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void sqlUpdate(Siege siege, int idEntreprise, int idAdresse) {
        try {
            String query = "UPDATE SIEGE SET "
                    + "idEntreprise=?, "
                    + "idAdresse =? "
                    + "WHERE idEntreprise = " + idEntreprise
                    + " AND idAdresse = " + idAdresse;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, siege.getIdEntreprise());
            stmt.setInt(2, siege.getIdAdresse());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionSiege.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sqlDelete(Siege siege, int idEntreprise, int idAdresse) {
        String query = "DELETE FROM SIEGE WHERE idEntreprise = " + idEntreprise
                + " AND idAdresse = " + idAdresse;
        Statement stmt;
        try {
            stmt = connexion.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionSiege.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
