
package newui;
//-----------------------------------------------------------------------------------------------------------------------------
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.FILES_ONLY;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.undo.UndoManager;
import javax.swing.text.Highlighter;
import javax.swing.text.DefaultHighlighter;
/**
 *
 * @author BHONESH
 */
//-----------------------------------------------------------------------------------------------------------------------------
class Remember extends Thread{
    String email;
    public static Highlighter.HighlightPainter otherWord;
    
    Remember(String email) {
        otherWord = new DefaultHighlighter.DefaultHighlightPainter(new Color(244, 235, 66));
        this.email=email;
      
    } 
 //-----------------------------------------------------------------------------------------------------------------------------    
    public void run()
    {
        System.out.println("Hi");
              try {   
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signgood", "root", "");
            System.out.println("connected");
            PreparedStatement stmt = null;
            //Calendar cal=new Calendar();
            Calendar cal=Calendar.getInstance();
            String curdate=Integer.toString(cal.get(Calendar.YEAR))+"-"+Integer.toString(cal.get(Calendar.MONTH)+1)+"-"+Integer.toString(cal.get(Calendar.DATE));
            String remSql="Select * from `diary` where date="+"'"+curdate+"' and `email`='"+email+"'";
           // String qu="select * from data where email='"+mail+"' and password='"+pwd+"'"; 
            stmt = conn.prepareStatement(remSql);
            ResultSet rs = stmt.executeQuery(); 
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, "Enter a note on this date");
            }
            else System.out.println("Already exist a Note "+curdate);
        }catch (Exception ex) {
            Logger.getLogger(SignupPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
//-----------------------------------------------------------------------------------------------------------------------------
class date extends Thread{//to show current date and time,a date class is created which extends thread 
    JLabel label;
    public void run()
    {
        while(true)
        {
            label.setText(new Date().toString());
        }
    }
    public date(JLabel label)
    {
        this.label=label;
    }
}
//-----------------------------------------------------------------------------------------------------------------------------
public class Diary extends javax.swing.JFrame {
UndoManager manager = new UndoManager();
static Font font;
    Font tempFont;
     private Color color, tempColor;
     static boolean WrapText;
    String text;    
//-----------------------------------------------------------------------------------------------------------------------------    
    public Diary() {
        initComponents();
         tempFont = new Font("Consolas", Font.PLAIN, 12); //taking temporary font
        font = new Font("Consolas", Font.PLAIN, 12);  //default font
    
    }
    String name,email;
    Diary(String name, String email){
        initComponents();
        tempFont = new Font("Consolas", Font.PLAIN, 12); //taking temporary font
        font = new Font("Consolas", Font.PLAIN, 12);  //default font
        this.email=email;
        this.name=name;
        diaryArea.getDocument().addUndoableEditListener(manager);
        new date(dateTime).start();
        userName.setText(name);   // setting username on a label on main page of diary
        //Diary.main(null);         // calling main function
        new Remember(this.email).start();
    }

 //-----------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diaryArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        replaceAll = new javax.swing.JButton();
        replace = new javax.swing.JButton();
        findField = new javax.swing.JTextField();
        reField = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        impCheck = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        addImage = new javax.swing.JButton();
        l = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        dateTime = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        diaryArea.setBackground(new java.awt.Color(153, 204, 255));
        diaryArea.setColumns(20);
        diaryArea.setRows(5);
        jScrollPane1.setViewportView(diaryArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        replaceAll.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        replaceAll.setText("Replace all");
        replaceAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceAllActionPerformed(evt);
            }
        });

        replace.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        replace.setText("Replace");
        replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceActionPerformed(evt);
            }
        });

        findField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findFieldActionPerformed(evt);
            }
        });

        reField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reFieldActionPerformed(evt);
            }
        });

        find.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        find.setText("Find");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        impCheck.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        impCheck.setText("Save as Favourite");
        impCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(replace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(findField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(impCheck)
                    .addComponent(replaceAll))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(find)
                    .addComponent(replaceAll)
                    .addComponent(findField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(replace)
                        .addComponent(reField))
                    .addComponent(impCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        addImage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addImage.setText("Attach An Image");
        addImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(l, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addImage)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setText("WELCOME");

        userName.setBackground(new java.awt.Color(255, 255, 255));
        userName.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 0, 204));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dateTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar2.setBackground(new java.awt.Color(204, 255, 51));
        jMenuBar2.setForeground(new java.awt.Color(255, 255, 51));
        jMenuBar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenu3.setText("File");
        jMenu3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("New");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenu4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Undo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Redo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Cut");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Copy");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Paste");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Clear all");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("select all");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("View");
        jMenu5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Zoom in ");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Zoom out");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Background color");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Format");
        jMenu6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N

        jMenuItem16.setText("Font");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuItem17.setText("color");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem18.setText("word wrap");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuBar2.add(jMenu6);

        jMenu7.setText("Features");
        jMenu7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N

        jMenuItem19.setText("Spell checker");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem19);

        jMenuItem20.setText("Calender");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenuBar2.add(jMenu7);

        jMenu8.setText("Help");
        jMenu8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N

        jMenuItem10.setText("HELP");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(858, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if(diaryArea.getText().length()>0)
        {
                int result = JOptionPane.showConfirmDialog(null,
                 "Do you want ot save it?",null, JOptionPane.YES_NO_OPTION);
         if(result == JOptionPane.YES_OPTION)
         {
           JFileChooser save = new JFileChooser();
        int option = save.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                // create a buffered writer to write to a file
                if(diaryArea.getText().length()>0)
                {
                BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                out.write(this.diaryArea.getText()); // write the contents of the TextArea to the file
                out.close();
             try {   
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signgood", "root", "");
            System.out.println("connected");
            PreparedStatement stmt = null;
            //Calendar cal=new Calendar();
            Calendar cal=Calendar.getInstance();
            String date=Integer.toString(cal.get(Calendar.YEAR))+"-"+Integer.toString(cal.get(Calendar.MONTH)+1)+"-"+Integer.toString(cal.get(Calendar.DATE));
            String filename=save.getSelectedFile().toString();
            String mark;
            if(impCheck.isSelected())
                mark="yes";
            else mark="no";
            String insertSql = "INSERT INTO `diary`( `email`,`filename`,`content`,`date`,`important`)  VALUES(?,?,?,?,?)";
            stmt = conn.prepareStatement(insertSql);
            stmt.setString(1,email);
            stmt.setString(2,save.getSelectedFile().getName().toString());
            stmt.setString(3,diaryArea.getText());  
            stmt.setString(4,date);
            stmt.setString(5,mark);
       
            stmt.executeUpdate(); 

        } catch (Exception ex) {
            Logger.getLogger(SignupPage.class.getName()).log(Level.SEVERE, null, ex);
        }
             //   Connection 
                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }

              
                
         }  
            
        }

            else
            {
                JOptionPane.showMessageDialog(this,"not saved");
            }
            diaryArea.setText("");
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(diaryArea.getText().length()>0)
        {
            int result = JOptionPane.showConfirmDialog(null,
                 "Do you want ot save it?",null, JOptionPane.YES_NO_OPTION);
         if(result == JOptionPane.YES_OPTION)
         { 
            
            
            JFileChooser save = new JFileChooser();
        int option = save.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                // create a buffered writer to write to a file
                if(diaryArea.getText().length()>0)
                {
                BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                out.write(this.diaryArea.getText()); // write the contents of the TextArea to the file
                out.close();
             try {   
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signgood", "root", "");
            System.out.println("connected");
            PreparedStatement stmt = null;
            //Calendar cal=new Calendar();
            Calendar cal=Calendar.getInstance();
            String date=Integer.toString(cal.get(Calendar.YEAR))+"-"+Integer.toString(cal.get(Calendar.MONTH)+1)+"-"+Integer.toString(cal.get(Calendar.DATE));
            String filename=save.getSelectedFile().toString();
            String mark;
            if(impCheck.isSelected())
                mark="yes";
            else mark="no";
            String insertSql = "INSERT INTO `diary`( `email`,`filename`,`content`,`date`,`important`)  VALUES(?,?,?,?,?)";
            stmt = conn.prepareStatement(insertSql);
            stmt.setString(1,email);
            stmt.setString(2,save.getSelectedFile().getName().toString());
            stmt.setString(3,diaryArea.getText());  
            stmt.setString(4,date);
            stmt.setString(5,mark);
            stmt.executeUpdate(); 

        } catch (Exception ex) {
            Logger.getLogger(SignupPage.class.getName()).log(Level.SEVERE, null, ex);
        }
             //   Connection 
                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
          
              
            }

            else
            {
                JOptionPane.showMessageDialog(this,"not saved");
            }
            diaryArea.setText("");
        }

        JFileChooser open = new JFileChooser(); // open up a file chooser (a dialog for the user to browse files to open)
        int option = open.showOpenDialog(this); // get the option that the user selected (approve or cancel)

        if (option == JFileChooser.APPROVE_OPTION){
            this.diaryArea.setText(""); // clear the TextArea before applying the file contents
            try {
                // create a scanner to read the file (getSelectedFile().getPath() will get the path to the file)
                Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                while (scan.hasNext()) // while there's still something to read
                this.diaryArea.append(scan.nextLine() + "\n"); // append the line to the TextArea
            } catch (Exception ex) { // catch any exceptions, and...
                // ...write to the debug console
                System.out.println(ex.getMessage());
            }
        }   //     // TODO add you
    }//GEN-LAST:event_jMenuItem1ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JFileChooser save = new JFileChooser();
        int option = save.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) 
        {
            try {
                // create a buffered writer to write to a file
                if(diaryArea.getText().length()>0)
                {
                BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                out.write(this.diaryArea.getText()); // write the contents of the TextArea to the file
                out.close();
             
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signgood", "root", "");
            System.out.println("connected");
            PreparedStatement stmt = null;
            //Calendar cal=new Calendar();
            Calendar cal=Calendar.getInstance();
            String date=Integer.toString(cal.get(Calendar.YEAR))+"-"+Integer.toString(cal.get(Calendar.MONTH)+1)+"-"+Integer.toString(cal.get(Calendar.DATE));
            String filename=save.getSelectedFile().toString();
            String mark;
            if(impCheck.isSelected())
                mark="yes";
            else 
                mark="no";
            
            String insertSql = "INSERT INTO `diary`( `email`,`filename`,`content`,`date`,`important`)  VALUES(?,?,?,?,?)";
            stmt = conn.prepareStatement(insertSql);
            stmt.setString(1,email);
            stmt.setString(2,save.getSelectedFile().getName().toString());
            stmt.setString(3,diaryArea.getText());  
            stmt.setString(4,date);
            stmt.setString(5,mark);
            System.out.println("EXECUTED");
            stmt.executeUpdate(); 
            }
                
            }
                catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
                
          
         

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        manager.undo();
    }//GEN-LAST:event_jMenuItem5ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        text=diaryArea.getSelectedText();
        diaryArea.replaceSelection("");// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        text=diaryArea.getSelectedText();
    }//GEN-LAST:event_jMenuItem8ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        diaryArea.insert(text,diaryArea.getCaretPosition());
    }//GEN-LAST:event_jMenuItem9ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

        diaryArea.setText(null);
    }//GEN-LAST:event_jMenuItem11ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        String word = diaryArea.getText();
        int findLen = word.length();
        Highlighter highlighter = diaryArea.getHighlighter();
        highlighter.removeAllHighlights();
        if(findLen >= 0) {
            String Text = diaryArea.getText();
            int index = Text.indexOf(word, 0);
            try
            {
                highlighter.addHighlight(index, findLen, DefaultHighlighter.DefaultPainter);
                diaryArea.selectAll();
            }
            catch(BadLocationException ex)
            {
                System.out.println("ERROR");
            }

        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        font = diaryArea.getFont();
        tempFont = new Font(font.getFontName(), font.getStyle(), font.getSize() + 2);
        diaryArea.setFont(tempFont);
    }//GEN-LAST:event_jMenuItem13ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        font = diaryArea.getFont();
        tempFont = new Font(font.getFontName(), font.getStyle(), font.getSize() - 2);

        diaryArea.setFont(tempFont);
    }//GEN-LAST:event_jMenuItem14ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Color initialcolor=Color.RED;
        Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);
        diaryArea.setBackground(color);
        String s = diaryArea.getSelectedText();

        System.out.println(s);            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        ChooseFont obj=new ChooseFont();
        //obj.setVisible(true);
        obj.displayFont(1);
    }//GEN-LAST:event_jMenuItem16ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        tempColor = JColorChooser.showDialog(new JPanel(), "Select a color", color);

        if(tempColor != null)
        color = tempColor;

        diaryArea.setForeground(this.tempColor);           // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        if(WrapText)
        {
            diaryArea.setLineWrap(false);
            WrapText = false;
        }
        else
        {
            diaryArea.setLineWrap(true);
            WrapText = true;
        }

    }//GEN-LAST:event_jMenuItem18ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        String a[]=diaryArea.getText().split(" ");
        String s;
        try
        {
            for(int i=0;i<a.length;i++)
            {
                BufferedReader br=new BufferedReader(new FileReader("dic.txt"));
                int c=0;
                while((s=br.readLine())!=null)
                {
                    if( s.equalsIgnoreCase(a[i]) )

                    c=1;
                }
                if(c==0)

                JOptionPane.showMessageDialog(this,a[i]+", cannot be found");
            }
        } catch (IOException ex) {
            Logger.getLogger(Diary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed

        GregorianCalendar cal = new GregorianCalendar();

        int m = cal.get(GregorianCalendar.MONTH);
        int y = cal.get(GregorianCalendar.YEAR);
        CalendarGui obj=new CalendarGui(m,y);
        obj.main(null);
        System.out.println(m+" "+y);
    }//GEN-LAST:event_jMenuItem20ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void reFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reFieldActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void replaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceActionPerformed
String Text = diaryArea.getText().
  replaceFirst(findField.getText(), reField.getText());

        

        diaryArea.setText(Text);         // TODO add your handling code here:
    }//GEN-LAST:event_replaceActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void addImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageActionPerformed
               JFileChooser fileChooser=new JFileChooser("C:\\Users\\");
               fileChooser.setFileSelectionMode(FILES_ONLY);
               fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("jpg", "jpg"));          
               fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("png", "png"));
               int val=fileChooser.showOpenDialog(null);
               if(val==JFileChooser.APPROVE_OPTION){
               File openFile = fileChooser.getSelectedFile();
               ImageIcon imageIcon = new ImageIcon(new ImageIcon(openFile.toString()).getImage().getScaledInstance(l.getWidth(),l.getHeight(), Image.SCALE_SMOOTH));
               l.setIcon(imageIcon);        
    }                          // TODO add your handling code here:
    }//GEN-LAST:event_addImageActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
