/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinescompany;

import static airlinescompany.searchavaliableflights.fid;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ooooo
 */
public class payement extends javax.swing.JFrame {

    /**
     * Creates new form payement
     */
    public payement() {
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
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cntxt = new javax.swing.JTextField();
        expdatetxt = new javax.swing.JTextField();
        cvvtxt = new javax.swing.JTextField();
        savedatabtn = new javax.swing.JButton();
        paynowbtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jPanel6.setBackground(new java.awt.Color(85, 65, 118));

        jLabel5.setBackground(new java.awt.Color(85, 65, 118));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\EDUCATION\\ITMUST\\FALL 2021-2022\\OOP JAVA\\OOP PROJECT\\netbenas project file\\airlinescompany\\home (1).png")); // NOI18N
        jLabel5.setText("  Home");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5homeclick(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\EDUCATION\\ITMUST\\FALL 2021-2022\\OOP JAVA\\OOP PROJECT\\netbenas project file\\airlinescompany\\plus.png")); // NOI18N
        jLabel6.setText(" Booking");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6bookingclick(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(85, 65, 118));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\EDUCATION\\ITMUST\\FALL 2021-2022\\OOP JAVA\\OOP PROJECT\\netbenas project file\\airlinescompany\\airplane.png")); // NOI18N
        jLabel7.setText(" inquiring");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7inquiringclick(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\EDUCATION\\ITMUST\\FALL 2021-2022\\OOP JAVA\\OOP PROJECT\\netbenas project file\\airlinescompany\\about us.png")); // NOI18N
        jLabel8.setText(" About us ");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8aboutusclick(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("What's on your bucket list? Everywhere.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 540));

        jPanel4.setBackground(new java.awt.Color(150, 98, 240));
        jPanel4.setForeground(new java.awt.Color(85, 65, 118));

        jPanel3.setBackground(new java.awt.Color(110, 89, 222));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel9.setText("payment method :");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel2.setText("visa card :");

        jLabel1.setText("card number");

        jLabel3.setText("expration date");

        jLabel4.setText("CCV");

        cntxt.setBackground(new java.awt.Color(54, 33, 89));
        cntxt.setForeground(new java.awt.Color(255, 255, 255));

        expdatetxt.setBackground(new java.awt.Color(54, 33, 89));
        expdatetxt.setForeground(new java.awt.Color(255, 255, 255));
        expdatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expdatetxtActionPerformed(evt);
            }
        });

        cvvtxt.setBackground(new java.awt.Color(54, 33, 89));
        cvvtxt.setForeground(new java.awt.Color(255, 255, 255));

        savedatabtn.setBackground(new java.awt.Color(54, 33, 89));
        savedatabtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        savedatabtn.setForeground(new java.awt.Color(255, 255, 255));
        savedatabtn.setText("save credit card data");
        savedatabtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        savedatabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedatabtnActionPerformed(evt);
            }
        });

        paynowbtn.setBackground(new java.awt.Color(54, 33, 89));
        paynowbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paynowbtn.setForeground(new java.awt.Color(255, 255, 255));
        paynowbtn.setText("complete payment");
        paynowbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paynowbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paynowbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cvvtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(expdatetxt, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(savedatabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(paynowbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(expdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cvvtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savedatabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(paynowbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel13.setIcon(new javax.swing.ImageIcon("E:\\EDUCATION\\ITMUST\\FALL 2021-2022\\OOP JAVA\\OOP PROJECT\\netbenas project file\\airlinescompany\\space airways movv without background.png")); // NOI18N
        jLabel13.setText("jLabel9");

        jLabel14.setIcon(new javax.swing.ImageIcon("E:\\EDUCATION\\ITMUST\\FALL 2021-2022\\OOP JAVA\\OOP PROJECT\\netbenas project file\\airlinescompany\\space airways logo without background.png")); // NOI18N
        jLabel14.setText("jLabel7");

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\EDUCATION\\ITMUST\\FALL 2021-2022\\OOP JAVA\\OOP PROJECT\\netbenas project file\\airlinescompany\\exit.png")); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlable(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(39, 39, 39))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 0, 670, 540));

        setSize(new java.awt.Dimension(917, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5homeclick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5homeclick
        new choices().setVisible(true);  // to make the move of bottom to choices page
        dispose();
    }//GEN-LAST:event_jLabel5homeclick

    private void jLabel6bookingclick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6bookingclick
        new searchavaliableflights().setVisible(true);  // to make the move of bottom to choices page
        dispose();
    }//GEN-LAST:event_jLabel6bookingclick

    private void jLabel7inquiringclick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7inquiringclick
        new inquiringbyid().setVisible(true);  // to make the move of bottom to choices page
        dispose();
    }//GEN-LAST:event_jLabel7inquiringclick

    private void jLabel8aboutusclick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8aboutusclick
        new aboutus().setVisible(true);  // to make the move of bottom to choices page
        dispose();
    }//GEN-LAST:event_jLabel8aboutusclick

    private void expdatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expdatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expdatetxtActionPerformed

    private void savedatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedatabtnActionPerformed
     
      // to store the data of visa in db
          try {Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logdata","root","");
            PreparedStatement stmt=con.prepareStatement ("INSERT INTO `creditcarddetails`(`cardnum`, `expdate`, `cvv`) VALUES (?,?,?)");
            String cardnumber= cntxt.getText();      
              String expdate = expdatetxt.getText();
              String cvv = cvvtxt.getText();
              
            stmt.setString(1,cardnumber);
            stmt.setString(2, expdate);
             stmt.setString(3, cvv);
            
            stmt.execute();
              
                   JOptionPane.showMessageDialog(null, "visa saved.");
           
          } catch (SQLException ex) {
            System.out.println("error is"+ex.getMessage());
        }

    }//GEN-LAST:event_savedatabtnActionPerformed

    private void paynowbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paynowbtnActionPerformed
         //to link data of flight with the payment accepted
    
  try {Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logdata","root","");
         PreparedStatement stmtt=con.prepareStatement ("INSERT INTO `flightlink`( `bookedby`,`flightid`,`visacard`, `paid`) VALUES (?,?,?,?)");
               String username= menu.f1.getText();         //to get the value of txt feild of username from menu frame by setting the feild to public static
              String flightid = searchavaliableflights.fid.getText();
                String visanumb= cntxt.getText(); 
               String paid="yes" ;
                   
            stmtt.setString(1, username);
          stmtt.setString(2, flightid);
            stmtt.setString(3, visanumb);
           stmtt.setString(4, paid);
           
           stmtt.execute();

               
                JOptionPane.showMessageDialog(null, "payment is completed successfuly.");
           new ticketbooked().setVisible(true);  // to make the move of bottom to choices page
            dispose();
          
          } catch (SQLException ex) {
            System.out.println("error is"+ex.getMessage());
        }

    }//GEN-LAST:event_paynowbtnActionPerformed

    private void exitlable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlable
              System.exit(0); 
    }//GEN-LAST:event_exitlable

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
            java.util.logging.Logger.getLogger(payement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cntxt;
    private javax.swing.JTextField cvvtxt;
    private javax.swing.JTextField expdatetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton paynowbtn;
    private javax.swing.JButton savedatabtn;
    // End of variables declaration//GEN-END:variables
}
