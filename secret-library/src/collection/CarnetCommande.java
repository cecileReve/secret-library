
package collection;

import classe.Livre;
import classe.Commande;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CarnetCommande {
    
    private Vector CarnetCommande = new Vector();
    
    public CarnetCommande(){
        
    }
    
    public Vector getCarnetCommande(){
        return CarnetCommande;
    }

    public void setCarnetCommande(Vector CarnetCommande) {
        this.CarnetCommande = CarnetCommande;
    }
    
    private HashMap modificationCommande = new HashMap();

    public HashMap getModificationCommande() {
        return modificationCommande;
    }

    public void setModificationCommande(HashMap modificationCommande) {
        this.modificationCommande = modificationCommande;
    }
    
    public void ajouterModificationCommande(Commande commande) {
        modificationCommande.put(commande.getIdCommande(), commande);
    }
    
    public void ajouterLivreCommande(Commande commande){
        CarnetCommande.add(commande);
    }
    
    /**
     * renvoie un vecteur de commandes a partir de la base de donnees
     * @param connexion une connexion a une base de donnees
     * @return un vecteur de commandes
     */
    public Vector<Commande> chargerCommandes(Connection connexion) {
        
        Vector<Commande> commandes = new Vector<>();
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = connexion.createStatement();
            String query = "SELECT * FROM commande";
            rs = stmt.executeQuery(query);
            while(rs.next()) {
                commandes.add(new Commande(rs.getInt("idCommande"), rs.getString("codeTransporteur"), 
                        rs.getInt("idAdresseLivraison"), rs.getInt("idAdresseFacturation"), 
                        rs.getInt("idClient"), rs.getInt("idStatut"), rs.getTimestamp("dateCommande"), 
                        rs.getString("ipCommande"), rs.getString("numeroTransaction"), rs.getString("commentaireCommande")));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarnetCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        return commandes;
    }
    
    
    
    
    
}
