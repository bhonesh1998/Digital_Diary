package newui;
//-----------------------------------------------------------------------------------------------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
//-----------------------------------------------------------------------------------------------------------------------------
/**
 *
 * @author BHONESH
 */
//-----------------------------------------------------------------------------------------------------------------------------
public class SignupPage extends javax.swing.JFrame {
public static boolean validateEmail(String email) {                 

                        
       boolean status=false;    
       String EMAIL_PATTERN = 
  "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
  + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
       Pattern pattern = Pattern.compile(EMAIL_PATTERN);
       Matcher matcher=pattern.matcher(email);
       if(matcher.matches())
       {
           status=true;
       }
       else{
           status=false;
       }
           return status;
}
//-----------------------------------------------------------------------------------------------------------------------------
    public SignupPage() {
        initComponents();
    }
//-----------------------------------------------------------------------------------------------------------------------------
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fullNameLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        signUp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        loginListener = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 0, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newui/s1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        fullNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        fullNameLabel.setText("FULL NAME");

        email.setBackground(new java.awt.Color(255, 153, 255));
        email.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        emailLabel.setText("EMAIL ID");

        name.setBackground(new java.awt.Color(255, 153, 255));
        name.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        pwdLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pwdLabel.setText("PASSWORD");

        signUp.setBackground(new java.awt.Color(102, 255, 102));
        signUp.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        signUp.setForeground(new java.awt.Color(255, 102, 102));
        signUp.setText("SIGN UP");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        password.setBackground(new java.awt.Color(255, 153, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        loginListener.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        loginListener.setText("Already a member ? click here!");
        loginListener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginListenerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginListener, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(fullNameLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(emailLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(pwdLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(signUp))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(fullNameLabel)
                .addGap(30, 30, 30)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addGap(23, 23, 23)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(pwdLabel)
                .addGap(24, 24, 24)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUp)
                .addGap(18, 18, 18)
                .addComponent(loginListener)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//-----------------------------------------------------------------------------------------------------------------------------
    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        //boolean f;
       // String nullstring = null;
        boolean status=SignupPage.validateEmail(email.getText());
       
        if(status)
        {
        
        try {   
            Class.forName("com.mysql.jdbc.Driver");
      
            System.out.println("Connecting to database...");
            Connection conn = null;
       
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signgood", "root", "");
            System.out.println("connected");
            PreparedStatement stmt = null;
            String checkSql="Select * from `data` where email="+"'"+email.getText()+"'";
            stmt = conn.prepareStatement(checkSql);
            ResultSet rs=stmt.executeQuery(checkSql);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(this,"Email Already Exists");
            }
            else{
            String insertSql = "INSERT INTO `data`( `name`,`email`,`password`) VALUES(?,?,?)";
            String nm=name.getText();
            String mail=email.getText();
            String pwd=password.getText();
            if(nm.length()>0&&pwd.length()>0)
            {
            stmt = conn.prepareStatement(insertSql);
            stmt.setString(1,name.getText());
            stmt.setString(2,email.getText());
             stmt.setString(3,password.getText());
             stmt.executeUpdate();
            }
            else JOptionPane.showMessageDialog(this,"ENTER CORRECT CREDENTIALS");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("error");
        }
        }
        
        else
        {
          JOptionPane.showMessageDialog(this,"Invalid Email!!!");
        }
        
    }//GEN-LAST:event_signUpActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void loginListenerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginListenerMouseClicked
       LoginPage obj=new LoginPage();
       obj.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_loginListenerMouseClicked
//-----------------------------------------------------------------------------------------------------------------------------
    /**
     * @param args the command line arguments
     */
//-----------------------------------------------------------------------------------------------------------------------------    
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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }
//-----------------------------------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel loginListener;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JButton signUp;
    // End of variables declaration//GEN-END:variables
}
//-----------------------------------------------------------------------------------------------------------------------------