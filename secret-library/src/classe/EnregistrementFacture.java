package classe;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author cdi311
 */
public class EnregistrementFacture {
    
    private int idClient;
    private int idAdresse;
    private Timestamp dateEnregistrementFacture;

    public EnregistrementFacture() {
        this.dateEnregistrementFacture = new Timestamp(new java.util.Date().getTime());
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

    public Timestamp getDateEnregistrementFacture() {
        return dateEnregistrementFacture;
    }

    public void setDateEnregistrementFacture(Timestamp dateEnregistrementFacture) {
        this.dateEnregistrementFacture = dateEnregistrementFacture;
    }
    
    

}
