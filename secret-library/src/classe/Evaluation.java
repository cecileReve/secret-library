package classe;

public class Evaluation {
    private int idEvaluation;
    private int idDetailCommande;
    private int idClient;
    private String codeISBN;
    private float noteEvaluation;
    private String commentaireEvaluation;

    public Evaluation() {
    }

    public Evaluation(int idEvaluation, int idDetailCommande, int idClient, String codeISBN, float noteEvaluation) {
        this.idEvaluation = idEvaluation;
        this.idDetailCommande = idDetailCommande;
        this.idClient = idClient;
        this.codeISBN = codeISBN;
        this.noteEvaluation = noteEvaluation;
    }

    public Evaluation(int idEvaluation, int idDetailCommande, int idClient, String codeISBN, float noteEvaluation, String commentaireEvaluation) {
        this.idEvaluation = idEvaluation;
        this.idDetailCommande = idDetailCommande;
        this.idClient = idClient;
        this.codeISBN = codeISBN;
        this.noteEvaluation = noteEvaluation;
        this.commentaireEvaluation = commentaireEvaluation;
    }

    public String getCommentaireEvaluation() {
        return commentaireEvaluation;
    }

    public void setCommentaireEvaluation(String commentaireEvaluation) {
        this.commentaireEvaluation = commentaireEvaluation;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public int getIdDetailCommande() {
        return idDetailCommande;
    }

    public void setIdDetailCommande(int idDetailCommande) {
        this.idDetailCommande = idDetailCommande;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(String codeISBN) {
        this.codeISBN = codeISBN;
    }

    public float getNoteEvaluation() {
        return noteEvaluation;
    }

    public void setNoteEvaluation(float noteEvaluation) {
        this.noteEvaluation = noteEvaluation;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "idEvaluation=" + idEvaluation + ", idDetailCommande=" + idDetailCommande + ", idClient=" + idClient + ", codeISBN=" + codeISBN + ", noteEvaluation=" + noteEvaluation + ", commentaireEvaluation=" + commentaireEvaluation + '}';
    }
}
