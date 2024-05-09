/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HOME;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import LOGINandSIGNUP.DBConnection;
import javax.swing.JPanel;


/**
 *
 * @author JOEY SALOZA
 */
public class TOTAL extends javax.swing.JFrame {
    private String time;
    private String date;
    private double totalAmount; 
    
    private HOME homeInstance;


    public TOTAL(HOME homeInstance) {
        this.homeInstance = homeInstance;
        initComponents();
        totalAmount = 0.0; 
    }


    /**
     * Creates new form TOTAL
     */

    
    public TOTAL() {
        
        initComponents();
        totalAmount = 0.0; 
        
       
    }
    
    public void greenbin(String time, String date, int itemNumber, String itemName, double price) {
        this.time = time;
        this.date = date;

        // If jTextArea is empty, initialize with the header, otherwise append the new item
        if (jTextArea.getText().isEmpty()) {
            jTextArea.setText("*********************GREENBIN*********************\n"
                    + "Time: " + this.time + " Date: " + this.date + "\n"
                    + "******************************************************\n"
                    + "Item Name: \t\t" + "Price(P)\n"



            );
                    
        }

        // Append new item information
        String newText = "\n" + itemNumber + ". " + itemName + "\t\t" + price + "\n";
        jTextArea.append(newText);
        
        totalAmount += price;
        
        try (Connection connection = DBConnection.getConnection()) {
            String query = "INSERT INTO transactions (time, date, itemNumber, item_name, price, total_amount) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, this.time);
            preparedStatement.setString(2, this.date);
            preparedStatement.setInt(3, itemNumber);
            preparedStatement.setString(4, itemName);
            preparedStatement.setDouble(5, price);
            preparedStatement.setDouble(6, totalAmount);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the error appropriately
        }

    }
    
    public void displayTotal() {
        // Add the total amount to the receipt
        jTextArea.append("\n******************************************************\n");
        jTextArea.append("Total: \t\t" + totalAmount + "\n");
        jTextArea.append("******************************************************\n");
        jTextArea.append("THIS SLIP IS YOUR TRANSACTION RECORD\n");
        
        jTextArea.append("******************************************************\n");



    }

    public void reset() {
        jTextArea.setText("");
        totalAmount = 0.0; // Reset the total amount
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
        jLabel2 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Artifakt Element Black", 1, 48)); // NOI18N
        jLabel2.setText("GreenBin");

        Print.setBackground(new java.awt.Color(82, 130, 101));
        Print.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 102, 102));
        Back.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Print)
                    .addComponent(Back))
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(404, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public void switchToPanel(JPanel panel) {


        panel.setVisible(true);
    }
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        // Dispose of the frame
        this.setVisible(false);
        // Show the HOME frame
        homeInstance.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        if (totalAmount != 0) {
        try {
            // Print the content of the JTextArea
            jTextArea.print();
            JOptionPane.showMessageDialog(null, "Print successful!");
            this.setVisible(false);
            // Show the HOME frame
        homeInstance.setVisible(true);
        } catch (PrinterException ex) {
            ex.printStackTrace(); // Log the error
            JOptionPane.showMessageDialog(null, "Error printing: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "You haven't purchased any product");
    }
        
    }//GEN-LAST:event_PrintActionPerformed

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
            java.util.logging.Logger.getLogger(TOTAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TOTAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TOTAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TOTAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TOTAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Back;
    public javax.swing.JButton Print;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}
