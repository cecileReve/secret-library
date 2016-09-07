package classe;

/**
 *
 * @author cdi311
 */
public class Adresse {
    
    private int idAdresse;
    private String numAdresse;
    private String rueAdresse;
    private String codePostal;
    private String ville;
    private String cptAdresse;
    private String paysAdresse;
    private String commentaireAdresse;

    public Adresse() {
    }
    
    
    
    public Adresse(int idAdresse, String numAdresse, String rueAdresse, String codePostal, String ville, String cptAdresse, String paysAdresse, String commentaireAdresse) {
        this.idAdresse = idAdresse;
        this.numAdresse = numAdresse;
        this.rueAdresse = rueAdresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.cptAdresse = cptAdresse;
        this.paysAdresse = paysAdresse;
        this.commentaireAdresse = commentaireAdresse;
    }


    public int getIdAdresse() {
        return idAdresse;
    }

    public String getNumAdresse() {
        return numAdresse;
    }

    public void setNumAdresse(String numAdresse) {
        this.numAdresse = numAdresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCptAdresse() {
        return cptAdresse;
    }

    public void setCptAdresse(String cptAdresse) {
        this.cptAdresse = cptAdresse;
    }

    public String getPaysAdresse() {
        return paysAdresse;
    }

    public void setPaysAdresse(String paysAdresse) {
        this.paysAdresse = paysAdresse;
    }

    public String getCommentaireAdresse() {
        return commentaireAdresse;
    }

    public void setCommentaireAdresse(String commentaireAdresse) {
        this.commentaireAdresse = commentaireAdresse;
    }

    public String getRueAdresse() {
        return rueAdresse;
    }

    public void setRueAdresse(String rueAdresse) {
        this.rueAdresse = rueAdresse;
    }
    
    

}
