
package classe;

public class SousTheme {
    
    private String nomSousTheme;

    public SousTheme() {
    }

    public SousTheme(String nomSousTheme) {
        this.nomSousTheme = nomSousTheme;
    }

    public String getNomSousTheme() {
        return nomSousTheme;
    }

    public void setNomSousTheme(String nomSousTheme) {
        this.nomSousTheme = nomSousTheme;
    }

    @Override
    public String toString() {
        return "SousTheme{" + "nomSousTheme=" + nomSousTheme + '}';
    }
    
    public void modifierSousTheme(String nomSousTheme){
        setNomSousTheme(nomSousTheme);
    }
    
}
