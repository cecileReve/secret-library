
package classe;

public class Affinage {
    
    private String nomTheme;
    private String nomSousTheme;

    public Affinage() {
    }

    public Affinage(String nomTheme, String nomSousTheme) {
        this.nomTheme = nomTheme;
        this.nomSousTheme = nomSousTheme;
    }

    public String getNomTheme() {
        return nomTheme;
    }

    public void setNomTheme(String nomTheme) {
        this.nomTheme = nomTheme;
    }

    public String getNomSousTheme() {
        return nomSousTheme;
    }

    public void setNomSousTheme(String nomSousTheme) {
        this.nomSousTheme = nomSousTheme;
    }
    
    
}
