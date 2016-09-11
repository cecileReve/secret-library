
package classe;

public class Editeur {
    
    private String nomEditeur;

    public Editeur() {
    }

    public Editeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    @Override
    public String toString() {
        return nomEditeur;
    }
    public void modifierEditeur(String nomEditeur){
        setNomEditeur(nomEditeur);
    }
}
