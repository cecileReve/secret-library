
package classe;

import java.sql.Date;


public class Prix {
    private int idPrix;
    private float montantHT;
    private Date dateMajPrix;
    
    public Prix() {
        
    }

    public Prix(int idPrix, float montantHT, Date dateMajPrix) {
        this.idPrix = idPrix;
        this.montantHT = montantHT;
        this.dateMajPrix = dateMajPrix;
    }

    public int getIdPrix() {
        return idPrix;
    }
    
    public float getMontantHT() {
        return montantHT;
    }

    public Date getDateMajPrix() {
        return dateMajPrix;
    }

    public void setMontantHT(float montantHT) {
        this.montantHT = montantHT;
    }

    public void setDateMajPrix(Date dateMajPrix) {
        this.dateMajPrix = dateMajPrix;
    }
    
    
    
}
