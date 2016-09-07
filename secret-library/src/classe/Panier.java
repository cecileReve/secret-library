package classe;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author cdi311
 */
public class Panier {
    
    private int idPanier;
    private int idClient;
    private String nomPanier;
    private Timestamp datePanier;

    public Panier() {
        this.datePanier = new Timestamp(new java.util.Date().getTime());
    }

    public int getIdPanier() {
        return idPanier;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomPanier() {
        return nomPanier;
    }

    public void setNomPanier(String nomPanier) {
        this.nomPanier = nomPanier;
    }

    public Timestamp getDatePanier() {
        return datePanier;
    }

    public void setDatePanier(Timestamp datePanier) {
        this.datePanier = datePanier;
    }

}
