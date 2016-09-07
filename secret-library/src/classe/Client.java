package classe;

import java.sql.Date;

/**
 *
 * @author cdi311
 */
public class Client {
    
    private int idClient;
    private int idStatut;
    private String nomClient;
    private String prenomClient;
    private String telClient;
    private Date naissanceClient;
    private String emailClient;
    private String mdpClient;
    private Date dateInscription;
    private Date dateDesinscription;
    private String commentaireClient;
    
    public Client() {
        this.dateInscription = new java.sql.Date(new java.util.Date().getTime());
    }

    public Client(int idClient, int idStatut, String nomClient, String prenomClient, String telClient, Date naissanceClient, String emailClient, String mdpClient, Date dateInscription, Date dateDesinscription) {
        this.idClient = idClient;
        this.idStatut = idStatut;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.telClient = telClient;
        this.naissanceClient = naissanceClient;
        this.emailClient = emailClient;
        this.mdpClient = mdpClient;
        this.dateInscription = new java.sql.Date(new java.util.Date().getTime());
        this.dateDesinscription = dateDesinscription;
        this.commentaireClient = commentaireClient;
    }
    
    

    public int getIdClient() {
        return idClient;
    }

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getTelClient() {
        return telClient;
    }

    public void setTelClient(String telClient) {
        this.telClient = telClient;
    }

    public Date getNaissanceClient() {
        return naissanceClient;
    }

    public void setNaissanceClient(Date naissanceClient) {
        this.naissanceClient = naissanceClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getMdpClient() {
        return mdpClient;
    }

    public String getCommentaireClient() {
        return commentaireClient;
    }

    public void setCommentaireClient(String commentaireClient) {
        this.commentaireClient = commentaireClient;
    }

    
    public void setMdpClient(String mdpClient) {
        this.mdpClient = mdpClient;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public Date getDateDesinscription() {
        return dateDesinscription;
    }
    
    public void supprimerClient() {
        this.idStatut = 101;
        this.dateDesinscription = new java.sql.Date(new java.util.Date().getTime());
    }
    
    
    
}
