
package classe;

public class Theme {
    
    private String nomTheme;

    public Theme() {
    }

    public Theme(String nomTheme) {
        this.nomTheme = nomTheme;
    }

    public String getNomTheme() {
        return nomTheme;
    }

    public void setNomTheme(String nomTheme) {
        this.nomTheme = nomTheme;
    }

    @Override
    public String toString() {
        return "Theme{" + "nomTheme=" + nomTheme + '}';
    }
    
    public void modifierTheme(String nomTheme){
        setNomTheme(nomTheme);
    }
    
}
