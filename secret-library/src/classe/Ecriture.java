
package classe;


public class Ecriture {
    
    private int idAuteur;
    private String codeISBN;
    
    public Ecriture(){
        
    }

    public Ecriture(int idAuteur, String codeISBN) {
        this.idAuteur = idAuteur;
        this.codeISBN = codeISBN;
    }
    
  
    public int getIdAuteur() {
        return idAuteur;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    @Override
    public String toString() {
        return "Ecriture{" + "idAuteur=" + idAuteur + ", codeISBN=" + codeISBN + '}';
    }
    
}
