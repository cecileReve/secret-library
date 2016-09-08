package swing;

import classe.Employe;
import gestion.GestionEmploye;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.BdDConnexion;

public class AffichageEmploye extends javax.swing.JFrame {

    private Connection connexion = null;
    private BdDConnexion bdDConnexion = new BdDConnexion();
    GestionEmploye gestion;

    public AffichageEmploye() {
        connexion = bdDConnexion.connectDataBase();
        gestion = new GestionEmploye(connexion);
        initComponents();
    }

    public Employe getSelectedEmploye() {
        int i = jTable1.getSelectedRow();
        System.out.println("i = " + i);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Employe emp = new Employe(model.getValueAt(i, 0).toString(),
                model.getValueAt(i, 1).toString(),
                model.getValueAt(i, 2).toString(),
                (Date) model.getValueAt(i, 3),
                model.getValueAt(i, 4).toString(),
                model.getValueAt(i, 5).toString(),
                model.getValueAt(i, 6).toString(),
                model.getValueAt(i, 7).toString(),
                model.getValueAt(i, 8).toString());
        System.out.println(emp);
        return emp;
    }

    private DefaultTableModel initEmploye() {
        Vector v = new Vector();
        v.add("NUMSECUEMPLOYE");
        v.add("NOMEMPLOYE");
        v.add("PRENOMEMPLOYE");
        v.add("DATENAISSANCEEMPLOYE");
        v.add("TELEMPLOYE");
        v.add("EMAILEMPLOYE");
        v.add("LOGINEMPLOYE");
        v.add("MDPEMPLOYE");
        v.add("COMMENTAIREEMPLOYE");
        return new DefaultTableModel(initVectorEmploye(), v);
    }

    private Vector initVectorEmploye() {
        ResultSet rs;
        GestionEmploye gestion = new GestionEmploye(connexion);
        rs = gestion.sqlRead();
        Vector vv = new Vector();
        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("NUMSECUEMPLOYE"));
                v.add(rs.getString("NOMEMPLOYE"));
                v.add(rs.getString("PRENOMEMPLOYE"));
                v.add(rs.getDate("DATENAISSANCEEMPLOYE"));
                v.add(rs.getString("TELEMPLOYE"));
                v.add(rs.getString("EMAILEMPLOYE"));
                v.add(rs.getString("LOGINEMPLOYE"));
                v.add(rs.getString("MDPEMPLOYE"));
                v.add(rs.getString("COMMENTAIREEMPLOYE"));
                vv.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vv;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jTable1.setModel(initEmploye());
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 11, 816, 403);

        jButton1.setText("Ajout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(123, 468, 102, 44);

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(357, 468, 86, 44);

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(580, 468, 94, 44);

        setSize(new java.awt.Dimension(908, 711));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddEmploye addE = new AddEmploye(this, true);
        addE.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jTable1.isRowSelected(jTable1.getSelectedRow())) {
            UpdateEmploye modif = new UpdateEmploye(this, true);
            System.out.println("coucou");
            modif.initChamp(getSelectedEmploye());
            modif.setEmploye(getSelectedEmploye());
            modif.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        if (jTable1.isRowSelected(jTable1.getRowCount()))
        if (jTable1.isRowSelected(jTable1.getSelectedRow())) {
            int i = jTable1.getSelectedRow();
            System.out.println("i = " + i);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String id = model.getValueAt(i, 0).toString();
            System.out.println("id = " + id);
            int confirm = JOptionPane.showConfirmDialog(this, "Confirmer suppression BDD", "Suppression Employe",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                gestion.sqlDelete(id);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        jTable1.setModel(initEmploye());
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        jTable1.setModel(initEmploye());
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(AffichageEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AffichageEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AffichageEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AffichageEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AffichageEmploye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
