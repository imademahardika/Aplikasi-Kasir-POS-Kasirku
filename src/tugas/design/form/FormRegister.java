/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas.design.form;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author I Made Mahardika D
 */
public class FormRegister extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null;

    /**
     * Creates new form FormRegister
     */

    public FormRegister() {
        initComponents();
    }

    private void hapuslayar() {
    txt_username.setText("");
    txt_nama.setText("");
    txt_email.setText("");
    txt_pass.setText("");
    txt_repass.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Header_Reg = new java.awt.Panel();
        Header_Kasirku = new javax.swing.JLabel();
        Header_Register = new javax.swing.JLabel();
        Panel_form = new java.awt.Panel();
        user_reg = new java.awt.Label();
        txt_username = new javax.swing.JTextField();
        nama_reg = new java.awt.Label();
        txt_nama = new javax.swing.JTextField();
        email_reg = new java.awt.Label();
        txt_email = new javax.swing.JTextField();
        pass_reg = new java.awt.Label();
        txt_pass = new javax.swing.JPasswordField();
        pass_reg2 = new java.awt.Label();
        txt_repass = new javax.swing.JPasswordField();
        return_button = new java.awt.Button();
        reg_button = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        show1 = new javax.swing.JToggleButton();
        show2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Header_Reg.setBackground(new java.awt.Color(204, 0, 0));

        Header_Kasirku.setFont(new java.awt.Font("Moonrising", 0, 24)); // NOI18N
        Header_Kasirku.setForeground(new java.awt.Color(255, 255, 255));
        Header_Kasirku.setText("APLIKASI KASIR-KU");

        Header_Register.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        Header_Register.setForeground(new java.awt.Color(255, 255, 255));
        Header_Register.setText("Menu Register");

        javax.swing.GroupLayout Panel_Header_RegLayout = new javax.swing.GroupLayout(Panel_Header_Reg);
        Panel_Header_Reg.setLayout(Panel_Header_RegLayout);
        Panel_Header_RegLayout.setHorizontalGroup(
            Panel_Header_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Header_RegLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(Panel_Header_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Header_RegLayout.createSequentialGroup()
                        .addComponent(Header_Kasirku)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Header_RegLayout.createSequentialGroup()
                        .addComponent(Header_Register)
                        .addGap(205, 205, 205))))
        );
        Panel_Header_RegLayout.setVerticalGroup(
            Panel_Header_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Header_RegLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header_Kasirku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Header_Register)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Panel_form.setBackground(new java.awt.Color(255, 204, 0));

        user_reg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        user_reg.setText("Username");

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        nama_reg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nama_reg.setText("Nama");

        txt_nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        email_reg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        email_reg.setText("E-mail");

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pass_reg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pass_reg.setText("Password");

        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });

        pass_reg2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pass_reg2.setText("Re-type Password");

        txt_repass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_repass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_repassActionPerformed(evt);
            }
        });

        return_button.setLabel("Return");
        return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_buttonActionPerformed(evt);
            }
        });

        reg_button.setLabel("Register");
        reg_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_buttonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));

        show1.setIcon(new javax.swing.ImageIcon("C:\\Users\\maded\\Downloads\\LOGOO.png")); // NOI18N
        show1.setBorderPainted(false);
        show1.setContentAreaFilled(false);
        show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show1ActionPerformed(evt);
            }
        });

        show2.setIcon(new javax.swing.ImageIcon("C:\\Users\\maded\\Downloads\\LOGOO.png")); // NOI18N
        show2.setBorderPainted(false);
        show2.setContentAreaFilled(false);
        show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_formLayout = new javax.swing.GroupLayout(Panel_form);
        Panel_form.setLayout(Panel_formLayout);
        Panel_formLayout.setHorizontalGroup(
            Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_formLayout.createSequentialGroup()
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_formLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(reg_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(Panel_formLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_reg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_repass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(show2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        Panel_formLayout.setVerticalGroup(
            Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_formLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_formLayout.createSequentialGroup()
                        .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_formLayout.createSequentialGroup()
                                .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass_reg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(show2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reg_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(Panel_formLayout.createSequentialGroup()
                        .addComponent(show1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Header_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Header_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reg_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_buttonActionPerformed
 
        try{
         if (txt_username.getText().equals("") && txt_nama.getText().equals("") && txt_email.getText().equals("")&&
             txt_pass.getText().equals("") && txt_repass.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Data Tidak Boleh Kosong!","Pesan", JOptionPane.ERROR_MESSAGE);
            hapuslayar();

        }else{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/db_poskasir","root","");
        st = con.createStatement();
        String simpan = "INSERT INTO tb_register values ('"+txt_username.getText()+"','" + String.valueOf(txt_nama.getText())+"','"
                +txt_email.getText()+"','" +txt_pass.getText()+"','" + txt_repass.getText()+"')";
        st = con.createStatement();
        int SA = st.executeUpdate(simpan);
        JOptionPane.showMessageDialog(this, "Registrasi Berhasil");
        this.setVisible(false);
        new FormLogin().setVisible(true);
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(this, "Akun sudah ada",
            "Pesan",JOptionPane.WARNING_MESSAGE);
    hapuslayar();
    }
    }//GEN-LAST:event_reg_buttonActionPerformed

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_return_buttonActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void txt_repassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_repassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_repassActionPerformed

    private void show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show1ActionPerformed
        // TODO add your handling code here:
        if(show1.isSelected())
            txt_pass.setEchoChar((char)0);
        else
            txt_pass.setEchoChar('*');  
    }//GEN-LAST:event_show1ActionPerformed

    private void show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show2ActionPerformed
        // TODO add your handling code here:
        if(show2.isSelected())
            txt_repass.setEchoChar((char)0);
        else
            txt_repass.setEchoChar('*');      

    }//GEN-LAST:event_show2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header_Kasirku;
    private javax.swing.JLabel Header_Register;
    private java.awt.Panel Panel_Header_Reg;
    private java.awt.Panel Panel_form;
    private java.awt.Label email_reg;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label nama_reg;
    private java.awt.Label pass_reg;
    private java.awt.Label pass_reg2;
    private java.awt.Button reg_button;
    private java.awt.Button return_button;
    private javax.swing.JToggleButton show1;
    private javax.swing.JToggleButton show2;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_repass;
    private javax.swing.JTextField txt_username;
    private java.awt.Label user_reg;
    // End of variables declaration//GEN-END:variables
}
