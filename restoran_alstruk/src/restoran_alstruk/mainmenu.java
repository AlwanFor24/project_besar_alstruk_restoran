/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran_alstruk;



/**
 *
 * @author Akhmad
 */
public class mainmenu extends javax.swing.JFrame {

    /**
     * Creates new form mainmenuUser
     */
    
    public mainmenu(){
        initComponents();
        setLocationRelativeTo(null);
    }
    public mainmenu(String nama) {
        initComponents();
        setLocationRelativeTo(null);
        labelNama.setText("Hallo, "+nama+"!!");
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNama = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pemesanan = new javax.swing.JButton();
        listMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNama.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 320, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainmenu.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 150, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainmenu.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 150, 40));

        pemesanan.setBorder(null);
        pemesanan.setContentAreaFilled(false);
        pemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemesananActionPerformed(evt);
            }
        });
        getContentPane().add(pemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 110, 49));

        listMenu.setBorder(null);
        listMenu.setContentAreaFilled(false);
        listMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMenuActionPerformed(evt);
            }
        });
        getContentPane().add(listMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 110, 49));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainmenu.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new alterMenu().setVisible(true);
    }//GEN-LAST:event_listMenuActionPerformed

    private void pemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemesananActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new pesanMenu().setVisible(true);
    }//GEN-LAST:event_pemesananActionPerformed

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
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelNama;
    private javax.swing.JButton listMenu;
    private javax.swing.JButton pemesanan;
    // End of variables declaration//GEN-END:variables
}
