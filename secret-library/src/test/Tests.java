package test;

import classe.Employe;
import classe.Livre;
import gestion.GestionLivre;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.BdDConnexion;

/**
 *
 * @author cdi311
 */
public class Tests {

    public static void main(String[] args) {
        BdDConnexion bdd = new BdDConnexion();
        Connection connexion = bdd.connectDataBase();
        Livre livre = new Livre();
        GestionLivre gl = new GestionLivre(connexion);

        livre.setcodeISBN("1245781245789");
        livre.setNomLivre("Livre test");
        livre.setSousTitre("est un livre");
        livre.setNomEditeur("Hachette");
        livre.setIdStatut(300);
        livre.setNomTaxe("Normal");
        livre.setCouvLivre("test");
        livre.setResumeLivre("test");
        livre.setStockLivre(1);
        livre.setDateSortie(new java.sql.Date(new Date().getTime()));
        livre.setCommentaireLivre("test");
        livre.setPoidsLivre(0.2f);
        livre.setNomCategorie("Esoterisme");

        gl.sqlCreate(livre);
        gl.sqlDelete(livre, "1245781245789");

        
    }

}
