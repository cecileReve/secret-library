package classe;

public class Categorie {
    
    private String nomCategorie;

    public Categorie() {
    }

    public Categorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    @Override
    public String toString() {
        return "Categorie{" + "nomCategorie=" + nomCategorie + '}';
    }
    
    public void modifierEditeur(String nomCategorie){
        setNomCategorie(nomCategorie);
    }
    
}
