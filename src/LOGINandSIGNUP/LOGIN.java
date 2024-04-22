/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LOGINandSIGNUP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Precifil
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LOGINBUTTON = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Signup = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("GreenBin");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/shapes.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/shapes (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 720, -1, -1));

        jLabel3.setFont(new java.awt.Font("Artifakt Element Black", 1, 24)); // NOI18N
        jLabel3.setText("WELCOME TO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Artifakt Element Black", 1, 48)); // NOI18N
        jLabel5.setText("GreenBin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 52));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/LoginImg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 228));

        LOGINBUTTON.setBackground(new java.awt.Color(55, 185, 67));
        LOGINBUTTON.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LOGINBUTTON.setForeground(new java.awt.Color(255, 255, 255));
        LOGINBUTTON.setText("LOGIN");
        LOGINBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINBUTTONActionPerformed(evt);
            }
        });
        jPanel1.add(LOGINBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 111, 34));

        Username.setBackground(new java.awt.Color(217, 217, 217));
        Username.setFont(new java.awt.Font("Gigi", 0, 12)); // NOI18N
        Username.setBorder(null);
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 260, 20));

        Password.setBackground(new java.awt.Color(215, 215, 215));
        Password.setBorder(null);
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 260, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/user.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 20, 20));

        jLabel7.setText("I don't have an account.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, -1, -1));

        Signup.setForeground(new java.awt.Color(0, 51, 255));
        Signup.setText("SIGN UP");
        Signup.setBorder(null);
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel1.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/password.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, -1, -1));

        jLabel8.setBackground(new java.awt.Color(217, 217, 217));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Rectangle 7.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 120, 20));

        jLabel10.setBackground(new java.awt.Color(217, 217, 217));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Rectangle 7.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(420, 852));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void LOGINBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINBUTTONActionPerformed
        // TODO add your handling code here:
        String username = Username.getText();
        String password = String.valueOf(Password.getPassword());
        if(username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username / Password should not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
    }else {
        //
        userLogin(username, password);
        }
       
    }//GEN-LAST:event_LOGINBUTTONActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        // TODO add your handling code here:
        REGISTER registerFrame = new REGISTER();
        registerFrame.setVisible(true);
    }//GEN-LAST:event_SignupActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGINBUTTON;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Signup;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String username, String password) {
        Connection dbconn = DBConnection.connectDB();
        if (dbconn != null){
            
        try {
            PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Select * from users WHERE username = ? AND password = ?");
            
            
            st.setString(1, username);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            if(res.next()){
                    //display HOMR of new page after login.
                    dispose();
                    HOME h = new HOME();
                    h.setVisible(true);

            }else{
                    System.out.println("username" + username);
                    System.out.println("password" + password);
                    JOptionPane.showMessageDialog(this, "Username / Password  not found.", "Error", JOptionPane.ERROR_MESSAGE);

                }
            
            st.close();
            dbconn.close();


        }catch (SQLException ex) {
                Logger.getLogger(LOGIN.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("The connection is not available.");
        }
        
    }
}       
        
