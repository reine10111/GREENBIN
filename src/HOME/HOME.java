/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HOME;
import INBOX.MESSAGE;
import ADD_PRODUCT.ADD_PRODUCT;
import PROFILE.PROFILE;
/**
 *
 * @author JOEY SALOZA
 */
public class HOME extends javax.swing.JFrame {

    /**
     * Creates new form HOME
     */
    public HOME() {
        setUndecorated(true);
        initComponents();
        jFront.setVisible(true);
        jAbout.setVisible(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jHome = new javax.swing.JLabel();
        jProfile = new javax.swing.JLabel();
        jAboutUs = new javax.swing.JLabel();
        jMessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jAdd = new javax.swing.JLabel();
        jAbout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFront = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Home Button.png"))); // NOI18N
        jHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHomeMouseClicked(evt);
            }
        });
        jPanel2.add(jHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, -1, -1));

        jProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/User_circle.png"))); // NOI18N
        jProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProfileMouseClicked(evt);
            }
        });
        jPanel2.add(jProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, -1, -1));

        jAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/about us.png"))); // NOI18N
        jAboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAboutUsMouseClicked(evt);
            }
        });
        jPanel2.add(jAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, -1));

        jMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/msg_button.png"))); // NOI18N
        jMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMessageMouseClicked(evt);
            }
        });
        jPanel2.add(jMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Group 16.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, -1, -1));

        jAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Add Product.png"))); // NOI18N
        jAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAddMouseClicked(evt);
            }
        });
        jPanel2.add(jAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 100, 100));

        jAbout.setBackground(new java.awt.Color(255, 102, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/CIRCLE.png"))); // NOI18N

        javax.swing.GroupLayout jAboutLayout = new javax.swing.GroupLayout(jAbout);
        jAbout.setLayout(jAboutLayout);
        jAboutLayout.setHorizontalGroup(
            jAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAboutLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jAboutLayout.setVerticalGroup(
            jAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAboutLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(535, Short.MAX_VALUE))
        );

        jPanel2.add(jAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 740));

        jFront.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jFrontLayout = new javax.swing.GroupLayout(jFront);
        jFront.setLayout(jFrontLayout);
        jFrontLayout.setHorizontalGroup(
            jFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jFrontLayout.setVerticalGroup(
            jFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );

        jPanel2.add(jFront, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(406, 758));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHomeMouseClicked
        jFront.setVisible(true);
        jAbout.setVisible(false);
        HOME homeFrame = new HOME();
        homeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jHomeMouseClicked

    private void jMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMessageMouseClicked
        // TODO add your handling code here:
        jFront.setVisible(false);
        jAbout.setVisible(false);
        MESSAGE inboxFrame = new MESSAGE();
        inboxFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMessageMouseClicked

    private void jAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddMouseClicked
        // TODO add your handling code here:
        jFront.setVisible(false);
        jAbout.setVisible(false);
        ADD_PRODUCT addFrame = new ADD_PRODUCT();
        addFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jAddMouseClicked

    private void jProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProfileMouseClicked
        // TODO add your handling code here:
        jFront.setVisible(false);
        jAbout.setVisible(false);
        PROFILE profileFrame = new PROFILE();
        profileFrame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jProfileMouseClicked

    private void jAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAboutUsMouseClicked
        // TODO add your handling code here:
        jFront.setVisible(false);
        jAbout.setVisible(true);

    }//GEN-LAST:event_jAboutUsMouseClicked

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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jAbout;
    private javax.swing.JLabel jAboutUs;
    private javax.swing.JLabel jAdd;
    private javax.swing.JPanel jFront;
    private javax.swing.JLabel jHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jMessage;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jProfile;
    // End of variables declaration//GEN-END:variables
}
