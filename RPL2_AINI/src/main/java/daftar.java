
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LAB-RPL1
 */
public class daftar extends javax.swing.JFrame {
Connection koneksi;
    /**
     * Creates new form daftar
     */
    public daftar() {
        initComponents();
        koneksi();
        tampil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        lk = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        agama = new javax.swing.JComboBox<>();
        sa = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Pendaftaran Siswa Baru");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setText("Nama              :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setText("Alamat            :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setText("Jenis Kelamin :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setText("Agama            :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel6.setText("Sekolah Asal  :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 230, -1));

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        buttonGroup1.add(lk);
        lk.setText("Laki-Laki");
        getContentPane().add(lk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        buttonGroup1.add(pr);
        pr.setText("Perempuan");
        getContentPane().add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Buddha" }));
        getContentPane().add(agama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 220, -1));
        getContentPane().add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 220, -1));

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jButton2.setText("Edit");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 70, -1));

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jButton4.setText("Clear");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NO", "Nama", "Alamat", "Jenis Kelamin", "Agama", "Sekolah Asal"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 490, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        create();
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        hapus();
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextArea alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton lk;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton pr;
    private javax.swing.JTextField sa;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

private void koneksi(){
    try {
        String server = "jdbc:mysql://localhost:3306/pendaftaran_aini";
        String user = "root";
        String pass = "";
        
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        koneksi = DriverManager.getConnection(server, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

}
private void tampil(){
    DefaultTableModel data = (DefaultTableModel) tabel.getModel();
    data.setRowCount(0);
    try {
        String sql = "SELECT * FROM siswa";
        ResultSet res = koneksi.createStatement().executeQuery(sql);
         while (res.next()) {
                data.addRow(new Object[] {
                res.getString(1), res.getString(2),
                res.getString(3),res.getString(4),
                res.getString(5),res.getString(6)});
            }
            tabel.setModel(data);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

private void create(){
     String jk = "";
        if (lk.isSelected()){
            jk = "laki-laki";
        } else {
            jk = "perempuan";
        }
 
    try {
        String sql = "INSERT INTO siswa VALUES (null,"
                + "'" + nama.getText() + "',"
                + "'" + alamat.getText() + "',"
                + "'" + jk + "',"
                + "'" + agama.getSelectedItem().toString() + "',"
                + "'" + sa.getText()+"')";
        int res = koneksi.createStatement().executeUpdate(sql);
        
        if (res > -1) {
            tampil();
            nama.setText("");
            alamat.setText("");
            lk.setSelected(false);
            pr.setSelected(false);
            agama.setSelectedItem(false);
            sa.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
private void hapus(){
    int row = tabel.getSelectedRow();
    String id = tabel.getModel().getValueAt(row, 0).toString();
    try {
        String sql = "DELETE FROM siswa WHERE id = "+id;
        int res = koneksi.createStatement().executeUpdate(sql);
        
        if (res > -1) {
            tampil();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
}
