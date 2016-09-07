
package classe;


public class DetailPanier {
    
    private int idDetailPanier;
    private int idPanier;
    private String codeISBN;
    private int quantiteDetailPanier;
    
    public DetailPanier(){
        
    }
    
    public DetailPanier(int idDetailPanier, int idPanier, String codeISBN, int quantiteDetailPanier) {
        this.idDetailPanier = idDetailPanier;
        this.idPanier = idPanier;
        this.codeISBN = codeISBN;
        this.quantiteDetailPanier = quantiteDetailPanier;
    }

    public int getIdDetailPanier() {
        return idDetailPanier;
    }

    public int getIdPanier() {
        return idPanier;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public int getQuantiteDetailPanier() {
        return quantiteDetailPanier;
    }

    public void setQuantiteDetailPanier(int quantiteDetailPanier) {
        this.quantiteDetailPanier = quantiteDetailPanier;
    }
    
    
    
    
}
