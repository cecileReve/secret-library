package classe;

public class DetailCommande {
    private int idDetailCommande;
    private String codeISBN;
    private int idCommande;
    private int idEvenement;
    private int quantiteDetailCommande;
    private float prixHTDetailCommande;
    private float tauxTVADetailCommande;

    public DetailCommande() {
    }

    public DetailCommande(int idDetailCommande, String codeISBN, int idCommande, int quantiteDetailCommande, float prixHTDetailCommande, float tauxTVADetailCommande) {
        this.idDetailCommande = idDetailCommande;
        this.codeISBN = codeISBN;
        this.idCommande = idCommande;
        this.quantiteDetailCommande = quantiteDetailCommande;
        this.prixHTDetailCommande = prixHTDetailCommande;
        this.tauxTVADetailCommande = tauxTVADetailCommande;
    }

    public DetailCommande(int idDetailCommande, String codeISBN, int idCommande, int idEvenement, int quantiteDetailCommande, float prixHTDetailCommande, float tauxTVADetailCommande) {
        this.idDetailCommande = idDetailCommande;
        this.codeISBN = codeISBN;
        this.idCommande = idCommande;
        this.idEvenement = idEvenement;
        this.quantiteDetailCommande = quantiteDetailCommande;
        this.prixHTDetailCommande = prixHTDetailCommande;
        this.tauxTVADetailCommande = tauxTVADetailCommande;
    }

    public float getTauxTVADetailCommande() {
        return tauxTVADetailCommande;
    }

    public void setTauxTVADetailCommande(float tauxTVADetailCommande) {
        this.tauxTVADetailCommande = tauxTVADetailCommande;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public int getQuantiteDetailCommande() {
        return quantiteDetailCommande;
    }

    public void setQuantiteDetailCommande(int quantiteDetailCommande) {
        this.quantiteDetailCommande = quantiteDetailCommande;
    }

    public float getPrixHTDetailCommande() {
        return prixHTDetailCommande;
    }

    public void setPrixHTDetailCommande(float prixHTDetailCommande) {
        this.prixHTDetailCommande = prixHTDetailCommande;
    }

    public int getIdDetailCommande() {
        return idDetailCommande;
    }

    public void setIdDetailCommande(int idDetailCommande) {
        this.idDetailCommande = idDetailCommande;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(String codeISBN) {
        this.codeISBN = codeISBN;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    @Override
    public String toString() {
        return "DetailCommande{" + "idDetailCommande=" + idDetailCommande + ", codeISBN=" + codeISBN + ", idCommande=" + idCommande + ", idEvenement=" + idEvenement + ", quantiteDetailCommande=" + quantiteDetailCommande + ", prixHTDetailCommande=" + prixHTDetailCommande + ", tauxTVADetailCommande=" + tauxTVADetailCommande + '}';
    }
    
    
}
