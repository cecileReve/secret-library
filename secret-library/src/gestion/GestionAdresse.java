package gestion;

import classe.Adresse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionAdresse {
    private Connection connexion;

    public GestionAdresse(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public void sqlCreate(Adresse adresse) {
        try {
            String query = "INSERT INTO "
                    + "ADRESSE(IDADRESSE, NUMADRESSE, VOIEADRESSE, CODEPOSTAL, VILLE, CPTADRESSE, PAYSADRESSE, COMMENTAIREADRESSE) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?) ";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, adresse.getIdAdresse());
            stmt.setString(2, adresse.getNumAdresse());
            stmt.setString(3, adresse.getRueAdresse());
            stmt.setString(4, adresse.getCodePostal());
            stmt.setString(5, adresse.getVille());
            stmt.setString(6, adresse.getCptAdresse());
            stmt.setString(7, adresse.getPaysAdresse());
            stmt.setString(8, adresse.getCommentaireAdresse());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAdresse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM ADRESSE";
            Statement stmt = connexion.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionAdresse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(Adresse adresse, int idAdresse) {
        try {
            String query = "UPDATE ADRESSE SET "
                    + "IDADRESSE=?, "
                    + "NUMADRESSE=?, "
                    + "VOIEADRESSE=?, "
                    + "CODEPOSTAL=?, "
                    + "VILLE=?, "
                    + "CPTADRESSE=?, "
                    + "PAYSADRESSE=?, "
                    + "COMMENTAIREADRESSE=?, "
                    + "WHERE IDADRESSE =" + idAdresse;
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, adresse.getIdAdresse());
            stmt.setString(2, adresse.getNumAdresse());
            stmt.setString(3, adresse.getRueAdresse());
            stmt.setString(4, adresse.getCodePostal());
            stmt.setString(5, adresse.getVille());
            stmt.setString(6, adresse.getCptAdresse());
            stmt.setString(7, adresse.getPaysAdresse());
            stmt.setString(8, adresse.getCommentaireAdresse());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GestionAdresse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(Adresse adresse, int idAdresse) {
        try {
            String query = "DELETE FROM ADRESSE WHERE IDADRESSE = " + idAdresse;
            Statement stmt = connexion.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionAdresse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
