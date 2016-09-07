package collection;

import classe.Employe;
import java.util.HashMap;
import java.util.Vector;

public class CarnetEmployes {
    private HashMap modificationEmployes = new HashMap();
    private Vector carnetEmployes = new Vector();

    public CarnetEmployes() {
    }

    public HashMap getModificationEmployes() {
        return modificationEmployes;
    }

    public void setModificationEmployes(Employe employe) {
        modificationEmployes.put(employe.getNumSecuEmploye(), employe);
    }

    public Vector getCarnetEmployes() {
        return carnetEmployes;
    }

    public void setCarnetEmployes(Employe employe) {
        carnetEmployes.add(employe);
    }
    
    
}
