/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.livre;

import classe.Auteur;
import classe.Editeur;
import gestion.GestionLivre;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import util.BdDConnexion;

/**
 *
 * @author Puteaux
 */
public class AjouterLivre extends javax.swing.JDialog {

    private Connection connexion = null;
    private BdDConnexion bdDConnexion = new BdDConnexion();
    private GestionLivre gestion;
    private Vector<Auteur> auteurs = new Vector();
    private Editeur editeur;

    public Vector<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(Vector<Auteur> auteurs) {
        this.auteurs = auteurs;
    }

      //remplacé par du code qui fait la meme chose dans le constructeur de la jlist
//    public DefaultListModel initListeAuteur() {
//        return new DefaultListModel();
//    }

    /**
     * Creates new form AjouterLivre
     */
    public AjouterLivre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        connexion = bdDConnexion.connectDataBase();
        gestion = new GestionLivre(connexion);
        initComponents();
    }
//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAjouterLivre = new javax.swing.JLabel();
        labelCodeISBN = new javax.swing.JLabel();
        labelNomLivre = new javax.swing.JLabel();
        labelSousTitre = new javax.swing.JLabel();
        labeldateSortie = new javax.swing.JLabel();
        labelPoids = new javax.swing.JLabel();
        labelStatut = new javax.swing.JLabel();
        labelStock = new javax.swing.JLabel();
        labelCouvLivre = new javax.swing.JLabel();
        labelResumeLivre = new javax.swing.JLabel();
        labelCommentaireLivre = new javax.swing.JLabel();
        labelNomTaxe = new javax.swing.JLabel();
        labelEditeur = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        labelAuteur = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        listeAuteur = new javax.swing.JList(new DefaultListModel());
        labelTheme = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        labelSousTheme = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        boutonValider = new javax.swing.JButton();
        boutonAjouterAuteurLivre = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        boutonSupprimerAuteurLivre = new javax.swing.JButton();
        boutonChoisirEditeur = new javax.swing.JButton();
        boutonChoisirCategorie = new javax.swing.JButton();
        labelCategorie = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        labelNomEditeur = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelMotClef = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        labelAjouterLivre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAjouterLivre.setText("Ajouter un livre");
        getContentPane().add(labelAjouterLivre);
        labelAjouterLivre.setBounds(460, 20, 150, 40);

        labelCodeISBN.setText("ISBN");
        getContentPane().add(labelCodeISBN);
        labelCodeISBN.setBounds(80, 90, 30, 16);

        labelNomLivre.setText("Titre");
        getContentPane().add(labelNomLivre);
        labelNomLivre.setBounds(80, 130, 30, 16);

        labelSousTitre.setText("Sous-titre");
        getContentPane().add(labelSousTitre);
        labelSousTitre.setBounds(50, 170, 60, 16);

        labeldateSortie.setText("Date de sortie");
        getContentPane().add(labeldateSortie);
        labeldateSortie.setBounds(30, 210, 80, 16);

        labelPoids.setText("Poids");
        getContentPane().add(labelPoids);
        labelPoids.setBounds(610, 130, 40, 16);

        labelStatut.setText("Statut");
        getContentPane().add(labelStatut);
        labelStatut.setBounds(610, 90, 50, 16);

        labelStock.setText("Stock");
        getContentPane().add(labelStock);
        labelStock.setBounds(70, 370, 40, 16);

        labelCouvLivre.setText("Couverture");
        getContentPane().add(labelCouvLivre);
        labelCouvLivre.setBounds(40, 330, 70, 16);

        labelResumeLivre.setText("Resume");
        getContentPane().add(labelResumeLivre);
        labelResumeLivre.setBounds(50, 450, 60, 16);

        labelCommentaireLivre.setText("Commentaire");
        getContentPane().add(labelCommentaireLivre);
        labelCommentaireLivre.setBounds(570, 200, 80, 16);

        labelNomTaxe.setText("Taxe applicable");
        getContentPane().add(labelNomTaxe);
        labelNomTaxe.setBounds(560, 170, 100, 16);

        labelEditeur.setText("Editeur");
        getContentPane().add(labelEditeur);
        labelEditeur.setBounds(60, 250, 50, 16);

        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 80, 310, 30);

        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(120, 120, 310, 30);

        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(120, 160, 307, 30);

        jScrollPane4.setViewportView(jTextPane4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(120, 200, 307, 30);

        jScrollPane5.setViewportView(jTextPane5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(660, 120, 307, 30);

        jScrollPane6.setViewportView(jTextPane6);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(660, 80, 307, 30);

        jScrollPane7.setViewportView(jTextPane7);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(120, 360, 307, 30);

        jScrollPane8.setViewportView(jTextPane8);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(120, 320, 307, 30);

        jScrollPane10.setViewportView(jTextPane10);

        getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(660, 160, 306, 30);

        labelAuteur.setText("Auteur(s)");
        getContentPane().add(labelAuteur);
        labelAuteur.setBounds(60, 590, 60, 16);

        jScrollPane13.setViewportView(listeAuteur);

        getContentPane().add(jScrollPane13);
        jScrollPane13.setBounds(120, 580, 314, 102);

        labelTheme.setText("Theme");
        getContentPane().add(labelTheme);
        labelTheme.setBounds(610, 290, 39, 16);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane14.setViewportView(jList2);

        getContentPane().add(jScrollPane14);
        jScrollPane14.setBounds(660, 280, 305, 102);

        labelSousTheme.setText("Sous-Theme");
        getContentPane().add(labelSousTheme);
        labelSousTheme.setBounds(580, 430, 80, 16);

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane15.setViewportView(jList3);

        getContentPane().add(jScrollPane15);
        jScrollPane15.setBounds(660, 430, 305, 102);

        boutonValider.setText("Valider");
        boutonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonValiderActionPerformed(evt);
            }
        });
        getContentPane().add(boutonValider);
        boutonValider.setBounds(460, 730, 130, 60);

        boutonAjouterAuteurLivre.setText("Ajouter");
        boutonAjouterAuteurLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterAuteurLivreActionPerformed(evt);
            }
        });
        getContentPane().add(boutonAjouterAuteurLivre);
        boutonAjouterAuteurLivre.setBounds(120, 680, 71, 32);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);
        jButton3.setBounds(660, 380, 77, 32);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);
        jButton4.setBounds(660, 530, 77, 32);

        jButton5.setText("jButton5");
        getContentPane().add(jButton5);
        jButton5.setBounds(890, 530, 77, 32);

        jButton6.setText("jButton6");
        getContentPane().add(jButton6);
        jButton6.setBounds(890, 380, 77, 32);

        boutonSupprimerAuteurLivre.setText("Supprimer");
        boutonSupprimerAuteurLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSupprimerAuteurLivreActionPerformed(evt);
            }
        });
        getContentPane().add(boutonSupprimerAuteurLivre);
        boutonSupprimerAuteurLivre.setBounds(337, 680, 100, 32);

        boutonChoisirEditeur.setText("Choisir");
        boutonChoisirEditeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonChoisirEditeurActionPerformed(evt);
            }
        });
        getContentPane().add(boutonChoisirEditeur);
        boutonChoisirEditeur.setBounds(350, 240, 80, 32);

        boutonChoisirCategorie.setText("Choisir");
        getContentPane().add(boutonChoisirCategorie);
        boutonChoisirCategorie.setBounds(350, 280, 84, 32);

        labelCategorie.setText("Categorie");
        getContentPane().add(labelCategorie);
        labelCategorie.setBounds(50, 290, 60, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane11.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane11);
        jScrollPane11.setBounds(120, 440, 310, 120);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane9.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(660, 200, 310, 60);

        labelNomEditeur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomEditeur.setText("Choisir un editeur");
        labelNomEditeur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelNomEditeur);
        labelNomEditeur.setBounds(120, 240, 220, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choisir une catégorie");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 280, 220, 30);

        labelMotClef.setText("Mot-Clef");
        getContentPane().add(labelMotClef);
        labelMotClef.setBounds(600, 580, 50, 16);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane12.setViewportView(jList1);

        getContentPane().add(jScrollPane12);
        jScrollPane12.setBounds(660, 580, 310, 90);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 670, 77, 32);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(890, 670, 77, 32);

        setSize(new java.awt.Dimension(1077, 858));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //ouvre la fenetre pour ajouter un auteur au livre
    //recupere l'auteur selectionne quand la fenetre se ferme et l'ajoute au listeauteur model
    private void boutonAjouterAuteurLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjouterAuteurLivreActionPerformed
        // TODO add your handling code here:
        AjouterAuteur ajouter = new AjouterAuteur(null, true);
        ajouter.setVisible(true);
        if (ajouter.getAuteur() != null) {
//            auteurs.add(ajouter.getAuteur());
            ((DefaultListModel)listeAuteur.getModel()).addElement(ajouter.getAuteur());
        }
