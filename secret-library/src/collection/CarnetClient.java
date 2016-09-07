package collection;

import classe.Adresse;
import classe.Client;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarnetClient {

    private HashMap modificationClient = new HashMap();
    private Vector carnetClient = new Vector();

    public CarnetClient() {
    }

    public HashMap getModificationClient() {
        return modificationClient;
    }

    public Vector getCarnetClient() {
        return carnetClient;
    }

    public void ajouterCarnetClient(Client client) {
        carnetClient.add(client);
    }

    public void ajouterModificationClient(Client client) {
        modificationClient.put(client.getIdClient(), client);
    }

    public void setModificationClient(HashMap modificationClient) {
        this.modificationClient = modificationClient;
    }

    public void setCarnetClient(Vector carnetClient) {
        this.carnetClient = carnetClient;
    }

    /**
     * renvoie un vecteur de commandes a partir de la base de donnees
     *
     * @param connexion une connexion a une base de donnees
     * @return un vecteur de commandes
     */
    public Vector<Client> chargerClient(Connection connexion) {

        Vector<Client> clients = new Vector<>();
        Statement stmt;
        ResultSet rs;

        try {
            stmt = connexion.createStatement();
            String query = "SELECT * FROM commande";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                clients.add(
                        new Client(
                                rs.getInt("idClient"),
                                rs.getInt("idStatut"),
                                rs.getString("nomClient"),
                                rs.getString("prenomClient"),
                                rs.getString("telClient"),
                                rs.getDate("naissanceClient"),
                                rs.getString("emailClient"),
                                rs.getString("mdpClient"),
                                rs.getDate("dateInscription"),
                                rs.getDate("dateDesinscription")));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarnetCommande.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clients;
    }

}
