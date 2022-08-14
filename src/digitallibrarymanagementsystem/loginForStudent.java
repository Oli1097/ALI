package digitallibrarymanagementsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Attribute.ID;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class loginForStudent extends javax.swing.JFrame {

    /**
     * Creates new form loginForStudent
     */
    public loginForStudent() {
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
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setForeground(new java.awt.Color(0, 51, 51));
        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setLayout(null);

        user.setBackground(new java.awt.Color(255, 255, 204));
        user.setToolTipText("Enter your username");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        kGradientPanel1.add(user);
        user.setBounds(350, 142, 200, 30);

        pass.setBackground(new java.awt.Color(255, 255, 204));
        pass.setToolTipText("Enter your Password");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        kGradientPanel1.add(pass);
        pass.setBounds(350, 190, 200, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Don't have an account");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(360, 320, 170, 20);

        kButton2.setText("Login");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(0, 0, 0));
        kButton2.setkBorderRadius(25);
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 153, 102));
        kButton2.setkStartColor(new java.awt.Color(0, 153, 102));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2);
        kButton2.setBounds(340, 260, 160, 40);

        kButton3.setText("Create new account");
        kButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(102, 255, 51));
        kButton3.setkBorderRadius(25);
        kButton3.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton3.setkPressedColor(new java.awt.Color(51, 255, 51));
        kButton3.setkSelectedColor(new java.awt.Color(0, 255, 0));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton3);
        kButton3.setBounds(330, 360, 200, 40);

        kButton1.setBorder(null);
        kButton1.setText("Password");
        kButton1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        kButton1.setkBorderRadius(35);
        kButton1.setkEndColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kButton1.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1);
        kButton1.setBounds(150, 190, 185, 30);

        kButton5.setBorder(null);
        kButton5.setText("Student ID");
        kButton5.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        kButton5.setkBorderRadius(35);
        kButton5.setkEndColor(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kButton5.setkPressedColor(new java.awt.Color(51, 51, 51));
        kButton5.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton5);
        kButton5.setBounds(150, 140, 185, 30);

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        String studentID = user.getText();
        String password = pass.getText();        
        String sql = "SELECT * FROM `admin_data`";
        //System.out.println(sql);

        try {

            Class.forName("com.mysql.jdbc.Driver");
            
            //System.out.println("class loaded");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/digital_library", "root", "");
            //System.out.println("connection successful");
            ResultSet rs;
            try ( Statement stmt = conn.createStatement()) {

                //System.out.println("statement created....");
                rs = stmt.executeQuery(sql);
                //System.out.println("query executed successfully");
               int flag=0;
               while(rs.next()) {
                    String x = rs.getString("std_reg");
                    String y = rs.getString("pass");

//                    System.out.println("username -> " + x + " | " + "pass -> " + y);
                    
                    if(x.equals(studentID) && y.equals(password)){
                        setVisible(false);
                        new StudentBookDetails(studentID).setVisible(true);
                        System.out.println("password milee");
                        flag=1;
                        break;
                    }
                    
                } 
               if(flag==0){

                    JOptionPane.showMessageDialog(null,"Invalid Username or Password"); 
                }
            } catch (Exception ee) {
                System.out.println("Statement probllem");
                ee.printStackTrace();
            }

            //return false;
        } catch (Exception e) {

            System.out.println("unsuccessful");
            JOptionPane.showMessageDialog(null, "Invalid");

        }
//        PreparedStatement ps;
//        //ResultSet rs;
//        String username = user.getText();
//
//        String password = pass.getText();
//        //     System.out.println("connect successful");
//
//        String sql = "SELECT* FROM 'signup' WHERE `username` = ? AND `password` = ?";
//        //int flag = 0;
//
//        try {
//            System.out.println("connect successful");
//
//            Class.forName("com.mysql.jdbc.Driver");
//
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/signup", "root", "");
//            System.out.println("connect successfulllyyyy");
//            ResultSet rs;
//            try {
//                Statement stmt = conn.createStatement();
//                rs = stmt.executeQuery(sql);
//                // loop through the result set
//                while (rs.next()) {
//                    String x = rs.getString("username");
//                    String y = rs.getString("PASS");
//                    //String type = rs.getString("Type");
//                    if (x.equals(username) && y.equals(password)) {
//                        //System.out.println(user+" "+type);
//                        stmt.close();
//                        rs.close();
//                        setVisible(false);
//                        //flag = 1;
//                        new StudentBookDetails().setVisible(true);
//                        //break;
//                        //return true;
//                    }
//                }
//                rs.close();
////                if (flag == 0) {
////                    JOptionPane.showMessageDialog(null, "Invalid passs");
////                }
//            } catch (Exception e) {
//                System.out.println("Frist try");
//            }
//
//        } catch (Exception ex) {
//            System.out.println(" unsuccessful 0connect");
//
//            // System.out.print(ex);
//        }
//

    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        dispose();
        new SignUpPage().setVisible(true);
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton5ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(loginForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
