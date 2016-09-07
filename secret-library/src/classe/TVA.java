package classe;

public class TVA {
    private String nomTaxe;
    private float tauxTVA;

    public TVA() {
    }

    public TVA(String nomTaxe, float tauxTVA) {
        this.nomTaxe = nomTaxe;
        this.tauxTVA = tauxTVA;
    }

    public float getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(float tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public String getNomTaxe() {
        return nomTaxe;
    }

    public void setNomTaxe(String nomTaxe) {
        this.nomTaxe = nomTaxe;
    }

    @Override
    public String toString() {
        return "TVA{" + "nomTaxe=" + nomTaxe + ", tauxTVA=" + tauxTVA + '}';
    }
}
