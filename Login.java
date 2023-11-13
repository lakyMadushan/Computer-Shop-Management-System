
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        
        //username owner = laky
        //password = 123456
        
        //username cashir = dinu
        //password = 654321
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        register_btn = new javax.swing.JButton();
        username_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bg2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        setForeground(java.awt.Color.black);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIGIMAX MOBILE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        login_btn.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        login_btn.setForeground(new java.awt.Color(255, 255, 255));
        login_btn.setText("LOGIN");
        login_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 5, true));
        login_btn.setContentAreaFilled(false);
        login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 190, 50));

        register_btn.setBackground(new java.awt.Color(255, 255, 255));
        register_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        register_btn.setForeground(new java.awt.Color(255, 255, 255));
        register_btn.setText("If you are not a registered user, Just register now. !!!");
        register_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        register_btn.setContentAreaFilled(false);
        register_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });
        jPanel1.add(register_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 651, 600, 30));

        username_txt.setBackground(new java.awt.Color(255, 255, 255));
        username_txt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        username_txt.setForeground(new java.awt.Color(153, 153, 153));
        username_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_txt.setText("Enter Username");
        username_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        username_txt.setOpaque(false);
        username_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_txtMouseClicked(evt);
            }
        });
        username_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_txtActionPerformed(evt);
            }
        });
        username_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                username_txtKeyReleased(evt);
            }
        });
        jPanel1.add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 320, 50));

        password_txt.setBackground(javax.swing.UIManager.getDefaults().getColor("PasswordField.selectionBackground"));
        password_txt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        password_txt.setForeground(new java.awt.Color(255, 255, 255));
        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_txt.setText("jPasswordField1");
        password_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        password_txt.setOpaque(false);
        password_txt.setPreferredSize(new java.awt.Dimension(126, 30));
        password_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_txtMouseClicked(evt);
            }
        });
        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password_txtKeyReleased(evt);
            }
        });
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 320, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 760, 620, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("------ LOGIN ------");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 150, 20));

        bg2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login 2.png"))); // NOI18N
        jPanel1.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 770, 630));

        bg.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login 1.png"))); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtActionPerformed

    private void password_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseClicked
        // TODO add your handling code here:
        password_txt.setText(null);
        password_txt.setForeground(Color.WHITE);
    }//GEN-LAST:event_password_txtMouseClicked

    private void username_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_txtActionPerformed

    private void username_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_txtMouseClicked
        // TODO add your handling code here:
        username_txt.setText(null);
        username_txt.setForeground(Color.WHITE);
    }//GEN-LAST:event_username_txtMouseClicked

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        // TODO add your handling code here:
        Register r = new Register();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_register_btnActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        try {

            String tun = username_txt.getText();
            String tpw = password_txt.getText();
            ResultSet rs = dbcon.SEARCH("SELECT * FROM user");

            if(tun.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Enter Username Here!!!","ERROR",JOptionPane.ERROR_MESSAGE);
                username_txt.grabFocus();
            }else{
                if(tpw.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Please Enter Password Here!!!","ERROR",JOptionPane.ERROR_MESSAGE);
                    password_txt.grabFocus();
                }else{
                    while (rs.next()) {
                        String un = rs.getString("username");
                        String sk = rs.getString("serial_key");
                        String pw = rs.getString("password");

                        if(un.equals(tun)){
                            if(pw.equals(tpw)){
                                if(sk.equals("1")){
                                    Owner_Menu a = new Owner_Menu();
                                    a.setVisible(true);
                                    this.dispose();
                                    //break;
                                }else {
                                    Cashier_Menu c = new Cashier_Menu();
                                    c.setVisible(true);
                                    this.dispose();
                                    //break;
                                }
                            }else{
                                JOptionPane.showMessageDialog(this,"Please Enter Correct Password", "ERROR",JOptionPane.ERROR_MESSAGE);
                                password_txt.setText(null);
                                password_txt.grabFocus();

                            }
                        }else{
                            //JOptionPane.showMessageDialog(this,"Please Enter Correct Username", "ERROR",JOptionPane.ERROR_MESSAGE);
                            //username_txt.setText(null);
                            //username_txt.grabFocus();
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_login_btnActionPerformed

    private void username_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyReleased
        // TODO add your handling code here:
   
    }//GEN-LAST:event_username_txtKeyReleased

    private void password_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtKeyReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JButton register_btn;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
