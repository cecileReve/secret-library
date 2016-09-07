
package classe;

public class MotClef {
    
    private String nomMotClef;

    public MotClef() {
    }

    public MotClef(String nomMotClef) {
        this.nomMotClef = nomMotClef;
    }

    public String getNomMotClef() {
        return nomMotClef;
    }

    public void setNomMotClef(String nomMotClef) {
        this.nomMotClef = nomMotClef;
    }

    @Override
    public String toString() {
        return "MotClef{" + "nomMotClef=" + nomMotClef + '}';
    }
    
    public void modifierMotClef(String nomMotClef){
        setNomMotClef(nomMotClef);
    }
    
}
