package classe;

import java.sql.Timestamp;

public class Commande {
    private int idCommande;
    private String codeTransporteur;
    private int idAdresseLivraison;
    private int idAdresseFacturation;
    private int idClient;
    private int idStatut;
    private Timestamp dateCommande;
    private String ipCommande;
    private String numeroTransaction;
    private String commentaireCommande;

    public Commande() {
        this.dateCommande = new Timestamp(new java.util.Date().getTime());
    }

    public Commande(int idCommande, String codeTransporteur, int idAdresseLivraison, int idAdresseFacturation, int idClient, int idStatut, Timestamp dateCommande, String ipCommande, String numeroTransaction) {
        this.idCommande = idCommande;
        this.codeTransporteur = codeTransporteur;
        this.idAdresseLivraison = idAdresseLivraison;
        this.idAdresseFacturation = idAdresseFacturation;
        this.idClient = idClient;
        this.idStatut = idStatut;
        this.dateCommande = new Timestamp(new java.util.Date().getTime());
        this.ipCommande = ipCommande;
        this.numeroTransaction = numeroTransaction;
    }

    public Commande(int idCommande, String codeTransporteur, int idAdresseLivraison, int idAdresseFacturation, int idClient, int idStatut, Timestamp dateCommande, String ipCommande, String numeroTransaction, String commentaireCommande) {
        this.idCommande = idCommande;
        this.codeTransporteur = codeTransporteur;
        this.idAdresseLivraison = idAdresseLivraison;
        this.idAdresseFacturation = idAdresseFacturation;
        this.idClient = idClient;
        this.idStatut = idStatut;
        this.dateCommande = new Timestamp(new java.util.Date().getTime());
        this.ipCommande = ipCommande;
        this.numeroTransaction = numeroTransaction;
        this.commentaireCommande = commentaireCommande;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public String getCodeTransporteur() {
        return codeTransporteur;
    }

    public void setCodeTransporteur(String codeTransporteur) {
        this.codeTransporteur = codeTransporteur;
    }

    public int getIdAdresseLivraison() {
        return idAdresseLivraison;
    }

    public void setIdAdresseLivraison(int idAdresseLivraison) {
        this.idAdresseLivraison = idAdresseLivraison;
    }

    public int getIdAdresseFacturation() {
        return idAdresseFacturation;
    }

    public void setIdAdresseFacturation(int idAdresseFacturation) {
        this.idAdresseFacturation = idAdresseFacturation;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public Timestamp getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Timestamp dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getIpCommande() {
        return ipCommande;
    }

    public void setIpCommande(String ipCommande) {
        this.ipCommande = ipCommande;
    }

    public String getNumeroTransaction() {
        return numeroTransaction;
    }

    public void setNumeroTransaction(String numeroTransaction) {
        this.numeroTransaction = numeroTransaction;
    }

    public String getCommantaireCommande() {
        return commentaireCommande;
    }

    public void setCommantaireCommande(String commentaireCommande) {
        this.commentaireCommande = commentaireCommande;
    }

    @Override
    public String toString() {
        return "Commande{" + "idCommande=" + idCommande + ", codeTransporteur=" + codeTransporteur + ", idAdresseLivraison=" + idAdresseLivraison + ", idAdresseFacturation=" + idAdresseFacturation + ", idClient=" + idClient + ", idStatut=" + idStatut + ", dateCommande=" + dateCommande + ", ipCommande=" + ipCommande + ", numéroTransaction=" + numeroTransaction + ", commentaireCommande=" + commentaireCommande + '}';
    }
    
    public void annulerCommmande() {
        this.idStatut = 205;
    }
}
