
package collection;

import classe.Livre;
import java.util.HashMap;
import java.util.Vector;


public class CatalogueEvenement {
    
    private Vector CatalogueEvenement = new Vector();
    
    public CatalogueEvenement(){
        
    }
    
    public Vector getCatalogueEvenement(){
        return CatalogueEvenement;
    }
    
    public void setCatalogueEvenement(Livre livre){
        CatalogueEvenement.add(livre);
    }
    
    private HashMap modificationEvenement = new HashMap();
    
    public HashMap getModificationEvenement() {
        return modificationEvenement;
    }

    public void setModificationEvenement(Livre livre) {
        modificationEvenement.put(livre.getcodeISBN(), livre);
    }
    
    
    
    
    
    
    
}
