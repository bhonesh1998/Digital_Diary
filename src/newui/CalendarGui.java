package newui;
//-----------------------------------------------------------------------------------------------------------------------------
import java.awt.Color;
import java.awt.Component;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
//-----------------------------------------------------------------------------------------------------------------------------
/*
  @author BHONESH
 */

public class CalendarGui extends javax.swing.JFrame {
static int realYear, realMonth, realDay, currentYear, currentMonth;
   
 
    public CalendarGui() {
        initComponents();
    }
 //-----------------------------------------------------------------------------------------------------------------------------
 public CalendarGui(int m,int y) {
        initComponents();
        refreshCalendar(m,y);
    }
//-----------------------------------------------------------------------------------------------------------------------------   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        calTable = new javax.swing.JTable();
        yearName = new javax.swing.JComboBox<>();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        monthName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        calTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
            }
        ));
        calTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calTable);

        yearName.setBackground(new java.awt.Color(204, 0, 204));
        yearName.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        yearName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", "2101", "2102", "2103", "2104", "2105", "2106", "2107", "2108", "2109", "2110", "2111", "2112", "2113", "2114", "2115", "2116", "2117" }));
        yearName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearNameActionPerformed(evt);
            }
        });

        previous.setBackground(new java.awt.Color(255, 51, 51));
        previous.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(255, 51, 51));
        next.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        monthName.setBackground(new java.awt.Color(255, 51, 51));
        monthName.setFont(new java.awt.Font("Bell MT", 2, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(previous)
                .addGap(185, 185, 185)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(monthName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228)
                .addComponent(yearName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previous)
                    .addComponent(next))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//-----------------------------------------------------------------------------------------------------------------------------
    private void yearNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearNameActionPerformed
        // TODO add your handling code here:
        if (yearName.getSelectedItem() != null){
                String b = yearName.getSelectedItem().toString();
                currentYear = Integer.parseInt(b);
                refreshCalendar(currentMonth, currentYear);
            }
    }//GEN-LAST:event_yearNameActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        
           if (currentMonth == 11){ 
                currentMonth = 0;
                currentYear += 1;
            }
            else{ 
                currentMonth += 1;
            }
            refreshCalendar(currentMonth, currentYear);
    }//GEN-LAST:event_nextActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
      
          if (currentMonth == 0){ 
                currentMonth = 11;
                currentYear -= 1;
            }
            else{ 
                currentMonth -= 1;
            }
            refreshCalendar(currentMonth, currentYear);
    }//GEN-LAST:event_previousActionPerformed
//-----------------------------------------------------------------------------------------------------------------------------
    private void calTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calTableMouseClicked
       JTable target = (JTable)evt.getSource();
      int row = target.getSelectedRow();
      int column = target.getSelectedColumn();
      Object d=calTable.getValueAt(row, column);
      //System.out.println();    
      int m,y;
      if(monthName.getText().equals("January"))
          m=1;
      else if(monthName.getText().equals("February"))
          m=2;
       else if(monthName.getText().equals("March"))
          m=3;
       else if(monthName.getText().equals("April"))
          m=4;
        else if(monthName.getText().equals("May"))
          m=5;
         else if(monthName.getText().equals("June"))
          m=6;
         else if(monthName.getText().equals("July"))
          m=7;
          else if(monthName.getText().equals("August"))
          m=8;
           else if(monthName.getText().equals("September"))
          m=9;
            else if(monthName.getText().equals("October"))
          m=10;
          else if(monthName.getText().equals("November"))
          m=11;
       else 
          m=12;
      y=Integer.parseInt((String)yearName.getSelectedItem());
      String reqDate=y+"-"+m+"-"+d;
        System.out.println(reqDate);
        CalendarAdd obj=new CalendarAdd(reqDate);
        obj.setVisible(true);
        this.setVisible(false);
        
         
    }//GEN-LAST:event_calTableMouseClicked

 //-----------------------------------------------------------------------------------------------------------------------------   
      public static void refreshCalendar(int month, int year){
        //Variables
        String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int nod, som;  
        previous.setEnabled(true);
        next.setEnabled(true);
        if (month == 0 && year <= realYear-100){previous.setEnabled(false);} 
        if (month == 11 && year >= realYear+100){next.setEnabled(false);}
        monthName.setText(months[month]); 
        monthName.setBounds(160-monthName.getPreferredSize().width/2, 25, 180, 25); 
        yearName.setSelectedItem(String.valueOf(year)); 
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                calTable.setValueAt(null, i, j);
            }
        }
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        som = cal.get(GregorianCalendar.DAY_OF_WEEK);
        for (int i=1; i<=nod; i++){
            int row = new Integer((i+som-2)/7);
            int column  =  (i+som-2)%7;
            JButton a=new JButton(i+"");            
                         
            calTable.add(a,row,column);
            calTable.setValueAt(i, row, column);
        }
        calTable.setDefaultRenderer(calTable.getColumnClass(0), new tblCalendarRenderer());
    }
      static class tblCalendarRenderer extends DefaultTableCellRenderer{
        @Override
        public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            if (column == 0 || column == 6){ //Week-end
                setBackground(new Color(33, 187, 183));
            }
            else{ 
                setBackground(new Color(33, 187, 183));
            }
            if (value != null){
                if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
                    setBackground(new Color(33, 187, 183));
                }
            }
            setBorder(null);
            setForeground(Color.black);
            return this;
        }
    }
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
            java.util.logging.Logger.getLogger(CalendarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
      
        GregorianCalendar cal = new GregorianCalendar(); //Create calendar
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;
                
       // refreshCalendar(9, 2017);
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalendarGui().setVisible(true);
                refreshCalendar(currentMonth,currentYear);
            }
        });
    }
//-----------------------------------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable calTable;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel monthName;
    private static javax.swing.JButton next;
    private static javax.swing.JButton previous;
    private static javax.swing.JComboBox<String> yearName;
    // End of variables declaration//GEN-END:variables
}
//-----------------------------------------------------------------------------------------------------------------------------