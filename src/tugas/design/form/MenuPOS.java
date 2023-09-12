/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas.design.form;

import Database.koneksi;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author I Made Mahardika D
 */
public class MenuPOS extends javax.swing.JFrame {

    /**
     * Creates new form MenuPOS
     */
    /**
     *
     */
    public void clock(){
        new Thread(){
            public void run(){
                int time = 0;
                while (time==0){
                    Calendar kalender = new GregorianCalendar();

                    int jam = kalender.get(Calendar.HOUR);
                    int menit = kalender.get(Calendar.MINUTE);
                    int detik = kalender.get(Calendar.SECOND);
                    int am_pm = kalender.get(Calendar.AM_PM);

                    String day_night = "";
                    if (am_pm == 1){
                        day_night = "PM";
                    }else{
                        day_night = "AM";
                    }
                
                    String timeformat = jam + ":" + menit + ":" + detik + " " + day_night;
                    lbltime.setText(timeformat);
                }
            }
        }.start();
    }

    public void tanggal(){
    java.util.Date tglskr = new java.util.Date();
    SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd-MMMMMMMMM-yyyy", Locale.getDefault());
    String tgl = smpdtfmt.format(tglskr);
    lbltgl.setText(tgl);
    }

    NumberFormat nf = NumberFormat.getInstance(new Locale("in", "ID"));

    public MenuPOS() {
        initComponents();
        KodeBarang();
        Total();
        clock();
        tanggal();
    }

    private void Total(){
        txt_qty.getDocument().addDocumentListener(new javax.swing.event.DocumentListener(){
        @Override
        public void insertUpdate(DocumentEvent arg0){
        try{
            int hasil = 0;
            if(txt_qty.getText().equals("")){
                hasil = Integer.parseInt(txt_hrgbrg.getText().replace(".", "")) * 0;
            }else{
                hasil = Integer.parseInt(txt_hrgbrg.getText().replace(".", "")) *
                        Integer.parseInt(txt_qty.getText());
            }
            txt_jmlhrg.setText(nf.format(hasil));
        }catch (Exception e){
        }    
        }

        @Override
        public void removeUpdate(DocumentEvent arg0) {
        try{
            int hasil = 0;
            if(txt_qty.getText().equals("")){
                hasil = Integer.parseInt(txt_hrgbrg.getText().replace(".", "")) * 0;
            }else{
                hasil = Integer.parseInt(txt_hrgbrg.getText().replace(".", "")) *
                        Integer.parseInt(txt_qty.getText());
            }
            txt_jmlhrg.setText(nf.format(hasil));
        }catch (Exception e){
        }
        }

        @Override
        public void changedUpdate(DocumentEvent arg0) {
        try{
            int hasil = 0;
            if(txt_qty.getText().equals("")){
                hasil = Integer.parseInt(txt_hrgbrg.getText().replace(".", "")) * 0;
            }else{
                hasil = Integer.parseInt(txt_hrgbrg.getText().replace(".", "")) *
                        Integer.parseInt(txt_qty.getText());
            }
            txt_jmlhrg.setText(nf.format(hasil));
        }catch (Exception e){
        }
        }
        });
    }

