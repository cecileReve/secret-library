package gestion;

import classe.Livre;
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
public class GestionLivre {

    private Connection connexion;

    public GestionLivre(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }
    

    public void sqlCreate(Livre livre) {
        try {
            String query = "INSERT INTO LIVRE(CODEISBN, NOMEDITEUR, NOMCATEGORIE, IDSTATUT, "
                    + "NOMTAXE, NOMLIVRE, SOUSTITRE, COUVLIVRE, RESUMELIVRE, STOCKLIVRE, "
                    + "DATESORTIE, POIDSLIVRE, COMMENTAIRELIVRE) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, livre.getcodeISBN());
            stmt.setString(2, livre.getNomEditeur());
            stmt.setString(3, livre.getNomCategorie());
            stmt.setInt(4, livre.getIdStatut());
            stmt.setString(5, livre.getNomTaxe());
            stmt.setString(6, livre.getNomLivre());
            stmt.setString(7, livre.getSousTitre());
            stmt.setString(8, livre.getCouvLivre());
            stmt.setString(9, livre.getResumeLivre());
            stmt.setInt(10, livre.getStockLivre());
            stmt.setDate(11, livre.getDateSortie());
            stmt.setFloat(12, livre.getPoidsLivre());
            stmt.setString(13, livre.getCommentaireLivre());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionLivre.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getErrorCode());
        }
    }

    public ResultSet sqlRead() {
        ResultSet rs = null;
        try {
            Statement stmt = connexion.createStatement();
            String query = "SELECT * FROM LIVRE";
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(GestionLivre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void sqlUpdate(Livre livre, String codeISBN) {
        try {
            String query = "UPDATE LIVRE SET CODEISBN=?, NOMEDITEUR=?, NOMCATEGORIE=?, IDSTATUT=?,"
                    + "NOMTAXE=?, NOMLIVRE=?, SOUSTITRE=?, COUVLIVRE=?, RESUMELIVRE=?, STOCKLIVRE=?,"
                    + "DATESORTIE=?, POIDSLIVRE=?, COMMENTAIRELIVRE=? "
                    + "WHERE CODEISBN = '" + codeISBN+"'";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, livre.getcodeISBN());
            stmt.setString(2, livre.getNomEditeur());
            stmt.setString(3, livre.getNomCategorie());
            stmt.setInt(4, livre.getIdStatut());
            stmt.setString(5, livre.getNomTaxe());
            stmt.setString(6, livre.getNomLivre());
            stmt.setString(7, livre.getSousTitre());
            stmt.setString(8, livre.getCouvLivre());
            stmt.setString(9, livre.getResumeLivre());
            stmt.setInt(10, livre.getStockLivre());
            stmt.setDate(11, livre.getDateSortie());
            stmt.setFloat(12, livre.getPoidsLivre());
            stmt.setString(13, livre.getCommentaireLivre());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionLivre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sqlDelete(Livre livre, String codeISBN) {
        try {
            Statement stmt = connexion.createStatement();
            String query = "DELETE FROM LIVRE "
                    + "WHERE CODEISBN = " + codeISBN;
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionLivre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
