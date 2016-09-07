
package classe;


public class Auteur {
    
    private int idAuteur;
    private String nomAuteur;
    private String prenomAuteur;
    
    
    public Auteur(){
        
    }        

    public Auteur(int idAuteur, String nomAuteur, String prenomAuteur) {
        this.idAuteur = idAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public int getIdAuteur() {
        return idAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    @Override
    public String toString() {
        return "Auteur{" + "idAuteur=" + idAuteur + ", nomAuteur=" + nomAuteur + ", prenomAuteur=" + prenomAuteur + '}';
    }
            
            
            
            
}
