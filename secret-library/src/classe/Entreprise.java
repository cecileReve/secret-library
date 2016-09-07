package classe;

/**
 *
 * @author cdi311
 */
public class Entreprise {

    private int idEntreprise;
    private String nomEntreprise;
    private String siretEntreprise;
    private String logoEntreprise;

    public Entreprise() {
    }

    public int getIdEntreprise() {
        return idEntreprise;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getSiretEntreprise() {
        return siretEntreprise;
    }

    public void setSiretEntreprise(String siretEntreprise) {
        this.siretEntreprise = siretEntreprise;
    }

    public String getLogoEntreprise() {
        return logoEntreprise;
    }

    public void setLogoEntreprise(String logoEntreprise) {
        this.logoEntreprise = logoEntreprise;
    }

}
