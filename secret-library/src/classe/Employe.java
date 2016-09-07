package classe;

import java.sql.Date;

/**
 *
 * @author cdi311
 */
public class Employe {
    
    private String numSecuEmploye;
    private String nomEmploye;
    private String prenomEmploye;
    private Date dateNaissanceEmploye;
    private String telEmploye;
    private String mailEmploye;
    private String loginEmploye;
    private String mdpEmploye;
    private String commentaireEmploye;

    public Employe(String numSecuEmploye) {
        this.numSecuEmploye = numSecuEmploye;
    }

    public String getNumSecuEmploye() {
        return numSecuEmploye;
    }

    public void setNumSecuEmploye(String numSecuEmploye) {
        this.numSecuEmploye = numSecuEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public Date getDateNaissanceEmploye() {
        return dateNaissanceEmploye;
    }

    public void setDateNaissanceEmploye(Date dateNaissanceEmploye) {
        this.dateNaissanceEmploye = dateNaissanceEmploye;
    }

    public String getTelEmploye() {
        return telEmploye;
    }

    public void setTelEmploye(String telEmploye) {
        this.telEmploye = telEmploye;
    }

    public String getMailEmploye() {
        return mailEmploye;
    }

    public void setMailEmploye(String mailEmploye) {
        this.mailEmploye = mailEmploye;
    }

    public String getLoginEmploye() {
        return loginEmploye;
    }

    public void setLoginEmploye(String loginEmploye) {
        this.loginEmploye = loginEmploye;
    }

    public String getMdpEmploye() {
        return mdpEmploye;
    }

    public void setMdpEmploye(String mdpEmploye) {
        this.mdpEmploye = mdpEmploye;
    }

    public String getCommentaireEmploye() {
        return commentaireEmploye;
    }

    public void setCommentaireEmploye(String commentaireEmploye) {
        this.commentaireEmploye = commentaireEmploye;
    }

}
