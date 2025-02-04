/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.Color;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import server.appinterface;





public class RegistrationForm extends javax.swing.JFrame {
    
    private static appinterface app;

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
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

        BackGround = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        LastNamejLabel4 = new javax.swing.JLabel();
        FirstNamejLabel5 = new javax.swing.JLabel();
        last = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PersonalInfo_jLabel4 = new javax.swing.JLabel();
        first = new javax.swing.JTextField();
        FirstNamejLabel6 = new javax.swing.JLabel();
        FirstNamejLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        PersonalInfo_jLabel5 = new javax.swing.JLabel();
        FirstNamejLabel8 = new javax.swing.JLabel();
        PasswordjLabel9 = new javax.swing.JLabel();
        ReenterPassword_jTextField2 = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        SubmitRequestjButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        PaymentDetails_jLabel = new javax.swing.JLabel();
        PasswordjLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        EmployeeInfo_jLabel7 = new javax.swing.JLabel();
        FirstNamejLabel9 = new javax.swing.JLabel();
        bankNo = new javax.swing.JTextField();
        FirstNamejLabel15 = new javax.swing.JLabel();
        bankID = new javax.swing.JTextField();
        BankAccNumjLabel = new javax.swing.JLabel();
        BankIDjlabel = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        department = new javax.swing.JTextField();
        LogOutIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        BackGround.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bhel-high-resolution-logo-transparent-removebg-preview (1) (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("ACCOUNT REQUEST FORM");

        jLabel3.setText("Please Fill out the details in form below for requesting account creation");

        LastNamejLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LastNamejLabel4.setText("Last Name");

        FirstNamejLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FirstNamejLabel5.setText("First Name ");

        PersonalInfo_jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PersonalInfo_jLabel4.setText("Personal Info ");

        FirstNamejLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FirstNamejLabel6.setText("E-Mail");

        FirstNamejLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FirstNamejLabel7.setText("Telephone  Number");

        PersonalInfo_jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PersonalInfo_jLabel5.setText("Account Info ");

        FirstNamejLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FirstNamejLabel8.setText("Department/Team Name");

        PasswordjLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PasswordjLabel9.setText("Password");

        SubmitRequestjButton1.setBackground(new java.awt.Color(0, 0, 0));
        SubmitRequestjButton1.setForeground(new java.awt.Color(255, 255, 255));
        SubmitRequestjButton1.setText("Submit");
        SubmitRequestjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmitRequestjButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmitRequestjButton1MouseExited(evt);
            }
        });
        SubmitRequestjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitRequestjButton1ActionPerformed(evt);
            }
        });

        PaymentDetails_jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PaymentDetails_jLabel.setText("Payment Details");

        PasswordjLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PasswordjLabel10.setText("Re-confirm Password ");

        EmployeeInfo_jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EmployeeInfo_jLabel7.setText("Employee Info");

        FirstNamejLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FirstNamejLabel9.setText("UserName");

        FirstNamejLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FirstNamejLabel15.setText("Employee ID");

        BankAccNumjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BankAccNumjLabel.setText("Bank Account Number");

        BankIDjlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BankIDjlabel.setText("Bank ID");

        LogOutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        LogOutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(181, 181, 181))))
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(SubmitRequestjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BackGroundLayout.createSequentialGroup()
                                    .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackGroundLayout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(BackGroundLayout.createSequentialGroup()
                                                    .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(FirstNamejLabel5)
                                                        .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(FirstNamejLabel6)
                                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(27, 27, 27)
                                                    .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LastNamejLabel4)
                                                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(FirstNamejLabel7)))
                                                .addComponent(PersonalInfo_jLabel5)
                                                .addGroup(BackGroundLayout.createSequentialGroup()
                                                    .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(FirstNamejLabel9))
                                                    .addGap(30, 30, 30)
                                                    .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PasswordjLabel9)
                                                        .addComponent(PasswordjLabel10)
                                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ReenterPassword_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(BackGroundLayout.createSequentialGroup()
                                            .addGap(51, 51, 51)
                                            .addComponent(PersonalInfo_jLabel4)))
                                    .addGap(125, 125, 125))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PaymentDetails_jLabel)
                                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EmployeeInfo_jLabel7)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(FirstNamejLabel15)
                                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(22, 22, 22)
                                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(FirstNamejLabel8))
                                                .addGap(125, 125, 125))
                                            .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(BackGroundLayout.createSequentialGroup()
                                            .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(BankAccNumjLabel)
                                                .addComponent(bankNo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(26, 26, 26)
                                            .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bankID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BankIDjlabel))))))
                            .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(BackGroundLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackGroundLayout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(270, 270, 270)
                        .addComponent(LogOutIcon)))
                .addContainerGap())
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogOutIcon)))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PersonalInfo_jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNamejLabel5)
                    .addComponent(LastNamejLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNamejLabel6)
                    .addComponent(FirstNamejLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(PersonalInfo_jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordjLabel9)
                    .addComponent(FirstNamejLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(PasswordjLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReenterPassword_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeInfo_jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNamejLabel8)
                    .addComponent(FirstNamejLabel15))
                .addGap(20, 20, 20)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaymentDetails_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankAccNumjLabel)
                    .addComponent(BankIDjlabel))
                .addGap(18, 18, 18)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SubmitRequestjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitRequestjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitRequestjButton1ActionPerformed
        if (!ID.getText().equals("")&!first.getText().equals("")&!last.getText().equals("")&!phone.getText().equals("")&!department.getText().equals("")&!email.getText().equals("")&!username.getText().equals("")&!password.getText().equals("")&!bankNo.getText().equals("")&!bankID.getText().equals("")){
            try {
                app.registerEmployee(ID.getText(), first.getText(), last.getText(), phone.getText(), department.getText(), email.getText(), username.getText(), password.getText(), bankNo.getText(), bankID.getText());
            } catch (RemoteException ex) {
                Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Thank you for submitting a request. \n HR will look at your request and email you for further notifications.");
            Login log = new Login();
            log.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"All input fields must be filled!");
        }
        
        
    }//GEN-LAST:event_SubmitRequestjButton1ActionPerformed

    private void SubmitRequestjButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitRequestjButton1MouseEntered
        SubmitRequestjButton1.setBackground(Color.BLACK); // Set background to black
    }//GEN-LAST:event_SubmitRequestjButton1MouseEntered

    private void SubmitRequestjButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitRequestjButton1MouseExited
        SubmitRequestjButton1.setBackground(originalButtonColor); // Revert to original color
    }//GEN-LAST:event_SubmitRequestjButton1MouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            app = (appinterface) Naming.lookup("rmi://localhost:1040/assignment");
        } catch (NotBoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void LogOutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutIconMouseClicked
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutIconMouseClicked

    private Color originalButtonColor; // Store the original color

// In the constructor or initialization block:


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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel BankAccNumjLabel;
    private javax.swing.JLabel BankIDjlabel;
    private javax.swing.JLabel EmployeeInfo_jLabel7;
    private javax.swing.JLabel FirstNamejLabel15;
    private javax.swing.JLabel FirstNamejLabel5;
    private javax.swing.JLabel FirstNamejLabel6;
    private javax.swing.JLabel FirstNamejLabel7;
    private javax.swing.JLabel FirstNamejLabel8;
    private javax.swing.JLabel FirstNamejLabel9;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel LastNamejLabel4;
    private javax.swing.JLabel LogOutIcon;
    private javax.swing.JLabel PasswordjLabel10;
    private javax.swing.JLabel PasswordjLabel9;
    private javax.swing.JLabel PaymentDetails_jLabel;
    private javax.swing.JLabel PersonalInfo_jLabel4;
    private javax.swing.JLabel PersonalInfo_jLabel5;
    private javax.swing.JTextField ReenterPassword_jTextField2;
    private javax.swing.JButton SubmitRequestjButton1;
    private javax.swing.JTextField bankID;
    private javax.swing.JTextField bankNo;
    private javax.swing.JTextField department;
    private javax.swing.JTextField email;
    private javax.swing.JTextField first;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField last;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
