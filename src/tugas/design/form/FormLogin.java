/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas.design.form;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author I Made Mahardika D
 */
public class FormLogin extends javax.swing.JFrame {
    Connection conn = null;
    Statement st = null;

    /**
     * Creates new form FormLogin
     */

    public FormLogin() {
        initComponents();
    try{
        Class.forName("com.mysql.jdbc.Driver");

    conn = DriverManager.getConnection("jdbc:mysql://localhost/db_poskasir","root","");
        st = conn.createStatement();
        JOptionPane.showMessageDialog(null, "Koneksi Berhasil!");
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Koneksi Gagal!" + ex);
    }
    }

    private void CekLogin(){
        try{
            if(txt_username.getText().equals("") && txt_pass.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Data Tidak Boleh Kosong!", "Pesan", JOptionPane.ERROR_MESSAGE);
                txt_username.requestFocus();
                HapusLayar();
            }else{
                st = conn.createStatement();
            String sql = ("SELECT *FROM tb_register WHERE Username ='"+txt_username.getText()+"' AND pass ='"+txt_pass.getText()+"'");
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                this.dispose();
                new MenuOpsi().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Username dan Password Anda Salah\nAtau Akun Belum Diregistrasi",
                    "Pesan",JOptionPane.WARNING_MESSAGE);
                    HapusLayar();
            }
            }
        }catch(Exception e){
        e.printStackTrace();
        }
    }

    private void HapusLayar(){
        txt_username.setText("");
        txt_pass.setText("");
        txt_username.setEnabled(true);
        txt_pass.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.xx
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Header = new java.awt.Panel();
        Header_kasirku = new javax.swing.JLabel();
        Header_Login = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        Panel_form = new java.awt.Panel();
        user_login = new java.awt.Label();
        txt_username = new javax.swing.JTextField();
        pass_login = new java.awt.Label();
        txt_pass = new javax.swing.JPasswordField();
        SignIn_button = new java.awt.Button();
        register_button = new java.awt.Button();
        show1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Header.setBackground(new java.awt.Color(204, 0, 0));

        Header_kasirku.setFont(new java.awt.Font("Moonrising", 0, 24)); // NOI18N
        Header_kasirku.setForeground(new java.awt.Color(255, 255, 255));
        Header_kasirku.setText("APLIKASI KASIR-KU");

        Header_Login.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        Header_Login.setForeground(new java.awt.Color(255, 255, 255));
        Header_Login.setText("Menu Login");

        button1.setLabel("Exit");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_HeaderLayout = new javax.swing.GroupLayout(Panel_Header);
        Panel_Header.setLayout(Panel_HeaderLayout);
        Panel_HeaderLayout.setHorizontalGroup(
            Panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HeaderLayout.createSequentialGroup()
                .addGroup(Panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_HeaderLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Header_kasirku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_HeaderLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(Header_Login)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_HeaderLayout.setVerticalGroup(
            Panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_HeaderLayout.createSequentialGroup()
                .addGroup(Panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_HeaderLayout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(Header_kasirku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(Panel_HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Header_Login)
                .addGap(16, 16, 16))
        );

        Panel_form.setBackground(new java.awt.Color(255, 204, 0));

        user_login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        user_login.setText("Username");

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        pass_login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pass_login.setText("Password");

        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        SignIn_button.setLabel("Sign In");
        SignIn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn_buttonActionPerformed(evt);
            }
        });

        register_button.setLabel("Create an account");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        show1.setBackground(new java.awt.Color(255, 204, 0));
        show1.setIcon(new javax.swing.ImageIcon("C:\\Users\\maded\\Downloads\\LOGOO.png")); // NOI18N
        show1.setBorderPainted(false);
        show1.setContentAreaFilled(false);
        show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_formLayout = new javax.swing.GroupLayout(Panel_form);
        Panel_form.setLayout(Panel_formLayout);
        Panel_formLayout.setHorizontalGroup(
            Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_formLayout.createSequentialGroup()
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_formLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(user_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_formLayout.createSequentialGroup()
                                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Panel_formLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignIn_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        Panel_formLayout.setVerticalGroup(
            Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_formLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignIn_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignIn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn_buttonActionPerformed
        try{
            if(txt_username.getText().equals("") && txt_pass.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Data Tidak Boleh Kosong!", "Pesan", JOptionPane.ERROR_MESSAGE);
                txt_username.requestFocus();
                HapusLayar();
            }else{
                st = conn.createStatement();
            String sql = ("SELECT * FROM tb_register WHERE Username ='"+txt_username.getText()+"' AND pass ='"+txt_pass.getText()+"'");
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                this.dispose();
                new MenuOpsi().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Username dan Password Anda Salah\nAtau Akun Belum Diregistrasi",
                    "Pesan",JOptionPane.WARNING_MESSAGE);
                    HapusLayar();
            }
            }
        }catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_SignIn_buttonActionPerformed

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        // TODO add your handling code here:
    this.setVisible(false);
    new FormRegister().setVisible(true);
    }//GEN-LAST:event_register_buttonActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show1ActionPerformed
        // TODO add your handling code here:
        if(show1.isSelected())
            txt_pass.setEchoChar((char)0);
        else
            txt_pass.setEchoChar('*');  
    }//GEN-LAST:event_show1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header_Login;
    private javax.swing.JLabel Header_kasirku;
    private java.awt.Panel Panel_Header;
    private java.awt.Panel Panel_form;
    private java.awt.Button SignIn_button;
    private java.awt.Button button1;
    private java.awt.Label pass_login;
    private java.awt.Button register_button;
    private javax.swing.JToggleButton show1;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_username;
    private java.awt.Label user_login;
    // End of variables declaration//GEN-END:variables
}
