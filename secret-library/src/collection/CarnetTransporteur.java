package collection;

import classe.Transporteur;
import java.util.HashMap;
import java.util.Vector;

public class CarnetTransporteur {
    private HashMap modificationTransporteur = new HashMap();
    private Vector carnetTransporteur = new Vector();

    public CarnetTransporteur() {
    }

    public HashMap getModificationTransporteur() {
        return modificationTransporteur;
    }

    public void setModificationTransporteur(Transporteur transporteur) {
      modificationTransporteur.put(transporteur.getCodeTransporteur(), transporteur);
    }

    public Vector getCarnetTransporteur() {
        return carnetTransporteur;
    }

    public void setCarnetTransporteur(Transporteur transporteur) {
        carnetTransporteur.add(transporteur);
    }
    
    
}
