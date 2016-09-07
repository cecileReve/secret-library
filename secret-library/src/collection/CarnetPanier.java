
package collection;

import classe.Livre;
import java.util.HashMap;
import java.util.Vector;

public class CarnetPanier {
    
    private Vector CarnetPanier = new Vector();
        
    public CarnetPanier(){
        
    }
    
    public Vector getCarnetPanier(){
        return CarnetPanier;
    }
    
    public void setCarnetPanier(Livre livre){
        CarnetPanier.add(livre);
    }
    
    
   private HashMap modificationPanier = new HashMap();

    public HashMap getModificationPanier() {
        return modificationPanier;
    }

    public void setModificationPanier(Livre livre) {
      modificationPanier.put(livre.getcodeISBN(), livre); 
    }
   
   
}
