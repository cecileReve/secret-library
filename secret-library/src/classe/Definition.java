
package classe;

public class Definition {
    
    private String nomMotClef;
    private String codeISBN;

    public Definition() {
    }

    public Definition(String nomMotClef, String codeISBN) {
        this.nomMotClef = nomMotClef;
        this.codeISBN = codeISBN;
    }

    public String getNomMotClef() {
        return nomMotClef;
    }

    public void setNomMotClef(String nomMotClef) {
        this.nomMotClef = nomMotClef;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(String codeISBN) {
        this.codeISBN = codeISBN;
    }
    
    
}
