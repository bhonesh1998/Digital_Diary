
package newui;
//-----------------------------------------------------------------------------------------------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//-----------------------------------------------------------------------------------------------------------------------------
/**
 *
 * @author BHONESH
 */
//-----------------------------------------------------------------------------------------------------------------------------
public class CalendarAdd extends javax.swing.JFrame {

    String date;
    public CalendarAdd() {
        initComponents();
    }

    CalendarAdd(String reqDate) {
        initComponents();
        datelabel.setText(reqDate);//setting up selected date on a label  
        this.date=reqDate;
      
    }
//-----------------------------------------------------------------------------------------------------------------------------
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        notes = new javax.swing.JButton();
        addSpecialDay = new javax.swing.JButton();
        showSpecialDays = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        specialDays = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        noteTable = new javax.swing.JTable();
        datelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        notes.setBackground(new java.awt.Color(102, 255, 102));
        notes.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        notes.setText("Show all notes");
        notes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesActionPerformed(evt);
            }
        });

        addSpecialDay.setBackground(new java.awt.Color(102, 255, 102));
        addSpecialDay.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        addSpecialDay.setText("Add a special day ");
        addSpecialDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSpecialDayActionPerformed(evt);
            }
        });

        showSpecialDays.setBackground(new java.awt.Color(102, 255, 102));
        showSpecialDays.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        showSpecialDays.setText("Show all special days ");
        showSpecialDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSpecialDaysActionPerformed(evt);
            }
        });

        specialDays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Special days"
            }
        ));
        jScrollPane1.setViewportView(specialDays);

        noteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Filename"
            }
        ));
        jScrollPane2.setViewportView(noteTable);

        datelabel.setBackground(new java.awt.Color(153, 153, 255));
        datelabel.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(addSpecialDay, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(showSpecialDays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notes)
                    .addComponent(addSpecialDay)
                    .addComponent(showSpecialDays))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//-----------------------------------------------------------------------------------------------------------------------------
    private void showSpecialDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSpecialDaysActionPerformed
DefaultTableModel model=(DefaultTableModel)specialDays.getModel();
        try{
            Class.forName("com.mysql.jdbc.Driver");   //making sql connection to database
            System.out.println("Connecting to database...");
            Connection conn = null;     //in start taking connection variable null
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signgood", "root", "");     //connection via jdbc driver
            System.out.println("connected");         
            PreparedStatement stmt = null;    //in start taking PreparedStatement variable null
            String selectSql = "SELECT * FROM day where date="+"'"+date+"'";//selection of  special days  from database on a selected date 
            stmt = conn.prepareStatement(selectSql);
            ResultSet rs = stmt.executeQuery(); // making result set for selectSql query
            System.out.println(date);
            ResultSet ps = rs;
            model.setRowCount(0);
                while (rs.next()) {                                   
                    String specialday = rs.getString("specialday");  // printing special days from database 
                    model.addRow(new Object[] {specialday});
            }
          }
catch(Exception e)
{
 e.printStackTrace();
}		           
    }//GEN-LAST:event_showSpecialDaysActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void notesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesActionPerformed
DefaultTableModel model=(DefaultTableModel)noteTable.getModel(); //making a table for showing notes on selected date 
          
        try{
            Class.forName("com.mysql.jdbc.Driver");    //making sql connection to database
           System.out.println("Connecting to database...");
            Connection conn = null;  //in start taking connection variable null
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signgood", "root", ""); //connection via jdbc driver
            System.out.println("connected");         
            PreparedStatement stmt = null;    //in start taking PreparedStatement variable null
           
            String selectSql = "SELECT * FROM diary where date="+"'"+date+"'"; 
            stmt = conn.prepareStatement(selectSql);
            ResultSet rs = stmt.executeQuery(); 
            ResultSet ps = rs;
            if(ps.next())
            {
                while (rs.next()) {                   
                    String filename = rs.getString("filename");
                                  
                     model.addRow(new Object[] {filename});
                   
                }
            }
            else
            {
            JOptionPane.showMessageDialog(this,"NOT FOUND");
            }
          }
catch(Exception e)
{
     
    e.printStackTrace();
}		                
    }//GEN-LAST:event_notesActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void addSpecialDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSpecialDayActionPerformed
 try {   
            Class.forName("com.mysql.jdbc.Driver");
      
            System.out.println("Connecting to database...");
            Connection conn = null;
       
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signgood", "root", "");
            System.out.println("connected");
          String spday=JOptionPane.showInputDialog(this,"Enter details for day");   
            PreparedStatement stmt = null;
        
       
            String insertSql = "INSERT INTO `day`( `date`,`specialday`) VALUES(?,?)";
            stmt = conn.prepareStatement(insertSql);
     
            stmt.setString(1,date);
            stmt.setString(2,spday);
             
           stmt.executeUpdate();
            //}
        } catch (Exception e) {
            e.printStackTrace();
            
        }          
      
        
        
        
    }//GEN-LAST:event_addSpecialDayActionPerformed
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
            java.util.logging.Logger.getLogger(CalendarAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarAdd().setVisible(true);
            }
        });
    }
//-----------------------------------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSpecialDay;
    private static javax.swing.JLabel datelabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable noteTable;
    private javax.swing.JButton notes;
    private javax.swing.JButton showSpecialDays;
    private javax.swing.JTable specialDays;
    // End of variables declaration//GEN-END:variables
}
//-----------------------------------------------------------------------------------------------------------------------------