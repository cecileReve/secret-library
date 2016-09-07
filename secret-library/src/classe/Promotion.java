
package classe;


public class Promotion {
    
    private int idEvenement;
    private String codeISBN;
    
    public Promotion(){
        
    }

    public Promotion(int idEvenement, String codeISBN) {
        this.idEvenement = idEvenement;
        this.codeISBN = codeISBN;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    @Override
    public String toString() {
        return "Promotion{" + "idEvenement=" + idEvenement + ", codeISBN=" + codeISBN + '}';
    }
    
    
    
}
