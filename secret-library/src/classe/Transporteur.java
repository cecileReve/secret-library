package classe;

public class Transporteur {
   private String codeTransporteur;
   private String nomTransporteur;

    public Transporteur() {
    }

    public Transporteur(String codeTransporteur, String nomTransporteur) {
        this.codeTransporteur = codeTransporteur;
        this.nomTransporteur = nomTransporteur;
    }

    public String getNomTransporteur() {
        return nomTransporteur;
    }

    public void setNomTransporteur(String nomTransporteur) {
        this.nomTransporteur = nomTransporteur;
    }

    public String getCodeTransporteur() {
        return codeTransporteur;
    }

    public void setCodeTransporteur(String codeTransporteur) {
        this.codeTransporteur = codeTransporteur;
    }

    @Override
    public String toString() {
        return "Transporteur{" + "codeTransporteur=" + codeTransporteur + ", nomTransporteur=" + nomTransporteur + '}';
    }
}
