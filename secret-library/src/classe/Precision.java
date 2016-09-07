
package classe;

public class Precision {
    
    private String nomSousTheme;
    private String codeISBN;

    public Precision() {
    }

    public Precision(String nomSousTheme, String codeISBN) {
        this.nomSousTheme = nomSousTheme;
        this.codeISBN = codeISBN;
    }

    public String getNomSousTheme() {
        return nomSousTheme;
    }

    public void setNomSousTheme(String nomSousTheme) {
        this.nomSousTheme = nomSousTheme;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(String codeISBN) {
        this.codeISBN = codeISBN;
    }
    
    
    
}
