/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import classe.Employe;
import gestion.GestionEmploye;
import java.sql.Connection;
import util.BdDConnexion;

/**
 *
 * @author cdi304
 */
public class AddEmploye extends javax.swing.JDialog {

    private Connection connexion = null;
    private BdDConnexion bdDConnexion = new BdDConnexion();

    /**
     * Creates new form AddEmploye
     */
    public AddEmploye(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        connexion = bdDConnexion.connectDataBase();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCalendarDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Ajout nouvel employé");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(143, 11, 255, 28);

        jLabel2.setText("N° Sécu");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 120, 30);

        jLabel3.setText("Nom");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 120, 120, 30);

        jLabel4.setText("Prénom");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 160, 120, 30);

        jLabel5.setText("Date de Naissance");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 200, 120, 30);

        jLabel6.setText("Téléphone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 240, 120, 30);

        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 280, 120, 30);

        jLabel8.setText("Login");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 320, 120, 30);

        jLabel9.setText("Mot de Passe");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 360, 120, 30);

        jLabel10.setText("Commentaire");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 400, 120, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 80, 380, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 120, 380, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 160, 380, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(160, 240, 380, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(160, 280, 380, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(160, 320, 380, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(160, 360, 380, 30);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 480, 200, 70);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 400, 380, 70);
        getContentPane().add(jCalendarDate);
        jCalendarDate.setBounds(160, 200, 380, 29);

        setSize(new java.awt.Dimension(600, 605));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        java.sql.Date sqlDate = new java.sql.Date(jCalendarDate.getDate().getTime());
        
        GestionEmploye gestEmp = new GestionEmploye(connexion);
        Employe emp = new Employe(jTextField1.getText(),
                jTextField2.getText(),
                jTextField3.getText(),
                sqlDate,
                jTextField5.getText(),
                jTextField6.getText(),
                jTextField7.getText(),
                jTextField8.getText(),
                jTextArea1.getText());
        gestEmp.sqlCreate(emp);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddEmploye dialog = new AddEmploye(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jCalendarDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
