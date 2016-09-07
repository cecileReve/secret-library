package classe;

public class Statut {
    private int idStatut;
    private String libelleStatut;
    private String commentaireStatut;

    public Statut() {
    }

    public Statut(int idStatut, String libelleStatut) {
        this.idStatut = idStatut;
        this.libelleStatut = libelleStatut;
    }

    public Statut(int idStatut, String libelleStatut, String commentaireStatut) {
        this.idStatut = idStatut;
        this.libelleStatut = libelleStatut;
        this.commentaireStatut = commentaireStatut;
    }

    public String getCommentaireStatut() {
        return commentaireStatut;
    }

    public void setCommentaireStatut(String commentaireStatut) {
        this.commentaireStatut = commentaireStatut;
    }

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public String getLibelleStatut() {
        return libelleStatut;
    }

    public void setLibelleStatut(String libelleStatut) {
        this.libelleStatut = libelleStatut;
    }

    @Override
    public String toString() {
        return "Statut{" + "idStatut=" + idStatut + ", libelleStatut=" + libelleStatut + ", commentaireStatut=" + commentaireStatut + '}';
    }
    
    
}
