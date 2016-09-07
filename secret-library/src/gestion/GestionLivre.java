package gestion;

import java.sql.Connection;

/**
 *
 * @author cdi311
 */
public class GestionLivre {
    
    private Connection connexion;

    public GestionLivre(Connection connexion) {
        this.connexion = connexion;
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }
    
    /* TODO
     * question existentielle : modifier Livre pour lui ajouter Vector<Auteur> 
     * ou bien laisser tel quel et créer les différents objets en fonction des besoins
     */

}
