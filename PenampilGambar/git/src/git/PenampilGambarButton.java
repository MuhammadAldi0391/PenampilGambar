/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USESR
 */
public class PenampilGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambarButton
     */
    public PenampilGambarButton() {
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

        jPanel1 = new javax.swing.JPanel();
        buttonLogo = new javax.swing.JButton();
        buttonSD = new javax.swing.JButton();
        buttonTerbaru = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        imagepanel = new javax.swing.JPanel();
        lblsd = new javax.swing.JLabel();
        lblpuskes = new javax.swing.JLabel();
        lblTerbaru = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        buttonLogo.setText("Logo");
        buttonLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonLogo);

        buttonSD.setText("SD");
        buttonSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSDActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSD);

        buttonTerbaru.setText("Terbaru");
        buttonTerbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTerbaruActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTerbaru);

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonKeluar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        imagepanel.setLayout(new java.awt.CardLayout());

        lblsd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/git/sd.png"))); // NOI18N
        imagepanel.add(lblsd, "1");

        lblpuskes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/git/logo-puskesmas.png"))); // NOI18N
        imagepanel.add(lblpuskes, "2");

        lblTerbaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/git/untitled.png"))); // NOI18N
        imagepanel.add(lblTerbaru, "0");

        getContentPane().add(imagepanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagepanel.getLayout());
        cl.show(imagepanel, "2");
    }//GEN-LAST:event_buttonLogoActionPerformed

    private void buttonSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSDActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagepanel.getLayout());
        cl.show(imagepanel, "1");
    }//GEN-LAST:event_buttonSDActionPerformed

    private void buttonTerbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTerbaruActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagepanel.getLayout());
        cl.show(imagepanel, "0");
    }//GEN-LAST:event_buttonTerbaruActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        // TODO add your handling code here:
            System.exit(0);
    }//GEN-LAST:event_buttonKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(PenampilGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PenampilGambarButton fullframe = new PenampilGambarButton();
                GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullframe);
                
                fullframe.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonLogo;
    private javax.swing.JButton buttonSD;
    private javax.swing.JButton buttonTerbaru;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTerbaru;
    private javax.swing.JLabel lblpuskes;
    private javax.swing.JLabel lblsd;
    // End of variables declaration//GEN-END:variables
}
