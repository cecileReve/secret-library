package collection;

import classe.Adresse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Annuaire {

    private HashMap modificationAdresse = new HashMap();
    private Vector annuaire = new Vector();

    public Annuaire() {
    }

    public HashMap getModificationAdresse() {
        return modificationAdresse;
    }

    public void ajouterModificationAdresse(Adresse adresse) {
        modificationAdresse.put(adresse.getIdAdresse(), adresse);
    }

    public Vector getAnnuaire() {
        return annuaire;
    }

    public void setModificationAdresse(HashMap modificationAdresse) {
        this.modificationAdresse = modificationAdresse;
    }

    public void setAnnuaire(Vector annuaire) {
        this.annuaire = annuaire;
    }

    public void ajouterAnnuaire(Adresse adresse) {
        annuaire.add(adresse);
    }

    /**
     * renvoie un vecteur de commandes a partir de la base de donnees
     *
     * @param connexion une connexion a une base de donnees
     * @return un vecteur de commandes
     */
    public Vector<Adresse> chargerAdresse(Connection connexion) {

        Vector<Adresse> adresses = new Vector<>();
        Statement stmt;
        ResultSet rs;

        try {
            stmt = connexion.createStatement();
            String query = "SELECT * FROM commande";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                adresses.add(
                        new Adresse(
                                rs.getInt("idAdresse"),
                                rs.getString("numAdresse"),
                                rs.getString("rueAdresse"),
                                rs.getString("codePostal"),
                                rs.getString("ville"),
                                rs.getString("cptAdresse"),
                                rs.getString("paysAdresse"),
                                rs.getString("commentaireAdresse")));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarnetCommande.class.getName()).log(Level.SEVERE, null, ex);
        }

        return adresses;
    }

}
