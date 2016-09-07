package classe;

import java.sql.Timestamp;

/**
 *
 * @author cdi311
 */
public class EnregistrementLivraison {
    
    private int idClient;
    private int idAdresse;
    private Timestamp dateEnregistrementLivraison;

    public EnregistrementLivraison() {
        this.dateEnregistrementLivraison = new Timestamp(new java.util.Date().getTime());
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    public Timestamp getDateEnregistrementLivraison() {
        return dateEnregistrementLivraison;
    }

    public void setDateEnregistrementLivraison(Timestamp dateEnregistrementLivraison) {
        this.dateEnregistrementLivraison = dateEnregistrementLivraison;
    }

}
