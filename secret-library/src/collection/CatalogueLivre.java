package collection;

import classe.Livre;
import java.util.HashMap;
import java.util.Vector;

public class CatalogueLivre {
    private HashMap modificationLivre = new HashMap();
    private Vector catalogueLivre = new Vector ();

    public CatalogueLivre() {
    }

    public HashMap getModificationLivre() {
        return modificationLivre;
    }

    public void setModificationLivre(Livre livre) {
        modificationLivre.put(livre.getcodeISBN(), livre);
    }

    public Vector getCatalogueLivre() {
        return catalogueLivre;
    }

    public void setCatalogueLivre(Livre livre) {
        catalogueLivre.add(livre);
    }
}
