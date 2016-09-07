package classe;

import java.sql.Date;

public class Livre {

    private String codeISBN;
    private String nomEditeur;
    private String nomCategorie;
    private int idStatut;
    private String nomTaxe;
    private String nomLivre;
    private String sousTitre;
    private String couvLivre;
    private String resumeLivre;
    private int stockLivre;
    private Date dateSortie;
    private float poidsLivre;
    private String commentaireLivre;

    public Livre() {
    }

    public Livre(String codeISBN, String nomEditeur, int idStatut, String nomTaxe, String nomLivre, String couvLivre, String resumeLivre, int stockLivre, Date dateSortie, float poidsLivre) {
        this.codeISBN = codeISBN;
        this.nomEditeur = nomEditeur;
        this.idStatut = idStatut;
        this.nomTaxe = nomTaxe;
        this.nomLivre = nomLivre;
        this.couvLivre = couvLivre;
        this.resumeLivre = resumeLivre;
        this.stockLivre = stockLivre;
        this.dateSortie = dateSortie;
        this.poidsLivre = poidsLivre;
    }

    public Livre(String codeISBN, String nomEditeur, String nomCategorie, int idStatut, String nomTaxe, String nomLivre, String sousTitre, String couvLivre, String resumeLivre, int stockLivre, Date dateSortie, float poidsLivre, String commentaireLivre) {
        this.codeISBN = codeISBN;
        this.nomEditeur = nomEditeur;
        this.nomCategorie = nomCategorie;
        this.idStatut = idStatut;
        this.nomTaxe = nomTaxe;
        this.nomLivre = nomLivre;
        this.sousTitre = sousTitre;
        this.couvLivre = couvLivre;
        this.resumeLivre = resumeLivre;
        this.stockLivre = stockLivre;
        this.dateSortie = dateSortie;
        this.poidsLivre = poidsLivre;
        this.commentaireLivre = commentaireLivre;
    }

    public String getcodeISBN() {
        return codeISBN;
    }

    public void setcodeISBN(String codeISBN) {
        this.codeISBN = codeISBN;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public String getNomTaxe() {
        return nomTaxe;
    }

    public void setNomTaxe(String nomTaxe) {
        this.nomTaxe = nomTaxe;
    }

    public String getNomLivre() {
        return nomLivre;
    }

    public void setNomLivre(String nomLivre) {
        this.nomLivre = nomLivre;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getCouvLivre() {
        return couvLivre;
    }

    public void setCouvLivre(String couvLivre) {
        this.couvLivre = couvLivre;
    }

    public String getResumeLivre() {
        return resumeLivre;
    }

    public void setResumeLivre(String resumeLivre) {
        this.resumeLivre = resumeLivre;
    }

    public int getStockLivre() {
        return stockLivre;
    }

    public void setStockLivre(int stockLivre) {
        this.stockLivre = stockLivre;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public float getPoidsLivre() {
        return poidsLivre;
    }

    public void setPoidsLivre(float poidsLivre) {
        this.poidsLivre = poidsLivre;
    }

    public String getCommentaireLivre() {
        return commentaireLivre;
    }

    public void setCommentaireLivre(String commentaireLivre) {
        this.commentaireLivre = commentaireLivre;
    }

    @Override
    public String toString() {
        return "Livre{" + "codeISBN=" + codeISBN + ", nomEditeur=" + nomEditeur + ", nomCategorie=" + nomCategorie + ", idStatut=" + idStatut + ", nomTaxe=" + nomTaxe + ", nomLivre=" + nomLivre + ", sousTitre=" + sousTitre + ", couvLivre=" + couvLivre + ", resumeLivre=" + resumeLivre + ", stockLivre=" + stockLivre + ", dateSortie=" + dateSortie + ", poidsLivre=" + poidsLivre + ", commentaireLivre=" + commentaireLivre + '}';
    }

}
