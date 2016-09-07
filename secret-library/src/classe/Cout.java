
package classe;


public class Cout {
    
    private String codeISBN;
    private int idPrix;
    
    
    public Cout(){
        
    }

    public Cout(String codeISBN, int idPrix) {
        this.codeISBN = codeISBN;
        this.idPrix = idPrix;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public int getIdPrix() {
        return idPrix;
    }

    @Override
    public String toString() {
        return "Cout{" + "codeISBN=" + codeISBN + ", idPrix=" + idPrix + '}';
    }
    
    
    
}
