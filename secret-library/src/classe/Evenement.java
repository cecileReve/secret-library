
package classe;

import java.sql.Date;

public class Evenement {
    
    private int idEvenement;
    private String nomEvenement;
    private int promotionEvenement;
    private String logoEvenement;
    private Date dateDebutEvenement;
    private Date dateFinEvenement;
    private String commentaireEvenement;
    
    public Evenement() {
    
    }

   

    public Evenement(int idEvenement, String nomEvenement, int promotionEvenement, String logoEvenement, Date dateDebutEvenement, Date dateFinEvenement, String commentaireEvenement) {
        this.idEvenement = idEvenement;
        this.nomEvenement = nomEvenement;
        this.promotionEvenement = promotionEvenement;
        this.logoEvenement = logoEvenement;
        this.dateDebutEvenement = dateDebutEvenement;
        this.dateFinEvenement = dateFinEvenement;
        this.commentaireEvenement = commentaireEvenement;
    }

    
    public int getIdEvenement() {
        return idEvenement;
    }
    public String getNomEvenement() {
        return nomEvenement;
    }

    public int getPromotionEvenement() {
        return promotionEvenement;
    }

    public String getLogoEvenement() {
        return logoEvenement;
    }

    public Date getDateDebutEvenement() {
        return dateDebutEvenement;
    }

    public Date getDateFinEvenement() {
        return dateFinEvenement;
    }

    public String getCommentaireEvenement() {
        return commentaireEvenement;
    }

    public void setNomEvenement(String nomEvenement) {
        this.nomEvenement = nomEvenement;
    }

    public void setPromotionEvenement(int promotionEvenement) {
        this.promotionEvenement = promotionEvenement;
    }

    public void setLogoEvenement(String logoEvenement) {
        this.logoEvenement = logoEvenement;
    }

    public void setDateDebutEvenement(Date dateDebutEvenement) {
        this.dateDebutEvenement = dateDebutEvenement;
    }

    public void setDateFinEvenement(Date dateFinEvenement) {
        this.dateFinEvenement = dateFinEvenement;
    }

    public void setCommentaireEvenement(String commentaireEvenement) {
        this.commentaireEvenement = commentaireEvenement;
    }
    
    
    
    
    
    
    
    
    
    
}