    private void KodeBarang(){
        txt_kdbrg.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent arg0){
            String KodeBarang;
            KodeBarang = (String) txt_kdbrg.getText().toUpperCase();

            switch(KodeBarang){
                case "BR0001":
                    txt_nmbrg.setText("Aqua Botol 600ml");
                    txt_hrgbrg.setText(nf.format(3000));
                    txt_qty.grabFocus();
                    break;
                case "BR0002":
                    txt_nmbrg.setText("Aqua Botol 1500ml");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0003":
                    txt_nmbrg.setText("Fruit Tea All Var 500ml ");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0004":
                    txt_nmbrg.setText("Susu Kedelai Naraya");
                    txt_hrgbrg.setText(nf.format(6000));
                    txt_qty.grabFocus();
                    break;
                case "BR0005":
                    txt_nmbrg.setText("Teh Kotak");
                    txt_hrgbrg.setText(nf.format(4000));
                    txt_qty.grabFocus();
                    break;
                case "BR0006":
                    txt_nmbrg.setText("Teh Pucuk 350ml");
                    txt_hrgbrg.setText(nf.format(4000));
                    txt_qty.grabFocus();
                    break;
                case "BR0007":
                    txt_nmbrg.setText("Pocari Sweat 350ml");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0008":
                    txt_nmbrg.setText("Fanta All Var 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0009":
                    txt_nmbrg.setText("Coca Cola 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0010":
                    txt_nmbrg.setText("Sprite 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0011":
                    txt_nmbrg.setText("Chitato 68gr");
                    txt_hrgbrg.setText(nf.format(9000));
                    txt_qty.grabFocus();
                    break;
                case "BR0012":
                    txt_nmbrg.setText("Walens Soes All Var");
                    txt_hrgbrg.setText(nf.format(10000));
                    txt_qty.grabFocus();
                    break;
                case "BR0013":
                    txt_nmbrg.setText("Keripik Kentang");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0014":
                    txt_nmbrg.setText("Keripik Tempe");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0015":
                    txt_nmbrg.setText("Oreo Wafer");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0016":
                    txt_nmbrg.setText("Nabati Wafer All Var");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0017":
                    txt_nmbrg.setText("Silverqueen ukuran kecil");
                    txt_hrgbrg.setText(nf.format(12000));
                    txt_qty.grabFocus();
                    break;  
                case "BR0018":
                    txt_nmbrg.setText("Silverqueen ukuran besar");
                    txt_hrgbrg.setText(nf.format(22000));
                    txt_qty.grabFocus();
                    break;
                case "BR0019":
                    txt_nmbrg.setText("Piattos 75gr All Var");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0020":
                    txt_nmbrg.setText("Go Potato 60gr");
                    txt_hrgbrg.setText(nf.format(6000));
                    txt_qty.grabFocus();
                    break;     
                default:
                    txt_nmbrg.setText("");
                    txt_hrgbrg.setText("");
                }                
            }

        @Override
        public void removeUpdate(DocumentEvent arg0) {
            String KodeBarang;
            KodeBarang = (String) txt_kdbrg.getText().toUpperCase();

            switch(KodeBarang){
                case "BR0001":
                    txt_nmbrg.setText("Aqua Botol 600ml");
                    txt_hrgbrg.setText(nf.format(3000));
                    txt_qty.grabFocus();
                    break;
                case "BR0002":
                    txt_nmbrg.setText("Aqua Botol 1500ml");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0003":
                    txt_nmbrg.setText("Fruit Tea All Var 500ml ");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0004":
                    txt_nmbrg.setText("Susu Kedelai Naraya");
                    txt_hrgbrg.setText(nf.format(6000));
                    txt_qty.grabFocus();
                    break;
                case "BR0005":
                    txt_nmbrg.setText("Teh Kotak");
                    txt_hrgbrg.setText(nf.format(4000));
                    txt_qty.grabFocus();
                    break;
                case "BR0006":
                    txt_nmbrg.setText("Teh Pucuk 350ml");
                    txt_hrgbrg.setText(nf.format(4000));
                    txt_qty.grabFocus();
                    break;
                case "BR0007":
                    txt_nmbrg.setText("Pocari Sweat 350ml");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0008":
                    txt_nmbrg.setText("Fanta All Var 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0009":
                    txt_nmbrg.setText("Coca Cola 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0010":
                    txt_nmbrg.setText("Sprite 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0011":
                    txt_nmbrg.setText("Chitato 68gr");
                    txt_hrgbrg.setText(nf.format(9000));
                    txt_qty.grabFocus();
                    break;
                case "BR0012":
                    txt_nmbrg.setText("Walens Soes All Var");
                    txt_hrgbrg.setText(nf.format(10000));
                    txt_qty.grabFocus();
                    break;
                case "BR0013":
                    txt_nmbrg.setText("Keripik Kentang");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0014":
                    txt_nmbrg.setText("Keripik Tempe");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0015":
                    txt_nmbrg.setText("Oreo Wafer");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0016":
                    txt_nmbrg.setText("Nabati Wafer All Var");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0017":
                    txt_nmbrg.setText("Silverqueen ukuran kecil");
                    txt_hrgbrg.setText(nf.format(12000));
                    txt_qty.grabFocus();
                    break;  
                case "BR0018":
                    txt_nmbrg.setText("Silverqueen ukuran besar");
                    txt_hrgbrg.setText(nf.format(22000));
                    txt_qty.grabFocus();
                    break;
                case "BR0019":
                    txt_nmbrg.setText("Piattos 75gr All Var");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0020":
                    txt_nmbrg.setText("Go Potato 60gr");
                    txt_hrgbrg.setText(nf.format(6000));
                    txt_qty.grabFocus();
                    break;                
                default:
                    txt_nmbrg.setText("");
                    txt_hrgbrg.setText("");
                }
        }

        @Override
        public void changedUpdate(DocumentEvent arg0) {
            String KodeBarang;
            KodeBarang = (String) txt_kdbrg.getText().toUpperCase();

            switch(KodeBarang){
                case "BR0001":
                    txt_nmbrg.setText("Aqua Botol 600ml");
                    txt_hrgbrg.setText(nf.format(3000));
                    txt_qty.grabFocus();
                    break;
                case "BR0002":
                    txt_nmbrg.setText("Aqua Botol 1500ml");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0003":
                    txt_nmbrg.setText("Fruit Tea All Var 500ml ");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0004":
                    txt_nmbrg.setText("Susu Kedelai Naraya");
                    txt_hrgbrg.setText(nf.format(6000));
                    txt_qty.grabFocus();
                    break;
                case "BR0005":
                    txt_nmbrg.setText("Teh Kotak");
                    txt_hrgbrg.setText(nf.format(4000));
                    txt_qty.grabFocus();
                    break;
                case "BR0006":
                    txt_nmbrg.setText("Teh Pucuk 350ml");
                    txt_hrgbrg.setText(nf.format(4000));
                    txt_qty.grabFocus();
                    break;
                case "BR0007":
                    txt_nmbrg.setText("Pocari Sweat 350ml");
                    txt_hrgbrg.setText(nf.format(7000));
                    txt_qty.grabFocus();
                    break;
                case "BR0008":
                    txt_nmbrg.setText("Fanta All Var 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0009":
                    txt_nmbrg.setText("Coca Cola 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0010":
                    txt_nmbrg.setText("Sprite 390ml");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0011":
                    txt_nmbrg.setText("Chitato 68gr");
                    txt_hrgbrg.setText(nf.format(9000));
                    txt_qty.grabFocus();
                    break;
                case "BR0012":
                    txt_nmbrg.setText("Walens Soes All Var");
                    txt_hrgbrg.setText(nf.format(10000));
                    txt_qty.grabFocus();
                    break;
                case "BR0013":
                    txt_nmbrg.setText("Keripik Kentang");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0014":
                    txt_nmbrg.setText("Keripik Tempe");
                    txt_hrgbrg.setText(nf.format(5000));
                    txt_qty.grabFocus();
                    break;
                case "BR0015":
                    txt_nmbrg.setText("Oreo Wafer");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0016":
                    txt_nmbrg.setText("Nabati Wafer All Var");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0017":
                    txt_nmbrg.setText("Silverqueen ukuran kecil");
                    txt_hrgbrg.setText(nf.format(12000));
                    txt_qty.grabFocus();
                    break;  
                case "BR0018":
                    txt_nmbrg.setText("Silverqueen ukuran besar");
                    txt_hrgbrg.setText(nf.format(22000));
                    txt_qty.grabFocus();
                    break;
                case "BR0019":
                    txt_nmbrg.setText("Piattos 75gr All Var");
                    txt_hrgbrg.setText(nf.format(8000));
                    txt_qty.grabFocus();
                    break;
                case "BR0020":
                    txt_nmbrg.setText("Go Potato 60gr");
                    txt_hrgbrg.setText(nf.format(6000));
                    txt_qty.grabFocus();
                    break;     
                default:
                    txt_nmbrg.setText("");
                    txt_hrgbrg.setText("");
                }
        }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header1 = new javax.swing.JLabel();
        header2 = new javax.swing.JLabel();
        lbl_total_harga = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kd_brg = new javax.swing.JLabel();
        txt_kdbrg = new javax.swing.JTextField();
        nm_brg = new javax.swing.JLabel();
        txt_nmbrg = new javax.swing.JTextField();
        hrg_brg = new javax.swing.JLabel();
        txt_hrgbrg = new javax.swing.JTextField();
        qty = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        jml_hrg = new javax.swing.JLabel();
        txt_jmlhrg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_list = new javax.swing.JTable();
        lbl_item = new javax.swing.JLabel();
        lbl_nilai_item = new javax.swing.JLabel();
        lbl_jmlharga = new javax.swing.JLabel();
        txt_totalhrg = new javax.swing.JTextField();
        btn_logout = new javax.swing.JButton();
        btn_hps = new javax.swing.JButton();
        lbl_byr = new javax.swing.JLabel();
        txt_byr = new javax.swing.JTextField();
        lbl_kembalian = new javax.swing.JLabel();
        txt_kbl = new javax.swing.JTextField();
        lbltime = new javax.swing.JLabel();
        lbltgl = new javax.swing.JLabel();
        id_trx = new javax.swing.JLabel();
        txt_trans = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        header1.setFont(new java.awt.Font("Moonrising", 0, 24)); // NOI18N
        header1.setForeground(new java.awt.Color(255, 255, 255));
        header1.setText("APLIKASI KASIR-KU");

        header2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        header2.setForeground(new java.awt.Color(255, 255, 255));
        header2.setText("Menu POS Kasir");

        lbl_total_harga.setFont(new java.awt.Font("Calculator", 1, 56)); // NOI18N
        lbl_total_harga.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total_harga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_total_harga.setText("Rp.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header2)
                    .addComponent(header1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(header1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(header2)))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        kd_brg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        kd_brg.setText("Kode Barang");

        txt_kdbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kdbrgActionPerformed(evt);
            }
        });

        nm_brg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nm_brg.setText("Nama Barang");

        hrg_brg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        hrg_brg.setText("Harga Barang");

        qty.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        qty.setText("Quantity");

        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });

        jml_hrg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jml_hrg.setText("Jumlah Harga");

        tbl_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Harga Barang", "Quantity", "Jumlah Harga"
            }
        ));
        jScrollPane1.setViewportView(tbl_list);

        lbl_item.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_item.setText("Item yang Dibeli:");

        lbl_nilai_item.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_nilai_item.setText("0");

        lbl_jmlharga.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_jmlharga.setText("Total Harga");

        btn_logout.setText("Exit");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_hps.setText("Hapus");
        btn_hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hpsActionPerformed(evt);
            }
        });

        lbl_byr.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_byr.setText("Bayar");

        txt_byr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_byrActionPerformed(evt);
            }
        });

        lbl_kembalian.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_kembalian.setText("Kembalian");

        lbltime.setFont(new java.awt.Font("DS-Digital", 1, 36)); // NOI18N
        lbltime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltime.setText("Waktu");

        lbltgl.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltgl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltgl.setText("Hari dan Tanggal");

        id_trx.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        id_trx.setText("Id Transaksi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(585, 585, 585)
                                .addComponent(lbl_kembalian)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl_item)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_nilai_item))
                                    .addComponent(btn_hps))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_byr)
                                    .addComponent(lbl_jmlharga))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_kbl)
                            .addComponent(txt_byr)
                            .addComponent(txt_totalhrg, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id_trx)
                    .addComponent(qty)
                    .addComponent(jml_hrg)
                    .addComponent(hrg_brg)
                    .addComponent(nm_brg)
                    .addComponent(kd_brg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nmbrg)
                    .addComponent(txt_kdbrg)
                    .addComponent(txt_qty)
                    .addComponent(txt_hrgbrg)
                    .addComponent(txt_jmlhrg)
                    .addComponent(txt_trans, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbltime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltgl, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbltgl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_trx)
                            .addComponent(txt_trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_kdbrg)
                            .addComponent(kd_brg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nmbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nm_brg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_hrgbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrg_brg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qty))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jmlhrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jml_hrg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_jmlharga)
                    .addComponent(txt_totalhrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_item)
                    .addComponent(lbl_nilai_item))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_byr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_byr)
                    .addComponent(btn_hps))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_kembalian)
                    .addComponent(btn_logout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed
        // TODO add your handling code here:
        if(txt_qty.getText().equals("")){
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel) tbl_list.getModel();
            Object obj[] = new Object[6];
            obj[1] = txt_kdbrg.getText();
            obj[2] = txt_nmbrg.getText();
            obj[3] = txt_hrgbrg.getText();
            obj[4] = txt_qty.getText();
            obj[5] = txt_jmlhrg.getText();

            model.addRow(obj);
            int baris = model.getRowCount();
            for(int x=0; x<baris; x++){
                String no = String.valueOf(x+1);
                model.setValueAt(no + ".", x, 0);
            }
            tbl_list.setRowHeight(30);
            lbl_nilai_item.setText(String.valueOf(baris));
            jmlTotalHarga();
            bersih();
        }
    }//GEN-LAST:event_txt_qtyActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
    new MenuOpsi().show();
    this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_hpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hpsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbl_list.getModel();
        int row = tbl_list.getSelectedRow();
        int baris = model.getRowCount();
        for(int x=0; x<baris; x++){
            String no = String.valueOf(x+1);
            model.setValueAt(no + ".", x, 0);
        }
        jmlTotalHarga();
        model.removeRow(row);
        lbl_nilai_item.setText(String.valueOf(baris-1));
        jmlTotalHarga();
    }//GEN-LAST:event_btn_hpsActionPerformed

    private void txt_byrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_byrActionPerformed
        // TODO add your handling code here:
    int kembali = Integer.parseInt(txt_byr.getText());
    int jmlTotalHarga = 0;
    int subtotal = 0;
        for(int x=0; x<tbl_list.getRowCount(); x++){
            subtotal += Integer.parseInt((String) 
                    tbl_list.getValueAt(x, 5).toString().replace(".", ""));
        }try {
            Connection c = koneksi.getkoneksi();
            Statement stat = c.createStatement();
            String IdTransaksi = "'" + txt_trans.getText() + "',";
            String JmlBrg = lbl_nilai_item.getText() + ",";
            String TotalHarga = "'" + txt_totalhrg.getText() + "'";
            try {
                String sql = "INSERT INTO tb_transaksi(`id_transaksi`,`jmlbrg`, `jmlhrg`) VALUES (" + IdTransaksi + JmlBrg + TotalHarga + ")";
                stat.execute(sql);
                stat.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {
                System.out.println(ex);
        }




        int kembalian = kembali - subtotal;

    txt_kbl.setText("" + nf.format(kembalian));
    lbl_total_harga.setText("Rp." + nf.format(kembalian));    
    javax.swing.JOptionPane.showMessageDialog(null,"Transaksi Berhasil, Terima Kasih :)");

    this.setVisible(false);
    new MenuPOS().show();

    }//GEN-LAST:event_txt_byrActionPerformed

    private void txt_kdbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kdbrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kdbrgActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hps;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel header2;
    private javax.swing.JLabel hrg_brg;
    private javax.swing.JLabel id_trx;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jml_hrg;
    private javax.swing.JLabel kd_brg;
    private javax.swing.JLabel lbl_byr;
    private javax.swing.JLabel lbl_item;
    private javax.swing.JLabel lbl_jmlharga;
    private javax.swing.JLabel lbl_kembalian;
    private javax.swing.JLabel lbl_nilai_item;
    private javax.swing.JLabel lbl_total_harga;
    private javax.swing.JLabel lbltgl;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel nm_brg;
    private javax.swing.JLabel qty;
    private javax.swing.JTable tbl_list;
    private javax.swing.JTextField txt_byr;
    private javax.swing.JTextField txt_hrgbrg;
    private javax.swing.JTextField txt_jmlhrg;
    private javax.swing.JTextField txt_kbl;
    private javax.swing.JTextField txt_kdbrg;
    private javax.swing.JTextField txt_nmbrg;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_totalhrg;
    private javax.swing.JTextField txt_trans;
    // End of variables declaration//GEN-END:variables

    private void jmlTotalHarga() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        int subtotal = 0;
        for(int x=0; x<tbl_list.getRowCount(); x++){
            subtotal += Integer.parseInt((String) 
                    tbl_list.getValueAt(x, 5).toString().replace(".", ""));
        }
        txt_totalhrg.setText("" + nf.format(subtotal));
        lbl_total_harga.setText("Rp." + nf.format(subtotal));
    }

    private void bersih() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        txt_kdbrg.setText("");
        txt_kdbrg.grabFocus();
        txt_qty.setText("");
        txt_jmlhrg.setText("");
    }

    private void koneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
