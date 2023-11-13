
import java.awt.Image;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Add_Component extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Add_Component() {
              
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        no_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        category_combo = new javax.swing.JComboBox<>();
        value_txt = new javax.swing.JTextField();
        edit_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Component");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(986, 774));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIGIMAX MOBILE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CATEGORY");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        no_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        no_txt.setForeground(new java.awt.Color(255, 255, 255));
        no_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        no_txt.setOpaque(false);
        jPanel1.add(no_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 404, 32));

        add_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("ADD");
        add_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        add_btn.setContentAreaFilled(false);
        add_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        jPanel1.add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, 40));

        remove_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        remove_btn.setForeground(new java.awt.Color(255, 255, 255));
        remove_btn.setText("REMOVE");
        remove_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        remove_btn.setContentAreaFilled(false);
        remove_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });
        jPanel1.add(remove_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 135, 40));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "VALUE", "NO"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setName("Components"); // NOI18N
        jTable1.setOpaque(false);
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(5);
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 290, 940, 379));

        back_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("BACK");
        back_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        back_btn.setContentAreaFilled(false);
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 690, 150, 45));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT NO.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAME");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        category_combo.setBackground(new java.awt.Color(153, 153, 153));
        category_combo.setEditable(true);
        category_combo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        category_combo.setForeground(new java.awt.Color(0, 0, 0));
        category_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CUSTOMER", "DISTRIBUTOR", "BRAND", "MODEL", "BANK ACCOUNT" }));
        category_combo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        category_combo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        category_combo.setOpaque(false);
        category_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_comboActionPerformed(evt);
            }
        });
        jPanel1.add(category_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 404, 40));

        value_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        value_txt.setForeground(new java.awt.Color(255, 255, 255));
        value_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        value_txt.setOpaque(false);
        jPanel1.add(value_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 404, 32));

        edit_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("EDIT");
        edit_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        edit_btn.setContentAreaFilled(false);
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 130, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("------ ADD COMPONENT -------");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 740, 620, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_com.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        // TODO add your handling code here:
        try {
          DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
          //String category = String.valueOf(jComboBox2.getSelectedItem());
          String category = category_combo.getSelectedItem().toString();
          int r = jTable1.getSelectedRow();
          String id = jTable1.getValueAt(r,0).toString();
          
          if(category.equals("CUSTOMER")){
             dtm.setRowCount(0);
             dbcon.IUD("DELETE FROM customer WHERE `id` = '"+id+"'");
             JOptionPane.showMessageDialog(this, "Customer Successfully Deleted","DONE!",JOptionPane.INFORMATION_MESSAGE);
             ResultSet rs = dbcon.SEARCH("SELECT * FROM customer");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String contact = rs.getString("contact");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(contact);
                  dtm.addRow(v);                  
              } 
          }else if(category.equals("DISTRIBUTOR")){
              dtm.setRowCount(0);
              dbcon.IUD("DELETE FROM distributor WHERE `id` = '"+id+"'");
              JOptionPane.showMessageDialog(this, "Distributor Successfully Deleted","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM distributor");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String contact = rs.getString("contact");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(contact);
                  dtm.addRow(v);                  
              }
          }else if(category.equals("BRAND")){
              dtm.setRowCount(0);
              dbcon.IUD("DELETE FROM brand WHERE `id` = '"+id+"'");
              JOptionPane.showMessageDialog(this, "Brand Successfully Deleted","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM brand");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");                  
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);                  
                  dtm.addRow(v);                  
              }
          }else if(category.equals("MODEL")){
              dtm.setRowCount(0);
              dbcon.IUD("DELETE FROM model WHERE `id` = '"+id+"'");
              JOptionPane.showMessageDialog(this, "Model Successfully Deleted","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM model");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");                  
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);                  
                  dtm.addRow(v);                  
              }
          }else if(category.equals("BANK ACCOUNT")){
              dtm.setRowCount(0);
              dbcon.IUD("DELETE FROM bank WHERE `id` = '"+id+"'");
              JOptionPane.showMessageDialog(this, "Bank Account Successfully Deleted","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM bank");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String account = rs.getString("account");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(account);
                  dtm.addRow(v);                  
              }
          }else{
              JOptionPane.showMessageDialog(this, "Please select a category!","ERROR!",JOptionPane.ERROR_MESSAGE);
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_remove_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        try {
          DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
          //String category = String.valueOf(jComboBox2.getSelectedItem());
          String category = category_combo.getSelectedItem().toString();          
          String value = value_txt.getText();
          String no = no_txt.getText();
          
          if(value.isEmpty()){
              JOptionPane.showMessageDialog(this, "Please Enter VALUE!","ERROR!",JOptionPane.ERROR_MESSAGE);
              value_txt.setText(null);
              value_txt.grabFocus();
          }else if(no.isEmpty()){
              JOptionPane.showMessageDialog(this, "Please Enter No!","ERROR!",JOptionPane.ERROR_MESSAGE);
              no_txt.setText(null);
              no_txt.grabFocus();
          }
          
          
          if(category.equals("CUSTOMER")){              
              dtm.setRowCount(0);
              //customer table data insert 
              dbcon.IUD("INSERT INTO customer (`name`,`contact`) VALUES ('"+value+"','"+no+"')");
              JOptionPane.showMessageDialog(this, "Successfuly Added Customer!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM customer");
              while(rs.next()){
                  String id = rs.getString("id");
                  String name = rs.getString("name");
                  String contact = rs.getString("contact");
                  Vector v = new Vector();
                  v.add(id);
                  v.add(name);
                  v.add(contact);
                  dtm.addRow(v);                  
              }
              
          }else if (category.equals("DISTRIBUTOR")) {
                //distributer table data insert
              dtm.setRowCount(0);             
              dbcon.IUD("INSERT INTO distributor (`name`,`contact`) VALUES ('"+value+"','"+no+"')");
              JOptionPane.showMessageDialog(this, "Successfuly Added Distributor!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM distributor");
              while(rs.next()){
                  String id = rs.getString("id");
                  String name = rs.getString("name");
                  String contact = rs.getString("contact");
                  Vector v = new Vector();
                  v.add(id);
                  v.add(name);
                  v.add(contact);
                  dtm.addRow(v);                  
              }
                
          }else if (category.equals("BRAND")) {
                //drand table data insert
              dtm.setRowCount(0);             
              dbcon.IUD("INSERT INTO brand (`name`) VALUES ('"+value+"')");
              JOptionPane.showMessageDialog(this, "Successfuly Added Brand!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM brand");
              while(rs.next()){
                  String id = rs.getString("id");
                  String name = rs.getString("name");                  
                  Vector v = new Vector();
                  v.add(id);
                  v.add(name);                  
                  dtm.addRow(v);                  
              }
                
            }else if (category.equals("MODEL")) {
                //model table data insert
              dtm.setRowCount(0);             
              dbcon.IUD("INSERT INTO model (`name`) VALUES ('"+value+"')");
              JOptionPane.showMessageDialog(this, "Successfuly Added Model!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM model");
              while(rs.next()){
                  String id = rs.getString("id");
                  String name = rs.getString("name");                  
                  Vector v = new Vector();
                  v.add(id);
                  v.add(name);                  
                  dtm.addRow(v);                  
              }
            }else if (category.equals("BANK ACCOUNT")) {
                //bank account table data insert
              dtm.setRowCount(0);             
              dbcon.IUD("INSERT INTO bank (`name`,`account`) VALUES ('"+value+"','"+no+"')");
              JOptionPane.showMessageDialog(this, "Successfuly Added Bank Account!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM bank");
              while(rs.next()){
                  String id = rs.getString("id");
                  String name = rs.getString("name");
                  String account = rs.getString("account");
                  Vector v = new Vector();
                  v.add(id);
                  v.add(name);
                  v.add(account);
                  dtm.addRow(v);                  
              }
            }else{
                JOptionPane.showMessageDialog(this, "Please select a category!","ERROR!",JOptionPane.ERROR_MESSAGE);
            }
          value_txt.setText(null);
          no_txt.setText(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        try {
          DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
          //String category = String.valueOf(jComboBox2.getSelectedItem());
          String category = category_combo.getSelectedItem().toString();          
          int r = jTable1.getSelectedRow();
          String id = jTable1.getValueAt(r,0).toString();
          String value = jTable1.getValueAt(r,1).toString();
          String no = jTable1.getValueAt(r,2).toString();
          
          if(category.equals("CUSTOMER")){        
              //customer table data insert 
              dtm.setRowCount(0);
              dbcon.IUD("UPDATE customer SET `name` = '"+value+"' WHERE `id` = '"+id+"' ");
              dbcon.IUD("UPDATE customer SET `contact` = '"+no+"' WHERE `id` = '"+id+"' ");
              JOptionPane.showMessageDialog(this, "Successfuly Update Customer!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM customer");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String contact = rs.getString("contact");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(contact);
                  dtm.addRow(v);                  
              }
              
          }else if (category.equals("DISTRIBUTOR")) {
                //distributer table data insert
               dtm.setRowCount(0);
              dbcon.IUD("UPDATE distributor SET `name` = '"+value+"' WHERE `id` = '"+id+"' ");
              dbcon.IUD("UPDATE distributor SET `contact` = '"+no+"' WHERE `id` = '"+id+"' ");
              JOptionPane.showMessageDialog(this, "Successfuly Update Distributor!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM distributor");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String contact = rs.getString("contact");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(contact);
                  dtm.addRow(v);                  
              }
                
          }else if (category.equals("BRAND")) {
                //drand table data insert
              dtm.setRowCount(0);             
              dbcon.IUD("UPDATE brand SET `name` = '"+value+"' WHERE `id` = '"+id+"' ");
              dbcon.IUD("UPDATE brand SET `contact` = '"+no+"' WHERE `id` = '"+id+"' ");
              JOptionPane.showMessageDialog(this, "Successfuly Update Brand!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM brand");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");                  
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);                  
                  dtm.addRow(v);                  
              }
                
            }else if (category.equals("MODEL")) {
                //model table data insert
              dtm.setRowCount(0);             
              dbcon.IUD("UPDATE model SET `name` = '"+value+"' WHERE `id` = '"+id+"' ");
              dbcon.IUD("UPDATE model SET `contact` = '"+no+"' WHERE `id` = '"+id+"' ");
              JOptionPane.showMessageDialog(this, "Successfuly Update Model!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM model");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");                  
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);                  
                  dtm.addRow(v);                  
              }
            }else if (category.equals("BANK ACCOUNT")) {
                //bank account table data insert
              dtm.setRowCount(0);             
              dbcon.IUD("UPDATE bank SET `name` = '"+value+"' WHERE `id` = '"+id+"' ");
              dbcon.IUD("UPDATE bank SET `contact` = '"+no+"' WHERE `id` = '"+id+"' ");
              JOptionPane.showMessageDialog(this, "Successfuly Update Bank Account!","DONE!",JOptionPane.INFORMATION_MESSAGE);
              ResultSet rs = dbcon.SEARCH("SELECT * FROM bank");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String account = rs.getString("account");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(account);
                  dtm.addRow(v);                  
              }
            
            }else{
                JOptionPane.showMessageDialog(this, "Please select a category!","ERROR!",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  
        
    }//GEN-LAST:event_edit_btnActionPerformed

    private void category_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_comboActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
          //String category = String.valueOf(jComboBox2.getSelectedItem());
          String category = category_combo.getSelectedItem().toString();
          
          if(category.equals("CUSTOMER")){
             dtm.setRowCount(0); 
             ResultSet rs = dbcon.SEARCH("SELECT * FROM customer");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String contact = rs.getString("contact");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(contact);
                  dtm.addRow(v);                  
              } 
          }else if(category.equals("DISTRIBUTOR")){
              dtm.setRowCount(0); 
              ResultSet rs = dbcon.SEARCH("SELECT * FROM distributor");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String contact = rs.getString("contact");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(contact);
                  dtm.addRow(v);                  
              }
          }else if(category.equals("BRAND")){
              dtm.setRowCount(0); 
              ResultSet rs = dbcon.SEARCH("SELECT * FROM brand");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");                  
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);                  
                  dtm.addRow(v);                  
              }
          }else if(category.equals("MODEL")){
              dtm.setRowCount(0); 
              ResultSet rs = dbcon.SEARCH("SELECT * FROM model");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");                  
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);                  
                  dtm.addRow(v);                  
              }
          }else if(category.equals("BANK ACCOUNT")){
              dtm.setRowCount(0); 
              ResultSet rs = dbcon.SEARCH("SELECT * FROM bank");
              while(rs.next()){
                  String id1 = rs.getString("id");
                  String name = rs.getString("name");
                  String account = rs.getString("account");
                  Vector v = new Vector();
                  v.add(id1);
                  v.add(name);
                  v.add(account);
                  dtm.addRow(v);                  
              }
          }else{
              JOptionPane.showMessageDialog(this, "Please select a category!","ERROR!",JOptionPane.ERROR_MESSAGE);
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_category_comboActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Cashier_Menu cm = new Cashier_Menu();
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox<String> category_combo;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField no_txt;
    private javax.swing.JButton remove_btn;
    private javax.swing.JTextField value_txt;
    // End of variables declaration//GEN-END:variables
}