Help obj=new Help();
obj.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void impCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impCheckActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        manager.redo();
    }//GEN-LAST:event_jMenuItem6ActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        String word = findField.getText();
        int findLen = word.length();
        Highlighter highlighter = diaryArea.getHighlighter();
        highlighter.removeAllHighlights();
        
        Highlighter.HighlightPainter otherword;
        otherword = new DefaultHighlighter.DefaultHighlightPainter(new Color(244, 235, 66));
        
        if(findLen > 0) {
            String Text = diaryArea.getText();
            int index = Text.indexOf(word, 0);
            while(index >= 0) {
                try {
                    
                    highlighter.addHighlight(index, index + findLen, otherword);
                    index = Text.indexOf(word, index + findLen);
                }
                catch(BadLocationException ex)
                {
                System.out.println("error!");
                        
                }
            }
        }               
        
    }//GEN-LAST:event_findActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void replaceAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceAllActionPerformed
String Text = diaryArea.getText().
               replaceAll(findField.getText(),reField.getText());
            
       diaryArea.setText(Text);               // TODO add your handling code here:
    }//GEN-LAST:event_replaceAllActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void findFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findFieldActionPerformed
//findField.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_findFieldActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(Diary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
           
    //   Connection
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diary().setVisible(true);
            }
        });
    }
//-----------------------------------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImage;
    private javax.swing.JLabel dateTime;
    public static javax.swing.JTextArea diaryArea;
    private javax.swing.JButton find;
    private javax.swing.JTextField findField;
    private javax.swing.JCheckBox impCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l;
    private javax.swing.JTextField reField;
    private javax.swing.JButton replace;
    private javax.swing.JButton replaceAll;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
//-----------------------------------------------------------------------------------------------------------------------------