//        System.out.println(auteurs);
    }//GEN-LAST:event_boutonAjouterAuteurLivreActionPerformed

    //utilisé pour mettre à jour le vecteur dans la v1
    //maintenant en reconversion si on peut faire sans vecteur
    //zone d'essai de nouvelles idees
    //tiens, on peut parcourir un modelList comme un tableau et recup ses objets....
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
//        listeAuteur.setModel(initListeAuteur());
        for(int i =0; i < listeAuteur.getModel().getSize(); i++) {
            System.out.println(listeAuteur.getModel().getElementAt(i));
            System.out.println(listeAuteur.getModel().getElementAt(i).getClass());
        }
    }//GEN-LAST:event_formWindowGainedFocus

    //ferme la fenetre d'ajout de livre
    //doit appeler les updates de toutes les tables necessaires (livre - ecriture etc)
    private void boutonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_boutonValiderActionPerformed

    //retire l'auteur selectionne de listeauteur model
    private void boutonSupprimerAuteurLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSupprimerAuteurLivreActionPerformed
        // TODO add your handling code here:
        if(!listeAuteur.isSelectionEmpty()) {
//            auteurs.remove(listeAuteur.getSelectedValue());
//            listeAuteur.setModel(initListeAuteur());
            ((DefaultListModel)listeAuteur.getModel()).removeElement(listeAuteur.getSelectedValue());
        }
    }//GEN-LAST:event_boutonSupprimerAuteurLivreActionPerformed

    private void boutonChoisirEditeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonChoisirEditeurActionPerformed
        // TODO add your handling code here:
        AjouterEditeur ajouter = new AjouterEditeur(null, true);
        ajouter.setVisible(true);
        if (ajouter.getEditeur() != null) {
            editeur = ajouter.getEditeur();
            labelNomEditeur.setText(editeur.toString());
        }
    }//GEN-LAST:event_boutonChoisirEditeurActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjouterLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AjouterLivre dialog = new AjouterLivre(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAjouterAuteurLivre;
    private javax.swing.JButton boutonChoisirCategorie;
    private javax.swing.JButton boutonChoisirEditeur;
    private javax.swing.JButton boutonSupprimerAuteurLivre;
    private javax.swing.JButton boutonValider;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JLabel labelAjouterLivre;
    private javax.swing.JLabel labelAuteur;
    private javax.swing.JLabel labelCategorie;
    private javax.swing.JLabel labelCodeISBN;
    private javax.swing.JLabel labelCommentaireLivre;
    private javax.swing.JLabel labelCouvLivre;
    private javax.swing.JLabel labelEditeur;
    private javax.swing.JLabel labelMotClef;
    private javax.swing.JLabel labelNomEditeur;
    private javax.swing.JLabel labelNomLivre;
    private javax.swing.JLabel labelNomTaxe;
    private javax.swing.JLabel labelPoids;
    private javax.swing.JLabel labelResumeLivre;
    private javax.swing.JLabel labelSousTheme;
    private javax.swing.JLabel labelSousTitre;
    private javax.swing.JLabel labelStatut;
    private javax.swing.JLabel labelStock;
    private javax.swing.JLabel labelTheme;
    private javax.swing.JLabel labeldateSortie;
    private javax.swing.JList listeAuteur;
    // End of variables declaration//GEN-END:variables
}
