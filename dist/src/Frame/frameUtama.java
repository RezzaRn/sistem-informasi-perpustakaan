/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Data.anggota;
import Data.buku;
import Data.dashboard;
import Data.login;
import Data.peminjaman;
import Data.pengembalian;
import Data.petugas;
import Data.aktivitas;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.konfig;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author RezzaRn
 */
public final class frameUtama extends javax.swing.JFrame {

    /**
     * Creates new form frameUtama
     */
    public frameUtama() {
        initComponents();        
        tampilDataBuku();
        tampilDataAnggota();
        tampilDataPetugas();
        tampilDataPeminjaman(); 
        tampilDataPengembalian();      
        tampilDataAktivitas(); 
        tampilDataDashboard();
        panelLogin();
    }
    
    public void panelLogin(){
        panelLogin.setVisible(true);
        panelUtama.setVisible(false);
        jMenuBar1.setVisible(false);
    }
    
    public void panelUtama(){
        jMenuBar1.setVisible(true);
        panelLogin.setVisible(false);
        panelUtama.setVisible(true);
        panelDashboard();
    }
    
    public void panelDashboard(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(true);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);        
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);    
        panelLogin.setVisible(false);
    }   
    
    public void panelBuku(){
        panelDashboard.setVisible(false);
        formBuku.setVisible(false);
        panelDataBuku.setVisible(true);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void formBuku(){
        panelDashboard.setVisible(false);
        formBuku.setVisible(true);
        panelDataBuku.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void panelAnggota(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(true);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void formAnggota(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(true);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void panelPetugas(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(true);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void formPetugas(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(true);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void panelPeminjaman(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(true);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void formPeminjaman(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(true);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void panelPengembalian(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(true);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }
    
    public void formPengembalian(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(true);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(false);
    }        
    
    public void panelAktivitas(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(true);
        formAktivitas.setVisible(false);
    }
    
    public void formAktivitas(){
        panelDataBuku.setVisible(false);
        formBuku.setVisible(false);
        panelDashboard.setVisible(false);
        panelDataAnggota.setVisible(false);
        formAnggota.setVisible(false);
        panelDataPetugas.setVisible(false);
        formPetugas.setVisible(false);
        panelDataPeminjaman.setVisible(false);
        formPeminjaman.setVisible(false);
        panelDataPengembalian.setVisible(false);
        formPengembalian.setVisible(false);
        panelDataAktivitas.setVisible(false);
        formAktivitas.setVisible(true);
    }
    
    public void tampilDataDashboard(){
        dashboard ds = new dashboard();
        
        ds.jumlahBuku();
        ds.jumlahAnggota();
        ds.jumlahAktifitas();
        ds.jumlahPetugas();
        ds.jumlahPinjam();
        ds.jumlahKembali();
        
        txtJmlBuku.setText(ds.getJmlBuku());
        txtJmlAnggota.setText(ds.getJmlAnggota());
        txtJmlPetugas.setText(ds.getJmlPetugas());
        txtJmlPinjam.setText(ds.getJmlPinjam());
        txtJmlKembali.setText(ds.getJmlKembali());
        txtJmlAktivitas.setText(ds.getJmlAktivitas());
    }
    
    
    public void tampilDataBuku(){        
        DefaultTableModel model = new DefaultTableModel();              
        
        model.addColumn("ISBN");
        model.addColumn("Judul Buku");
        model.addColumn("Penulis");
        model.addColumn("Tahun Terbit");
        model.addColumn("Jenis Buku");
        model.addColumn("Penerbit");               
        try{
            String sql = "select*from t_buku;";
         java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6)});
            }  
            tblBuku.setModel(model);
        } catch(SQLException e){
            System.out.println("error"+e.getMessage());
        }
    }
    
    public void tampilDataAnggota(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id aggota");
        model.addColumn("Nama");
        model.addColumn("Jenis Kelamin");
        model.addColumn("No Telepon");
        model.addColumn("Alamat");        
        try{
            String sql = "select*from t_anggota;";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5)});
            }  
            tblAnggota.setModel(model);
        } catch(SQLException e){
            System.out.println("error"+e.getMessage());
        }
    }
    
    public void tampilDataPetugas(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Petugas");
        model.addColumn("Nama");        
        model.addColumn("Jabatan");   
        model.addColumn("No Telepon");
        model.addColumn("Password");        
        try{
            String sql = "select*from t_petugas;";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5)});
            }  
            tblPetugas.setModel(model);
        } catch(SQLException e){
            System.out.println("error"+e.getMessage());
        }
    }
    
    public void tampilDataPeminjaman(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Peminjaman");         
        model.addColumn("ID Anggota");        
        model.addColumn("Nama Peminjam");                 
        model.addColumn("ISBN");
        model.addColumn("Judul Buku");        
        model.addColumn("Tanggal Pinjam");        
        try{
            String sql = "select t_pinjam.id_peminjaman, "
                    + "t_anggota.id_anggota, "
                    + "t_anggota.nama_anggota, "
                    + "t_buku.isbn,"
                    + "t_buku.judul_buku,"
                    + "t_pinjam.tgl_pinjam "
                    + "from t_anggota, t_buku, t_pinjam "
                    + "where "
                    + "t_anggota.id_anggota=t_pinjam.id_anggota and t_buku.isbn=t_pinjam.isbn;";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6)});
            }  
            tblPinjam.setModel(model);
        } catch(SQLException e){
            System.out.println("error"+e.getMessage());
        }
    }
    
    public void tampilDataPengembalian(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Pengembalian");         
        model.addColumn("ID Peminjaman");        
        model.addColumn("Nama Anggota");                 
        model.addColumn("Judul Buku");                 
        model.addColumn("Tanggal Pinjam");                 
        model.addColumn("Tanggal Kembali");
        model.addColumn("Denda");                    
        try{
            String sql = "select t_kembali.id_pengembalian, "
                    + "t_pinjam.id_peminjaman, "
                    + "t_anggota.nama_anggota, "
                    + "t_buku.judul_buku, "
                    + "t_pinjam.tgl_pinjam, "
                    + "t_kembali.tgl_kembali, "
                    + "t_kembali.denda from t_pinjam, "
                    + "t_kembali, t_anggota, t_buku "
                    + "where "
                    + "t_pinjam.id_peminjaman = t_kembali.id_peminjaman "
                    + "and "
                    + "t_pinjam.id_anggota = t_anggota.id_anggota "
                    + "and "
                    + "t_pinjam.isbn = t_buku.isbn;";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }  
            tblKembali.setModel(model);
        } catch(SQLException e){
            System.out.println("error"+e.getMessage());
        }                
    }
    
    public void tampilDataAktivitas(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Aktivitas");         
        model.addColumn("ID Anggota");        
        model.addColumn("Nama Anggota");
        model.addColumn("Isbn");    
        model.addColumn("Judul Buku");    
        model.addColumn("Tanggal");                                               
        model.addColumn("Jenis Aktivitas");  
        model.addColumn("ID Petugas");
        try{
            String sql = " select t_aktivitas.id_aktivitas, "
                    + "t_anggota.id_anggota, "
                    + "t_anggota.nama_anggota, "
                    + "t_buku.isbn, "
                    + "t_buku.judul_buku, "
                    + "t_aktivitas.tgl_aktivitas, "
                    + "t_aktivitas.jenis_aktivitas, "
                    + "t_petugas.id_petugas "
                    + "from t_buku, t_anggota, t_petugas, t_aktivitas "
                    + "where t_aktivitas.id_anggota = t_anggota.id_anggota "
                    + "and t_aktivitas.id_petugas = t_petugas.id_petugas "
                    + "and t_aktivitas.isbn = t_buku.isbn;";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
            }  
            tblAktivitas.setModel(model);
        } catch(SQLException e){
            System.out.println("error"+e.getMessage());
        }                
    }
    
    public void bersihkanFormBuku(){
        txtIsbn.setText("");
        txtJudul.setText("");
        txtPenulis.setText("");
        txtTahun.setText("");
        txtJenis.setText("");
        txtPenerbit.setText("");
    }
    
    public void bersihkanFormAnggota(){
        txtIdAnggota.setText("");
        txtNamaAnggota.setText("");
        txtTelpAnggota.setText("");
        txtAlamatAnggota.setText("");
    }
    
    public void bersihkanFormPetugas(){
        txtIdPetugas.setText("");
        txtNamaPetugas.setText("");
        txtJabatan.setText("");
        txtTelpPetugas.setText("");
        txtPassword.setText("");
    }
    
    public void bersihkanFormPeminjaman(){
        txtIdPinjam.setText("");
        txtIdPeminjam.setText("");
        txtIsbnPinjam.setText("");
        txtTglPinjam.setDate(null);
    }
    
    public void bersihkanFormPengembalian(){
        txtIdKembali.setText("");
        txtIdPinjamKembali.setText("");
        txtTglPinjamKb.setDate(null);        
        txtTglKembali.setDate(null);
        txtDenda.setText("");
        txtLama.setText("");
        txtTelat.setText("");
    }
    
    public void bersihkanFormAktivitas(){
        txtIdAktivitas.setText("");
        txtIdAnggotaTransaksi.setText("");
        txtIdPetugasTransaksi.setText("");
        txtIsbnTransaksi.setText("");
        txtTglAktivitas.setDate(null);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        panelMenuBuku = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMenuAnggota = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelMenuPetugas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelMenuPinjam = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelMenuKembali = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelMenuTransaksi = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelMenuDashboard = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        panelDashboard = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        menuBuku = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtJmlBuku = new javax.swing.JLabel();
        menuPinjam = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtJmlPinjam = new javax.swing.JLabel();
        menuAnggota = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtJmlAnggota = new javax.swing.JLabel();
        menuAktivitas = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtJmlAktivitas = new javax.swing.JLabel();
        menuKembali = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtJmlKembali = new javax.swing.JLabel();
        menuPetugas = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtJmlPetugas = new javax.swing.JLabel();
        panelDataBuku = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        btnHapusDataBuku = new javax.swing.JButton();
        btnTambahDataBuku = new javax.swing.JButton();
        btnUbahDataBuku = new javax.swing.JButton();
        btnCariBuku = new javax.swing.JButton();
        formBuku = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtJudul = new javax.swing.JTextArea();
        txtPenulis = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        txtJenis = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        btnTambahBuku = new javax.swing.JButton();
        btnEditBuku = new javax.swing.JButton();
        btnBersihkanBuku = new javax.swing.JButton();
        btnBatalBuku = new javax.swing.JButton();
        panelDataAnggota = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();
        btnHapusDataAnggota = new javax.swing.JButton();
        btnUbahDataAngota = new javax.swing.JButton();
        btnTambahDataAnggota = new javax.swing.JButton();
        btnCariAnggota = new javax.swing.JButton();
        formAnggota = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblIdAnggota = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtIdAnggota = new javax.swing.JTextField();
        txtNamaAnggota = new javax.swing.JTextField();
        cbKelamin = new javax.swing.JComboBox<>();
        txtTelpAnggota = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAlamatAnggota = new javax.swing.JTextArea();
        btnTambahAnggota = new javax.swing.JButton();
        btnUbahAnggota = new javax.swing.JButton();
        btnBersihkanAnggota = new javax.swing.JButton();
        btnBatalAnggota = new javax.swing.JButton();
        panelDataPetugas = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPetugas = new javax.swing.JTable();
        btnHapusDataPetugas = new javax.swing.JButton();
        btnUbahDataPetugas = new javax.swing.JButton();
        btnTambahDataPetugas = new javax.swing.JButton();
        btnCariPetugas = new javax.swing.JButton();
        formPetugas = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        lblIdPetugas = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtIdPetugas = new javax.swing.JTextField();
        txtNamaPetugas = new javax.swing.JTextField();
        txtJabatan = new javax.swing.JTextField();
        txtTelpPetugas = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnTambahPetugas = new javax.swing.JButton();
        btnUbahPetugas = new javax.swing.JButton();
        btnBersihkanPetugas = new javax.swing.JButton();
        btnBatalPetugas = new javax.swing.JButton();
        panelDataPeminjaman = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblPinjam = new javax.swing.JTable();
        btnHapusDataPinjam = new javax.swing.JButton();
        btnUbahDataPinjam = new javax.swing.JButton();
        btnTambahDataPinjam = new javax.swing.JButton();
        btnCariPeminjaman = new javax.swing.JButton();
        formPeminjaman = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        lblIdPeminjaman = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtIdPinjam = new javax.swing.JTextField();
        txtIsbnPinjam = new javax.swing.JTextField();
        txtIdPeminjam = new javax.swing.JTextField();
        btnTambahPinjam = new javax.swing.JButton();
        btnUbahPinjam = new javax.swing.JButton();
        btnBersihkanPinjam = new javax.swing.JButton();
        btnBatalPinjam = new javax.swing.JButton();
        txtTglPinjam = new com.toedter.calendar.JDateChooser();
        panelDataPengembalian = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblKembali = new javax.swing.JTable();
        btnHapusDataKembali = new javax.swing.JButton();
        btnUbahDataKembali = new javax.swing.JButton();
        btnTambahDataKembali = new javax.swing.JButton();
        btnCariPengembalian = new javax.swing.JButton();
        formPengembalian = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        lblIdKembali = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtIdKembali = new javax.swing.JTextField();
        txtIdPinjamKembali = new javax.swing.JTextField();
        txtTglPinjamKb = new com.toedter.calendar.JDateChooser();
        txtTglKembali = new com.toedter.calendar.JDateChooser();
        txtLama = new javax.swing.JTextField();
        btnTambahPengemabalian = new javax.swing.JButton();
        btnUbahPengembalian = new javax.swing.JButton();
        btnBersihkanPengembalian = new javax.swing.JButton();
        btnBatalPengembalian = new javax.swing.JButton();
        btnCek = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        txtDenda = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtTelat = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        panelDataAktivitas = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAktivitas = new javax.swing.JTable();
        btnHapusDataAktivitas = new javax.swing.JButton();
        btnUbahDataAktivitasi = new javax.swing.JButton();
        btnTambahDataAktivitas = new javax.swing.JButton();
        btnCariAktivitasi = new javax.swing.JButton();
        btnCetakAktivitas = new javax.swing.JButton();
        formAktivitas = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lblIdTransaksi = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtIdAktivitas = new javax.swing.JTextField();
        txtIdAnggotaTransaksi = new javax.swing.JTextField();
        txtIdPetugasTransaksi = new javax.swing.JTextField();
        txtIsbnTransaksi = new javax.swing.JTextField();
        txtTglAktivitas = new com.toedter.calendar.JDateChooser();
        cbJenisAktivitas = new javax.swing.JComboBox<>();
        btnTambahAktivitas = new javax.swing.JButton();
        btnUbahAktivitas = new javax.swing.JButton();
        btnBersihkanAktivitas = new javax.swing.JButton();
        btnBatalAktivitas = new javax.swing.JButton();
        panelLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPwd = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SiPerpus - Aplikasi Pengolahan Database Perpustakaan");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icon/reading-book.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(61, 67, 85));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(61, 67, 85));
        panelMenu.setPreferredSize(new java.awt.Dimension(0, 50));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuBuku.setBackground(new java.awt.Color(61, 67, 85));
        panelMenuBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMenuBukuMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book-32x32-456725.png"))); // NOI18N
        jLabel1.setText("Data Buku");
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuBukuLayout = new javax.swing.GroupLayout(panelMenuBuku);
        panelMenuBuku.setLayout(panelMenuBukuLayout);
        panelMenuBukuLayout.setHorizontalGroup(
            panelMenuBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelMenuBukuLayout.setVerticalGroup(
            panelMenuBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(panelMenuBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        panelMenuAnggota.setBackground(new java.awt.Color(61, 67, 85));

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N
        jLabel2.setText("Data Anggota");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuAnggotaLayout = new javax.swing.GroupLayout(panelMenuAnggota);
        panelMenuAnggota.setLayout(panelMenuAnggotaLayout);
        panelMenuAnggotaLayout.setHorizontalGroup(
            panelMenuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelMenuAnggotaLayout.setVerticalGroup(
            panelMenuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(panelMenuAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 50));

        panelMenuPetugas.setBackground(new java.awt.Color(61, 67, 85));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leadership.png"))); // NOI18N
        jLabel3.setText("Data Petugas");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPetugasLayout = new javax.swing.GroupLayout(panelMenuPetugas);
        panelMenuPetugas.setLayout(panelMenuPetugasLayout);
        panelMenuPetugasLayout.setHorizontalGroup(
            panelMenuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelMenuPetugasLayout.setVerticalGroup(
            panelMenuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(panelMenuPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 50));

        panelMenuPinjam.setBackground(new java.awt.Color(61, 67, 85));

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report-file.png"))); // NOI18N
        jLabel4.setText("Peminjaman");
        jLabel4.setToolTipText("");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPinjamLayout = new javax.swing.GroupLayout(panelMenuPinjam);
        panelMenuPinjam.setLayout(panelMenuPinjamLayout);
        panelMenuPinjamLayout.setHorizontalGroup(
            panelMenuPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelMenuPinjamLayout.setVerticalGroup(
            panelMenuPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(panelMenuPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 50));

        panelMenuKembali.setBackground(new java.awt.Color(61, 67, 85));

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/finance-32x32-456726.png"))); // NOI18N
        jLabel5.setText("Pengembalian");
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuKembaliLayout = new javax.swing.GroupLayout(panelMenuKembali);
        panelMenuKembali.setLayout(panelMenuKembaliLayout);
        panelMenuKembaliLayout.setHorizontalGroup(
            panelMenuKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelMenuKembaliLayout.setVerticalGroup(
            panelMenuKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(panelMenuKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 50));

        panelMenuTransaksi.setBackground(new java.awt.Color(61, 67, 85));

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/copywriting.png"))); // NOI18N
        jLabel6.setText("Aktivitas");
        jLabel6.setToolTipText("");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuTransaksiLayout = new javax.swing.GroupLayout(panelMenuTransaksi);
        panelMenuTransaksi.setLayout(panelMenuTransaksiLayout);
        panelMenuTransaksiLayout.setHorizontalGroup(
            panelMenuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelMenuTransaksiLayout.setVerticalGroup(
            panelMenuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(panelMenuTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 50));

        jPanel4.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 184, 220, 372));

        jPanel3.setBackground(new java.awt.Color(61, 67, 85));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuDashboard.setBackground(new java.awt.Color(61, 67, 85));

        jLabel33.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashboard.png"))); // NOI18N
        jLabel33.setText("Dashboard");
        jLabel33.setToolTipText("");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuDashboardLayout = new javax.swing.GroupLayout(panelMenuDashboard);
        panelMenuDashboard.setLayout(panelMenuDashboardLayout);
        panelMenuDashboardLayout.setHorizontalGroup(
            panelMenuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelMenuDashboardLayout.setVerticalGroup(
            panelMenuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(panelMenuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 50));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reading-book.png"))); // NOI18N
        jLabel56.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 60));

        jLabel59.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("SiPerpus");
        jPanel3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 40));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 180));

        panelUtama.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelDashboard.setPreferredSize(new java.awt.Dimension(680, 527));
        panelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel8.setText("DASHBOARD");
        panelDashboard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel54.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book2.png"))); // NOI18N
        jLabel54.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel54MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel54MouseExited(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Jumlah Buku");

        txtJmlBuku.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        txtJmlBuku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJmlBuku.setText("0");

        javax.swing.GroupLayout menuBukuLayout = new javax.swing.GroupLayout(menuBuku);
        menuBuku.setLayout(menuBukuLayout);
        menuBukuLayout.setHorizontalGroup(
            menuBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(txtJmlBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuBukuLayout.setVerticalGroup(
            menuBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBukuLayout.createSequentialGroup()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJmlBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDashboard.add(menuBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 140));

        menuPinjam.setPreferredSize(new java.awt.Dimension(190, 140));

        jLabel63.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employee.png"))); // NOI18N
        jLabel63.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel63MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel63MouseExited(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Peminjaman Hari Ini");

        txtJmlPinjam.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        txtJmlPinjam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJmlPinjam.setText("0");

        javax.swing.GroupLayout menuPinjamLayout = new javax.swing.GroupLayout(menuPinjam);
        menuPinjam.setLayout(menuPinjamLayout);
        menuPinjamLayout.setHorizontalGroup(
            menuPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPinjamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtJmlPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPinjamLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuPinjamLayout.setVerticalGroup(
            menuPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPinjamLayout.createSequentialGroup()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtJmlPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPinjamLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel64)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        panelDashboard.add(menuPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 333, -1, -1));

        menuAnggota.setPreferredSize(new java.awt.Dimension(190, 140));

        jLabel57.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/we.png"))); // NOI18N
        jLabel57.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel57MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel57MouseExited(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Jumlah Anggota");

        txtJmlAnggota.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        txtJmlAnggota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJmlAnggota.setText("0");

        javax.swing.GroupLayout menuAnggotaLayout = new javax.swing.GroupLayout(menuAnggota);
        menuAnggota.setLayout(menuAnggotaLayout);
        menuAnggotaLayout.setHorizontalGroup(
            menuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addGroup(menuAnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtJmlAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuAnggotaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuAnggotaLayout.setVerticalGroup(
            menuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAnggotaLayout.createSequentialGroup()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtJmlAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuAnggotaLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel58)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        panelDashboard.add(menuAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 140, -1, -1));

        menuAktivitas.setPreferredSize(new java.awt.Dimension(190, 140));

        jLabel69.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/analysis-process.png"))); // NOI18N
        jLabel69.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel69MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel69MouseExited(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Aktivitas Hari Ini");

        txtJmlAktivitas.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        txtJmlAktivitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJmlAktivitas.setText("0");

        javax.swing.GroupLayout menuAktivitasLayout = new javax.swing.GroupLayout(menuAktivitas);
        menuAktivitas.setLayout(menuAktivitasLayout);
        menuAktivitasLayout.setHorizontalGroup(
            menuAktivitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAktivitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuAktivitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtJmlAktivitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuAktivitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuAktivitasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuAktivitasLayout.setVerticalGroup(
            menuAktivitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAktivitasLayout.createSequentialGroup()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtJmlAktivitas, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuAktivitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuAktivitasLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel70)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        panelDashboard.add(menuAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 333, -1, -1));

        menuKembali.setPreferredSize(new java.awt.Dimension(190, 140));

        jLabel66.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/task-management.png"))); // NOI18N
        jLabel66.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel66MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel66MouseExited(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Pengembalian Hari Ini");

        txtJmlKembali.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        txtJmlKembali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJmlKembali.setText("0");

        javax.swing.GroupLayout menuKembaliLayout = new javax.swing.GroupLayout(menuKembali);
        menuKembali.setLayout(menuKembaliLayout);
        menuKembaliLayout.setHorizontalGroup(
            menuKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuKembaliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtJmlKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuKembaliLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuKembaliLayout.setVerticalGroup(
            menuKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuKembaliLayout.createSequentialGroup()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtJmlKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuKembaliLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel67)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        panelDashboard.add(menuKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 333, -1, -1));

        menuPetugas.setPreferredSize(new java.awt.Dimension(190, 140));

        jLabel60.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-settings.png"))); // NOI18N
        jLabel60.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel60MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel60MouseExited(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Jumlah Petugas");

        txtJmlPetugas.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        txtJmlPetugas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJmlPetugas.setText("0");

        javax.swing.GroupLayout menuPetugasLayout = new javax.swing.GroupLayout(menuPetugas);
        menuPetugas.setLayout(menuPetugasLayout);
        menuPetugasLayout.setHorizontalGroup(
            menuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtJmlPetugas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPetugasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuPetugasLayout.setVerticalGroup(
            menuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPetugasLayout.createSequentialGroup()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtJmlPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPetugasLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel61)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        panelDashboard.add(menuPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 140, -1, -1));

        panelUtama.add(panelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 0, 730, 556));

        panelDataBuku.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel9.setText("DATA BUKU");
        panelDataBuku.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBuku);

        panelDataBuku.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 127, 630, 400));

        btnHapusDataBuku.setText("Hapus Data");
        btnHapusDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataBukuActionPerformed(evt);
            }
        });
        panelDataBuku.add(btnHapusDataBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        btnTambahDataBuku.setText("Tambah Data");
        btnTambahDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataBukuActionPerformed(evt);
            }
        });
        panelDataBuku.add(btnTambahDataBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btnUbahDataBuku.setText("Ubah Data");
        btnUbahDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahDataBukuActionPerformed(evt);
            }
        });
        panelDataBuku.add(btnUbahDataBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        btnCariBuku.setText("Cari Data");
        btnCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariBukuActionPerformed(evt);
            }
        });
        panelDataBuku.add(btnCariBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        panelUtama.add(panelDataBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        formBuku.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel10.setText("FORM BUKU");
        formBuku.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 50, -1, -1));

        jLabel11.setText("ISBN");
        formBuku.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 136, 108, -1));

        jLabel12.setText("Judul Buku");
        formBuku.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 180, 108, -1));

        jLabel13.setText("Penulis");
        formBuku.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 281, 108, -1));

        jLabel14.setText("Tahun Terbit");
        formBuku.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 325, 108, -1));

        jLabel15.setText("Jenis Buku");
        formBuku.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 368, 108, -1));

        jLabel16.setText("Penerbit");
        formBuku.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 411, 108, -1));
        formBuku.add(txtIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 133, 218, -1));

        txtJudul.setColumns(20);
        txtJudul.setRows(5);
        jScrollPane1.setViewportView(txtJudul);

        formBuku.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 180, 291, 70));
        formBuku.add(txtPenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 278, 218, -1));
        formBuku.add(txtTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 322, 101, -1));
        formBuku.add(txtJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 365, 218, -1));
        formBuku.add(txtPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 408, 218, -1));

        btnTambahBuku.setText("Tambah");
        btnTambahBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBukuActionPerformed(evt);
            }
        });
        formBuku.add(btnTambahBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        btnEditBuku.setText("Edit");
        btnEditBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditBukuActionPerformed(evt);
            }
        });
        formBuku.add(btnEditBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        btnBersihkanBuku.setText("Bersihkan");
        btnBersihkanBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanBukuActionPerformed(evt);
            }
        });
        formBuku.add(btnBersihkanBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        btnBatalBuku.setText("Batal");
        btnBatalBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalBukuActionPerformed(evt);
            }
        });
        formBuku.add(btnBatalBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        panelUtama.add(formBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        panelDataAnggota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel17.setText("DATA ANGGOTA");
        panelDataAnggota.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnggotaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAnggota);

        panelDataAnggota.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 630, 390));

        btnHapusDataAnggota.setText("Hapus Data");
        btnHapusDataAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataAnggotaActionPerformed(evt);
            }
        });
        panelDataAnggota.add(btnHapusDataAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        btnUbahDataAngota.setText("Ubah Data");
        btnUbahDataAngota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahDataAngotaActionPerformed(evt);
            }
        });
        panelDataAnggota.add(btnUbahDataAngota, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        btnTambahDataAnggota.setText("Tambah Data");
        btnTambahDataAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataAnggotaActionPerformed(evt);
            }
        });
        panelDataAnggota.add(btnTambahDataAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btnCariAnggota.setText("Cari Data");
        btnCariAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAnggotaActionPerformed(evt);
            }
        });
        panelDataAnggota.add(btnCariAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        panelUtama.add(panelDataAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        formAnggota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel18.setText("FORM ANGGOTA");
        formAnggota.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblIdAnggota.setText("ID Anggota");
        formAnggota.add(lblIdAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 133, -1, -1));

        jLabel20.setText("Nama");
        formAnggota.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 177, -1, -1));

        jLabel21.setText("Jenis Kelamin");
        formAnggota.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 221, -1, -1));

        jLabel22.setText("No Telepon");
        formAnggota.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, -1, -1));

        jLabel23.setText("Alamat");
        formAnggota.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 309, -1, -1));
        formAnggota.add(txtIdAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 130, 146, -1));
        formAnggota.add(txtNamaAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 174, 199, -1));

        cbKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        formAnggota.add(cbKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 218, -1, -1));
        formAnggota.add(txtTelpAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 262, 143, -1));

        txtAlamatAnggota.setColumns(20);
        txtAlamatAnggota.setRows(5);
        jScrollPane4.setViewportView(txtAlamatAnggota);

        formAnggota.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 300, 199, 67));

        btnTambahAnggota.setText("Tambah");
        btnTambahAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahAnggotaActionPerformed(evt);
            }
        });
        formAnggota.add(btnTambahAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 414, -1, -1));

        btnUbahAnggota.setText("Ubah");
        btnUbahAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahAnggotaActionPerformed(evt);
            }
        });
        formAnggota.add(btnUbahAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 414, -1, -1));

        btnBersihkanAnggota.setText("Bersihkan");
        btnBersihkanAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanAnggotaActionPerformed(evt);
            }
        });
        formAnggota.add(btnBersihkanAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 414, -1, -1));

        btnBatalAnggota.setText("Batal");
        btnBatalAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalAnggotaActionPerformed(evt);
            }
        });
        formAnggota.add(btnBatalAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 414, -1, -1));

        panelUtama.add(formAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        panelDataPetugas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel24.setText("DATA PETUGAS");
        panelDataPetugas.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        tblPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPetugasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblPetugas);

        panelDataPetugas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 630, 390));

        btnHapusDataPetugas.setText("Hapus Data");
        btnHapusDataPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataPetugasActionPerformed(evt);
            }
        });
        panelDataPetugas.add(btnHapusDataPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        btnUbahDataPetugas.setText("Ubah Data");
        btnUbahDataPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahDataPetugasActionPerformed(evt);
            }
        });
        panelDataPetugas.add(btnUbahDataPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        btnTambahDataPetugas.setText("Tambah Data");
        btnTambahDataPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataPetugasActionPerformed(evt);
            }
        });
        panelDataPetugas.add(btnTambahDataPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btnCariPetugas.setText("Cari Data");
        btnCariPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPetugasActionPerformed(evt);
            }
        });
        panelDataPetugas.add(btnCariPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        panelUtama.add(panelDataPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        formPetugas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel25.setText("FORM PETUGAS");
        formPetugas.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblIdPetugas.setText("ID Petugas");
        formPetugas.add(lblIdPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 133, -1, -1));

        jLabel27.setText("Nama");
        formPetugas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 177, -1, -1));

        jLabel28.setText("Jabatan");
        formPetugas.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 221, -1, -1));

        jLabel29.setText("No Telepon");
        formPetugas.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, -1, -1));

        jLabel30.setText("password");
        formPetugas.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 309, -1, -1));
        formPetugas.add(txtIdPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 130, 73, -1));
        formPetugas.add(txtNamaPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 174, 180, -1));
        formPetugas.add(txtJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 218, 143, -1));
        formPetugas.add(txtTelpPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 262, 143, -1));
        formPetugas.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 306, 143, -1));

        btnTambahPetugas.setText("Tambah");
        btnTambahPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPetugasActionPerformed(evt);
            }
        });
        formPetugas.add(btnTambahPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        btnUbahPetugas.setText("Ubah");
        btnUbahPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahPetugasActionPerformed(evt);
            }
        });
        formPetugas.add(btnUbahPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        btnBersihkanPetugas.setText("Bersihkan");
        btnBersihkanPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanPetugasActionPerformed(evt);
            }
        });
        formPetugas.add(btnBersihkanPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        btnBatalPetugas.setText("Batal");
        btnBatalPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalPetugasActionPerformed(evt);
            }
        });
        formPetugas.add(btnBatalPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        panelUtama.add(formPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        panelDataPeminjaman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel31.setText("DATA PEMINJAMAN BUKU");
        panelDataPeminjaman.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        tblPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPinjamMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblPinjam);

        panelDataPeminjaman.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 630, 390));

        btnHapusDataPinjam.setText("Hapus Data");
        btnHapusDataPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataPinjamActionPerformed(evt);
            }
        });
        panelDataPeminjaman.add(btnHapusDataPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        btnUbahDataPinjam.setText("Ubah Data");
        btnUbahDataPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahDataPinjamActionPerformed(evt);
            }
        });
        panelDataPeminjaman.add(btnUbahDataPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        btnTambahDataPinjam.setText("Tambah Data");
        btnTambahDataPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataPinjamActionPerformed(evt);
            }
        });
        panelDataPeminjaman.add(btnTambahDataPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btnCariPeminjaman.setText("Cari Data");
        btnCariPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPeminjamanActionPerformed(evt);
            }
        });
        panelDataPeminjaman.add(btnCariPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        panelUtama.add(panelDataPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        formPeminjaman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel32.setText("FORM PEMINJAMAN");
        formPeminjaman.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblIdPeminjaman.setText("ID Peminjaman");
        formPeminjaman.add(lblIdPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 133, -1, -1));

        jLabel34.setText("ID Anggota");
        formPeminjaman.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 184, -1, -1));

        jLabel35.setText("No Buku / ISBN");
        formPeminjaman.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 232, -1, -1));

        jLabel36.setText("Tanggal Peminjaman");
        formPeminjaman.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 279, -1, -1));
        formPeminjaman.add(txtIdPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 130, 116, -1));
        formPeminjaman.add(txtIsbnPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 229, 160, -1));
        formPeminjaman.add(txtIdPeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 181, 116, -1));

        btnTambahPinjam.setText("Tambah");
        btnTambahPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPinjamActionPerformed(evt);
            }
        });
        formPeminjaman.add(btnTambahPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 333, -1, -1));

        btnUbahPinjam.setText("Ubah");
        btnUbahPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahPinjamActionPerformed(evt);
            }
        });
        formPeminjaman.add(btnUbahPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 333, -1, -1));

        btnBersihkanPinjam.setText("Bersihkan");
        btnBersihkanPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanPinjamActionPerformed(evt);
            }
        });
        formPeminjaman.add(btnBersihkanPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 333, -1, -1));

        btnBatalPinjam.setText("Batal");
        btnBatalPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalPinjamActionPerformed(evt);
            }
        });
        formPeminjaman.add(btnBatalPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 333, -1, -1));

        txtTglPinjam.setDateFormatString("yyyy-MM-dd");
        formPeminjaman.add(txtTglPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 279, 151, -1));

        panelUtama.add(formPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        panelDataPengembalian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel37.setText("DATA PENEGEMBALIAN BUKU");
        panelDataPengembalian.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        tblKembali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKembaliMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblKembali);

        panelDataPengembalian.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 630, 390));

        btnHapusDataKembali.setText("Hapus Data");
        btnHapusDataKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataKembaliActionPerformed(evt);
            }
        });
        panelDataPengembalian.add(btnHapusDataKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        btnUbahDataKembali.setText("Ubah Data");
        btnUbahDataKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahDataKembaliActionPerformed(evt);
            }
        });
        panelDataPengembalian.add(btnUbahDataKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        btnTambahDataKembali.setText("Tambah Data");
        btnTambahDataKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataKembaliActionPerformed(evt);
            }
        });
        panelDataPengembalian.add(btnTambahDataKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btnCariPengembalian.setText("Cari Data");
        btnCariPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPengembalianActionPerformed(evt);
            }
        });
        panelDataPengembalian.add(btnCariPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        panelUtama.add(panelDataPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        formPengembalian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel38.setText("FORM PENGEMBALIAN BUKU");
        formPengembalian.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblIdKembali.setText("ID Pengembalian");
        formPengembalian.add(lblIdKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 134, -1, -1));

        jLabel40.setText("ID Peminjaman");
        formPengembalian.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 178, -1, -1));

        jLabel41.setText("Tanggal Pinjam");
        formPengembalian.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 222, -1, -1));

        jLabel42.setText("Tanggal Kembali");
        formPengembalian.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 266, -1, -1));

        jLabel43.setText("Lama Pinjam");
        formPengembalian.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 312, -1, -1));
        formPengembalian.add(txtIdKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 131, 172, -1));

        txtIdPinjamKembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdPinjamKembaliKeyReleased(evt);
            }
        });
        formPengembalian.add(txtIdPinjamKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 175, 172, -1));
        formPengembalian.add(txtTglPinjamKb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 216, 120, -1));

        txtTglKembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTglKembaliKeyReleased(evt);
            }
        });
        formPengembalian.add(txtTglKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 120, -1));
        formPengembalian.add(txtLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 309, 90, -1));

        btnTambahPengemabalian.setText("Tambah");
        btnTambahPengemabalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPengemabalianActionPerformed(evt);
            }
        });
        formPengembalian.add(btnTambahPengemabalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        btnUbahPengembalian.setText("Ubah");
        btnUbahPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahPengembalianActionPerformed(evt);
            }
        });
        formPengembalian.add(btnUbahPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        btnBersihkanPengembalian.setText("Bersihkan");
        btnBersihkanPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanPengembalianActionPerformed(evt);
            }
        });
        formPengembalian.add(btnBersihkanPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        btnBatalPengembalian.setText("Batal");
        btnBatalPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalPengembalianActionPerformed(evt);
            }
        });
        formPengembalian.add(btnBatalPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        btnCek.setText("cek");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        formPengembalian.add(btnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel44.setText("Denda");
        formPengembalian.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        txtDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDendaActionPerformed(evt);
            }
        });
        formPengembalian.add(txtDenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 90, -1));

        jLabel45.setText("Telat");
        formPengembalian.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        txtTelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelatActionPerformed(evt);
            }
        });
        formPengembalian.add(txtTelat, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 20, -1));

        jLabel46.setText("Hari");
        formPengembalian.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 20));

        panelUtama.add(formPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        panelDataAktivitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel19.setText("DATA AKTIVITAS");
        panelDataAktivitas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        tblAktivitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAktivitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAktivitasMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblAktivitas);

        panelDataAktivitas.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 630, 390));

        btnHapusDataAktivitas.setText("Hapus Data");
        btnHapusDataAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataAktivitasActionPerformed(evt);
            }
        });
        panelDataAktivitas.add(btnHapusDataAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        btnUbahDataAktivitasi.setText("Ubah Data");
        btnUbahDataAktivitasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahDataAktivitasiActionPerformed(evt);
            }
        });
        panelDataAktivitas.add(btnUbahDataAktivitasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        btnTambahDataAktivitas.setText("Tambah Data");
        btnTambahDataAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataAktivitasActionPerformed(evt);
            }
        });
        panelDataAktivitas.add(btnTambahDataAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btnCariAktivitasi.setText("Cari Data");
        btnCariAktivitasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAktivitasiActionPerformed(evt);
            }
        });
        panelDataAktivitas.add(btnCariAktivitasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        btnCetakAktivitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print.png"))); // NOI18N
        btnCetakAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakAktivitasActionPerformed(evt);
            }
        });
        panelDataAktivitas.add(btnCetakAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 20, 50, 30));

        panelUtama.add(panelDataAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        formAktivitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel26.setText("FORM AKTIVITAS");
        formAktivitas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblIdTransaksi.setText("ID Aktivitas");
        formAktivitas.add(lblIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 133, -1, -1));

        jLabel39.setText("ID Anggota");
        formAktivitas.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 183, -1, -1));

        jLabel47.setText("ID Petugas");
        formAktivitas.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 233, -1, -1));

        jLabel48.setText("No Buku /  ISBN");
        formAktivitas.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 283, -1, -1));

        jLabel49.setText("Tanggal");
        formAktivitas.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel50.setText("Jenis Aktivitas");
        formAktivitas.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 377, -1, -1));

        txtIdAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAktivitasActionPerformed(evt);
            }
        });
        formAktivitas.add(txtIdAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 130, 163, -1));
        formAktivitas.add(txtIdAnggotaTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 180, 163, -1));
        formAktivitas.add(txtIdPetugasTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 230, 163, -1));
        formAktivitas.add(txtIsbnTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 280, 163, -1));
        formAktivitas.add(txtTglAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 324, 131, -1));

        cbJenisAktivitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meminjam", "Mengembalikan" }));
        formAktivitas.add(cbJenisAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 374, 131, -1));

        btnTambahAktivitas.setText("Tambah");
        btnTambahAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahAktivitasActionPerformed(evt);
            }
        });
        formAktivitas.add(btnTambahAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        btnUbahAktivitas.setText("Ubah");
        btnUbahAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahAktivitasActionPerformed(evt);
            }
        });
        formAktivitas.add(btnUbahAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        btnBersihkanAktivitas.setText("Bersihkan");
        btnBersihkanAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanAktivitasActionPerformed(evt);
            }
        });
        formAktivitas.add(btnBersihkanAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        btnBatalAktivitas.setText("Batal");
        btnBatalAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalAktivitasActionPerformed(evt);
            }
        });
        formAktivitas.add(btnBatalAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        panelUtama.add(formAktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 560));

        getContentPane().add(panelUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelLogin.setBackground(new java.awt.Color(61, 67, 85));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("LOGIN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel51.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("ID Petugas");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 76, -1));

        jLabel52.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Password");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(null);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 178, 20));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 64, 76, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 178, 10));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 178, 10));

        txtPwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPwd.setBorder(null);
        txtPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 178, 19));

        showPassword.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 10)); // NOI18N
        showPassword.setForeground(new java.awt.Color(51, 0, 204));
        showPassword.setText("show password");
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, 20));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 84, 70, 70));

        panelLogin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 370, 420));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 960, 560));

        jMenu1.setText("File");

        jMenuItem1.setText("Data Buku");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Data Anggota");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Data Petugas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator3);

        jMenuItem4.setText("Laporan Peminjaman");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Laporan Pengembalian");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Laporan Transaksi");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator4);

        jMenuItem7.setText("Exit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem8.setText("Kelompok");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMenuBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuBukuMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_panelMenuBukuMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        tampilDataBuku();
        panelBuku();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnTambahDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataBukuActionPerformed
        // TODO add your handling code here:        
        bersihkanFormBuku();
        formBuku();
    }//GEN-LAST:event_btnTambahDataBukuActionPerformed

    private void btnTambahBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBukuActionPerformed
        // TODO add your handling code here:
        buku bk = new buku();               
        
        bk.setBuku(txtIsbn.getText(), txtJudul.getText(), txtPenulis.getText(), txtTahun.getText(), txtJenis.getText(), txtPenerbit.getText());        
        bk.tambahBuku();
        if(bk.getStatus().equals("success")){
            JOptionPane.showMessageDialog(null, "Data Berhasil di Tambahkan");
            tampilDataBuku();
            panelBuku();
        }        
    }//GEN-LAST:event_btnTambahBukuActionPerformed

    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        // TODO add your handling code here:
        int baris = tblBuku.rowAtPoint(evt.getPoint());
        String isbn = tblBuku.getValueAt(baris, 0).toString();
        txtIsbn.setText(isbn);
        String judul = tblBuku.getValueAt(baris, 1).toString();
        txtJudul.setText(judul);
        String penulis = tblBuku.getValueAt(baris, 2).toString();
        txtPenulis.setText(penulis);
        String thn = tblBuku.getValueAt(baris, 3).toString();
        txtTahun.setText(thn);
        String jenis = tblBuku.getValueAt(baris, 4).toString();
        txtJenis.setText(jenis);
        String penerbit = tblBuku.getValueAt(baris, 5).toString();
        txtPenerbit.setText(penerbit);
    }//GEN-LAST:event_tblBukuMouseClicked

    private void btnUbahDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahDataBukuActionPerformed
        // TODO add your handling code here:
        if(!txtIsbn.getText().equals("")){
            formBuku();
        }else{
            JOptionPane.showMessageDialog(null, "pilih terlebih dahulu data yang akan di ubah..!");
        }
    }//GEN-LAST:event_btnUbahDataBukuActionPerformed

    private void btnHapusDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDataBukuActionPerformed
        // TODO add your handling code here:
        buku bk = new buku();
        if(!txtIsbn.getText().equals("")){
            int pilihan = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus buku '"+txtJudul.getText()+"' ?","Konfirmasi Hapus",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);        
            if(pilihan == 0){
                bk.setIsbn(txtIsbn.getText());
                bk.hapusBuku();
            }
            tampilDataBuku();
        }else{
            JOptionPane.showMessageDialog(this, "Pilih terlebih dahulu buku yang akan di hapus..!");
        }
    }//GEN-LAST:event_btnHapusDataBukuActionPerformed

    private void btnEditBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBukuActionPerformed
        // TODO add your handling code here:
        buku bk = new buku();        
        
        bk.setBuku(txtIsbn.getText(), txtJudul.getText(), txtPenulis.getText(), txtTahun.getText(), txtJenis.getText(), txtPenerbit.getText());                                                
        
        bk.editBuku();
        bersihkanFormBuku();
        panelBuku();
        tampilDataBuku();
    }//GEN-LAST:event_btnEditBukuActionPerformed

    private void btnBersihkanBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanBukuActionPerformed
        // TODO add your handling code here:
        bersihkanFormBuku();
    }//GEN-LAST:event_btnBersihkanBukuActionPerformed

    private void btnBatalBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalBukuActionPerformed
        // TODO add your handling code here:
        bersihkanFormBuku();
        panelBuku();
    }//GEN-LAST:event_btnBatalBukuActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        tampilDataAnggota();
        panelAnggota();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnTambahDataAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataAnggotaActionPerformed
        // TODO add your handling code here:
        txtIdAnggota.setVisible(false);
        lblIdAnggota.setVisible(false);
        bersihkanFormAnggota();
        formAnggota();
    }//GEN-LAST:event_btnTambahDataAnggotaActionPerformed

    private void btnTambahAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahAnggotaActionPerformed
        // TODO add your handling code here:
        anggota ag = new anggota();          
        
        ag.setAnggota(txtIdAnggota.getText(), txtNamaAnggota.getText(), cbKelamin.getSelectedItem(), txtTelpAnggota.getText(), txtAlamatAnggota.getText());        
        ag.tambahAnggota();
        if(ag.getStatus().equals("success")){
            JOptionPane.showMessageDialog(null, "Data Berhasil di Tambahkan");                 
            bersihkanFormAnggota();
            tampilDataAnggota();
            panelAnggota();
        }        
    }//GEN-LAST:event_btnTambahAnggotaActionPerformed

    private void tblAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnggotaMouseClicked
        // TODO add your handling code here:
        int baris = tblAnggota.rowAtPoint(evt.getPoint());
        String id = tblAnggota.getValueAt(baris, 0).toString();
        txtIdAnggota.setText(id);
        String nama = tblAnggota.getValueAt(baris, 1).toString();
        txtNamaAnggota.setText(nama);           
        String kel = tblAnggota.getValueAt(baris, 2).toString();
        if(kel.equals("laki-laki")){
            cbKelamin.setSelectedItem("Laki-laki");
        }else{
            cbKelamin.setSelectedItem("Perempuan");
        }
        String no = tblAnggota.getValueAt(baris, 3).toString();
        txtTelpAnggota.setText(no);
        String almt = tblAnggota.getValueAt(baris, 4).toString();
        txtAlamatAnggota.setText(almt);
    }//GEN-LAST:event_tblAnggotaMouseClicked

    private void btnHapusDataAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDataAnggotaActionPerformed
        // TODO add your handling code here:        
        anggota ag = new anggota();
        if(!txtIdAnggota.getText().equals("")){
            int pilihan = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus anggota '"+txtNamaAnggota.getText()+"' ?","Konfirmasi Hapus",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);        
            if(pilihan == 0){
                ag.setIdAnggota(txtIdAnggota.getText());
                ag.hapusAnggota();
            }
            tampilDataAnggota();
        }else{
            JOptionPane.showMessageDialog(this, "Pilih terlebih dahulu anggota yang akan di hapus..!");
        }
    }//GEN-LAST:event_btnHapusDataAnggotaActionPerformed

    private void btnUbahDataAngotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahDataAngotaActionPerformed
        // TODO add your handling code here:    
        txtIdAnggota.setVisible(true);
        lblIdAnggota.setVisible(true);
        if(!txtIdAnggota.getText().equals("")){
            formAnggota();
        }else{
            JOptionPane.showMessageDialog(this, "Pilih terlebih dahulu anggota yang akan di ubah..!");
        }
    }//GEN-LAST:event_btnUbahDataAngotaActionPerformed

    private void btnUbahAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahAnggotaActionPerformed
        // TODO add your handling code here:
        anggota ag = new anggota();
        ag.setAnggota(txtIdAnggota.getText(), txtNamaAnggota.getText(), cbKelamin.getSelectedItem(), txtTelpAnggota.getText(), txtAlamatAnggota.getText());  
        ag.editAnggota();
        bersihkanFormAnggota();        
        panelAnggota();
        tampilDataAnggota();
    }//GEN-LAST:event_btnUbahAnggotaActionPerformed

    private void btnBersihkanAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanAnggotaActionPerformed
        // TODO add your handling code here:
        bersihkanFormAnggota();
    }//GEN-LAST:event_btnBersihkanAnggotaActionPerformed

    private void btnBatalAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalAnggotaActionPerformed
        // TODO add your handling code here:
        bersihkanFormAnggota();
        panelAnggota();
    }//GEN-LAST:event_btnBatalAnggotaActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        tampilDataPetugas();
        panelPetugas();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnUbahDataPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahDataPetugasActionPerformed
        // TODO add your handling code here:
        txtIdPetugas.setVisible(true);
        lblIdPetugas.setVisible(true);
        if(!txtIdPetugas.getText().equals("")){
            formPetugas();
        }else{
            JOptionPane.showMessageDialog(this, "Pilih terlebih dahulu petugas yang akan di ubah..!");
        }
    }//GEN-LAST:event_btnUbahDataPetugasActionPerformed

    private void btnTambahDataPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataPetugasActionPerformed
        // TODO add your handling code here:
        txtIdPetugas.setVisible(false);
        lblIdPetugas.setVisible(false);
        bersihkanFormPetugas();
        formPetugas();
    }//GEN-LAST:event_btnTambahDataPetugasActionPerformed

    private void btnTambahPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPetugasActionPerformed
        // TODO add your handling code here:
        petugas pg = new petugas();       
        pg.setPetugas(txtIdPetugas.getText(), txtNamaPetugas.getText(), txtJabatan.getText(), txtTelpPetugas.getText(), txtPassword.getText());
        pg.tambahPetugas();
        if(pg.getStatus().equals("success")){
            JOptionPane.showMessageDialog(null, "Data Berhasil di Tambahkan");                        
            bersihkanFormPetugas();
            tampilDataPetugas();
            panelPetugas();
        }
        
    }//GEN-LAST:event_btnTambahPetugasActionPerformed

    private void tblPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPetugasMouseClicked
        // TODO add your handling code here:                
        int baris = tblPetugas.rowAtPoint(evt.getPoint());
        String id = tblPetugas.getValueAt(baris, 0).toString();
        txtIdPetugas.setText(id);
        String nm = tblPetugas.getValueAt(baris, 1).toString();
        txtNamaPetugas.setText(nm);
        String jb = tblPetugas.getValueAt(baris, 2).toString();
        txtJabatan.setText(jb);
        String no = tblPetugas.getValueAt(baris, 3).toString();
        txtTelpPetugas.setText(no);
        String ps = tblPetugas.getValueAt(baris, 4).toString();
        txtPassword.setText(ps);
    }//GEN-LAST:event_tblPetugasMouseClicked

    private void btnUbahPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahPetugasActionPerformed
        // TODO add your handling code here:
        petugas pg = new petugas();       
        pg.setPetugas(txtIdPetugas.getText(), txtNamaPetugas.getText(), txtJabatan.getText(), txtTelpPetugas.getText(), txtPassword.getText());
        pg.editPetugas();
        bersihkanFormPetugas();
        tampilDataPetugas();
        panelPetugas();
    }//GEN-LAST:event_btnUbahPetugasActionPerformed

    private void btnBersihkanPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanPetugasActionPerformed
        // TODO add your handling code here:
        bersihkanFormPetugas();
    }//GEN-LAST:event_btnBersihkanPetugasActionPerformed

    private void btnBatalPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalPetugasActionPerformed
        // TODO add your handling code here:
        bersihkanFormPetugas();
        panelPetugas();
    }//GEN-LAST:event_btnBatalPetugasActionPerformed

    private void btnHapusDataPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDataPetugasActionPerformed
        // TODO add your handling code here:
        petugas pg = new petugas();
        if(!txtIdPetugas.getText().equals("")){
            int pilihan = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus anggota '"+txtNamaPetugas.getText()+"' ?","Konfirmasi Hapus",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);        
            if(pilihan == 0){
                pg.setIdPetugas(txtIdPetugas.getText());
                pg.hapusPetugas();            
            }
            tampilDataPetugas();
        }else{
            JOptionPane.showMessageDialog(this, "Pilih terlebih dahulu petugas yang akan di hapus..!");
        }        
    }//GEN-LAST:event_btnHapusDataPetugasActionPerformed

    private void btnHapusDataPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDataPinjamActionPerformed
        // TODO add your handling code here:
        peminjaman pj = new peminjaman();       
                
        if(!txtIdPinjam.getText().equals("")){
            int pilihan = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus ?","Konfirmasi Hapus",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);        
            if(pilihan == 0){
                pj.setIdPinjam(txtIdPinjam.getText());
                pj.hapusPeminjaman();
            }
            tampilDataPeminjaman();
        }else{
            JOptionPane.showMessageDialog(this, "Pilih terlebih dahulu data yang akan di hapus..!");
        }      
    }//GEN-LAST:event_btnHapusDataPinjamActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        tampilDataPeminjaman();
        panelPeminjaman();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnTambahDataPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataPinjamActionPerformed
        // TODO add your handling code here:
        txtIdPinjam.setVisible(false);
        lblIdPeminjaman.setVisible(false);
        bersihkanFormPeminjaman();
        formPeminjaman();
    }//GEN-LAST:event_btnTambahDataPinjamActionPerformed

    private void btnBersihkanPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanPinjamActionPerformed
        // TODO add your handling code here:
        bersihkanFormPeminjaman();
    }//GEN-LAST:event_btnBersihkanPinjamActionPerformed

    private void btnTambahPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPinjamActionPerformed
        // TODO add your handling code here: 

        String date = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        String tgl = String.valueOf(sdf.format(txtTglPinjam.getDate()));        
        peminjaman pj = new peminjaman();            
        
        pj.setIdAnggota(txtIdPeminjam.getText());
        pj.setIsbn(txtIsbnPinjam.getText());
        pj.setTglPinjam(tgl);
        pj.tambahPeminjaman();
        
        if(pj.getStatus().equals("success")){
            JOptionPane.showMessageDialog(null, "Data Berhasil di Tambahkan");
            tampilDataPeminjaman();
            bersihkanFormPeminjaman();
            panelPeminjaman();
        }
        
    }//GEN-LAST:event_btnTambahPinjamActionPerformed

    private void btnBatalPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalPinjamActionPerformed
        // TODO add your handling code here:
        bersihkanFormPeminjaman();
        panelPeminjaman();
    }//GEN-LAST:event_btnBatalPinjamActionPerformed

    private void tblPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPinjamMouseClicked
        // TODO add your handling code here:                                                                 
        int baris = tblPinjam.rowAtPoint(evt.getPoint());
        String id = tblPinjam.getValueAt(baris, 0).toString();
        txtIdPinjam.setText(id);
        String idAg = tblPinjam.getValueAt(baris, 1).toString();
        txtIdPeminjam.setText(idAg);
        String isbn = tblPinjam.getValueAt(baris, 3).toString();
        txtIsbnPinjam.setText(isbn);
        String tglPinjam = tblPinjam.getValueAt(baris, 5).toString();        
        txtTglPinjam.setDate(Date.valueOf(tglPinjam));
    }//GEN-LAST:event_tblPinjamMouseClicked

    private void btnUbahDataPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahDataPinjamActionPerformed
        // TODO add your handling code here:
        txtIdPinjam.setVisible(true);
        lblIdPeminjaman.setVisible(true);
        if(!txtIdPinjam.getText().equals("")){
            formPeminjaman();
        }else{
            JOptionPane.showMessageDialog(null, "Pilih terlebih dahulu data yang akan di ubah..!");
        }
    }//GEN-LAST:event_btnUbahDataPinjamActionPerformed

    private void btnUbahPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahPinjamActionPerformed
        // TODO add your handling code here:                
        String date = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        String tgl = String.valueOf(sdf.format(txtTglPinjam.getDate()));        
        peminjaman pj = new peminjaman();      
        
        pj.setPeminjaman(txtIdPinjam.getText(), txtIdPeminjam.getText(), txtIsbnPinjam.getText(), tgl);
        pj.editPeminjaman();
        bersihkanFormPeminjaman();
        panelPeminjaman();
    }//GEN-LAST:event_btnUbahPinjamActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        tampilDataPengembalian();
        panelPengembalian();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnTambahDataKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataKembaliActionPerformed
        // TODO add your handling code here:
        lblIdKembali.setVisible(false);
        txtIdKembali.setVisible(false);
        bersihkanFormPengembalian();
        formPengembalian();
    }//GEN-LAST:event_btnTambahDataKembaliActionPerformed

    private void btnTambahPengemabalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPengemabalianActionPerformed
        // TODO add your handling code here:
        pengembalian pb = new pengembalian();
        
        String date = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        String tglPinjam = String.valueOf(sdf.format(txtTglPinjamKb.getDate()));        
        String tglKembali = String.valueOf(sdf.format(txtTglKembali.getDate()));                
        pb.setIdPinjam(txtIdPinjamKembali.getText());
        pb.setTglPinjam(tglPinjam);
        pb.setTglKembali(tglKembali);
        pb.setDenda(Integer.valueOf(txtDenda.getText()));
        pb.tambahPengembalian();
        
        if(pb.getStatus().equals("success")){
            JOptionPane.showMessageDialog(null, "Data Berhasil di Tambahkan");
            tampilDataPengembalian();
            bersihkanFormPengembalian();
            panelPengembalian();
        }        
    }//GEN-LAST:event_btnTambahPengemabalianActionPerformed

    private void txtIdPinjamKembaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPinjamKembaliKeyReleased
        // TODO add your handling code here:
        try{
            String sql = "select tgl_pinjam from t_pinjam where id_peminjaman='"+txtIdPinjamKembali.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                txtTglPinjamKb.setDate(Date.valueOf(rs.getString("tgl_pinjam")));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }
    }//GEN-LAST:event_txtIdPinjamKembaliKeyReleased

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        // TODO add your handling code here: 
        pengembalian pb = new pengembalian();        
        
        try{
            String date = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(date);
            String tgl1 = String.valueOf(sdf.format(txtTglPinjamKb.getDate()));        
            txtTglPinjamKb.setDate(Date.valueOf(tgl1));

            String tgl2 = String.valueOf(sdf.format(txtTglKembali.getDate()));
            txtTglKembali.setDate(Date.valueOf(tgl2));

            long telat = Math.abs(txtTglKembali.getDate().getTime() - txtTglPinjamKb.getDate().getTime());
            txtLama.setText(""+TimeUnit.MILLISECONDS.toDays(telat));            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "tanggal tidak boleh kosong");
        }
        pb.setLama(Integer.valueOf(txtLama.getText()));
        txtDenda.setText(String.valueOf(pb.hitungDenda()));
        txtTelat.setText(String.valueOf(pb.hitungTelat()));
    }//GEN-LAST:event_btnCekActionPerformed

    private void txtDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDendaActionPerformed

    private void txtTglKembaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTglKembaliKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTglKembaliKeyReleased

    private void txtTelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelatActionPerformed

    private void btnBersihkanPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanPengembalianActionPerformed
        // TODO add your handling code here:
        bersihkanFormPengembalian();
    }//GEN-LAST:event_btnBersihkanPengembalianActionPerformed

    private void btnBatalPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalPengembalianActionPerformed
        // TODO add your handling code here:
        panelPengembalian();
    }//GEN-LAST:event_btnBatalPengembalianActionPerformed

    private void btnUbahPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahPengembalianActionPerformed
        // TODO add your handling code here:
        pengembalian pb = new pengembalian();
        
        String date = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        String tglPinjam = String.valueOf(sdf.format(txtTglPinjamKb.getDate()));        
        String tglKembali = String.valueOf(sdf.format(txtTglKembali.getDate()));                
        
        pb.setPengembalian(txtIdKembali.getText(), txtIdPinjamKembali.getText(), tglPinjam, tglKembali, Integer.valueOf(txtDenda.getText()));
        pb.ubahPengembalian();
        panelPengembalian();
        tampilDataPengembalian();
    }//GEN-LAST:event_btnUbahPengembalianActionPerformed

    private void tblKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKembaliMouseClicked
        // TODO add your handling code here:
        int baris = tblKembali.rowAtPoint(evt.getPoint());
        String idKmb = tblKembali.getValueAt(baris, 0).toString();
        txtIdKembali.setText(idKmb);
        String idPjm = tblKembali.getValueAt(baris, 1).toString();
        txtIdPinjamKembali.setText(idPjm);
        String tglPjm = tblKembali.getValueAt(baris, 4).toString();
        txtTglPinjamKb.setDate(Date.valueOf(tglPjm));
        String tglKmb = tblKembali.getValueAt(baris, 5).toString();
        txtTglKembali.setDate(Date.valueOf(tglKmb));
        String dnd = tblKembali.getValueAt(baris, 6).toString();
        txtDenda.setText(dnd);
    }//GEN-LAST:event_tblKembaliMouseClicked

    private void btnUbahDataKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahDataKembaliActionPerformed
        // TODO add your handling code here:
        lblIdKembali.setVisible(true);
        txtIdKembali.setVisible(true);
        if(!txtIdKembali.getText().equals("")){
            formPengembalian();
        }else{
            JOptionPane.showMessageDialog(null, "pilih terlebih dahulu data yg akan di ubah");
        }
    }//GEN-LAST:event_btnUbahDataKembaliActionPerformed

    private void btnHapusDataKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDataKembaliActionPerformed
        // TODO add your handling code here:
        pengembalian pb = new pengembalian();       
                
        if(!txtIdKembali.getText().equals("")){
            int pilihan = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus ?","Konfirmasi Hapus",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);        
            if(pilihan == 0){
                pb.setIdKembali(txtIdKembali.getText());
                pb.hapusPengembalian();
            }
            tampilDataPengembalian();
        }else{
            JOptionPane.showMessageDialog(this, "Pilih terlebih dahulu data yang akan di hapus..!");
        }    
    }//GEN-LAST:event_btnHapusDataKembaliActionPerformed

    private void txtIdAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAktivitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAktivitasActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        tampilDataAktivitas();
        panelAktivitas();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnTambahDataAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataAktivitasActionPerformed
        // TODO add your handling code here:
        lblIdTransaksi.setVisible(false);
        txtIdAktivitas.setVisible(false);
        bersihkanFormAktivitas();
        formAktivitas();
    }//GEN-LAST:event_btnTambahDataAktivitasActionPerformed

    private void btnTambahAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahAktivitasActionPerformed
        // TODO add your handling code here:        
        String date = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        String tgl = String.valueOf(sdf.format(txtTglAktivitas.getDate()));                
        aktivitas tr = new aktivitas();
        
        tr.setIdAnggota(txtIdAnggotaTransaksi.getText());
        tr.setIsbn(txtIsbnTransaksi.getText());
        tr.setTglAktivitas(tgl);
        tr.setJenisAktivitas(cbJenisAktivitas.getSelectedItem().toString());
        tr.setIdPetugas(txtIdPetugasTransaksi.getText());
        tr.tambahTransaksi();
        
        if(tr.getStatus().equals("success")){
            JOptionPane.showMessageDialog(null, "Data Berhasil di Tambahkan");                        
            tampilDataAktivitas();
            bersihkanFormAktivitas();
            panelAktivitas();
        }        
    }//GEN-LAST:event_btnTambahAktivitasActionPerformed

    private void tblAktivitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAktivitasMouseClicked
        // TODO add your handling code here:
        int baris = tblAktivitas.rowAtPoint(evt.getPoint());
        String tr = tblAktivitas.getValueAt(baris, 0).toString();
        txtIdAktivitas.setText(tr);
        String ag = tblAktivitas.getValueAt(baris, 1).toString();
        txtIdAnggotaTransaksi.setText(ag);
        String isbn = tblAktivitas.getValueAt(baris, 3).toString();
        txtIsbnTransaksi.setText(isbn);
        String tgl = tblAktivitas.getValueAt(baris, 5).toString();
        txtTglAktivitas.setDate(Date.valueOf(tgl));
        String jenis = tblAktivitas.getValueAt(baris, 6).toString();
        if(jenis.equals("meminjam")){
            cbJenisAktivitas.setSelectedItem("Meminjam");
        }else{
            cbJenisAktivitas.setSelectedItem("Mengembalikan");
        }
        String ptg = tblAktivitas.getValueAt(baris, 7).toString();
        txtIdPetugasTransaksi.setText(ptg);
    }//GEN-LAST:event_tblAktivitasMouseClicked

    private void btnUbahDataAktivitasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahDataAktivitasiActionPerformed
        // TODO add your handling code here:
        lblIdTransaksi.setVisible(true);
        txtIdAktivitas.setVisible(true);
        if(!txtIdAktivitas.getText().equals("")){
            formAktivitas();
        }else{
            JOptionPane.showMessageDialog(null, "pilih terlebih dahulu data yang akan di ubah");
        }
    }//GEN-LAST:event_btnUbahDataAktivitasiActionPerformed

    private void btnUbahAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahAktivitasActionPerformed
        // TODO add your handling code here:
        String date = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        String tgl = String.valueOf(sdf.format(txtTglAktivitas.getDate()));                
        aktivitas tr = new aktivitas();
        
        tr.setIdAktivitas(txtIdAktivitas.getText());
        tr.setIdAnggota(txtIdAnggotaTransaksi.getText());
        tr.setIsbn(txtIsbnTransaksi.getText());
        tr.setTglAktivitas(tgl);
        tr.setJenisAktivitas(cbJenisAktivitas.getSelectedItem().toString());
        tr.setIdPetugas(txtIdPetugasTransaksi.getText());
        tr.editTransaksi();
        tampilDataAktivitas();
        bersihkanFormAktivitas();
        panelAktivitas();
    }//GEN-LAST:event_btnUbahAktivitasActionPerformed

    private void btnBersihkanAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanAktivitasActionPerformed
        // TODO add your handling code here:
        bersihkanFormAktivitas();
    }//GEN-LAST:event_btnBersihkanAktivitasActionPerformed

    private void btnBatalAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalAktivitasActionPerformed
        // TODO add your handling code here:
        panelAktivitas();
    }//GEN-LAST:event_btnBatalAktivitasActionPerformed

    private void btnHapusDataAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDataAktivitasActionPerformed
        // TODO add your handling code here:
        aktivitas tr = new aktivitas();
        if(!txtIdAktivitas.getText().equals("")){
            int pilihan = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus ?","Konfirmasi Hapus",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);        
            if(pilihan==0){
                tr.setIdAktivitas(txtIdAktivitas.getText());
                tr.hapusTransaksi();
            }            
            tampilDataAktivitas();
        }else{
            JOptionPane.showMessageDialog(null, "pilih terlebih dahulu data yang akan di hapus!");
        }
    }//GEN-LAST:event_btnHapusDataAktivitasActionPerformed

    private void btnCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariBukuActionPerformed
        // TODO add your handling code here:
        String keyword;
        keyword = JOptionPane.showInputDialog(null, "Masukan pencarian buku", "Filter/Pencarian", JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ISBN");
            model.addColumn("Judul Buku");
            model.addColumn("Penulis");
            model.addColumn("Tahun Terbit");
            model.addColumn("Jenis Buku");
            model.addColumn("Penerbit");
            try{
                String sql = "select*from t_buku where judul_buku like '%"+keyword+"%' "
                        + "or penulis like '%"+keyword+"%'"
                        + "or tahun_terbit like '%"+keyword+"%' "
                        + "or penerbit like '%"+keyword+"%'";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql);
                
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
            }            
            tblBuku.setModel(model);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCariBukuActionPerformed

    private void btnCariAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAnggotaActionPerformed
        // TODO add your handling code here:
        String keyword;
        keyword = JOptionPane.showInputDialog(null, "Masukan Pencarian", "Filter/Pencarian", JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("id aggota");
            model.addColumn("Nama");
            model.addColumn("Jenis Kelamin");
            model.addColumn("No Telepon");
            model.addColumn("Alamat");        
            try{
                String sql = "select*from t_anggota where nama_anggota like '%"+keyword+"%' or alamat like '%"+keyword+"%';";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()){
                    model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                }  
                tblAnggota.setModel(model);
            } catch(SQLException e){
                System.out.println("error"+e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCariAnggotaActionPerformed

    private void btnCariPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPetugasActionPerformed
        // TODO add your handling code here:
        String keyword;
        keyword = JOptionPane.showInputDialog(null, "Masukan Pencarian", "Filter/Pencarian", JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Petugas");
            model.addColumn("Nama");        
            model.addColumn("Jabatan");   
            model.addColumn("No Telepon");
            model.addColumn("Password");        
            try{
                String sql = "select*from t_petugas where nama like '%"+keyword+"%' or jabatan like '%"+keyword+"%'";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()){
                    model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                }  
                tblPetugas.setModel(model);
            } catch(SQLException e){
                System.out.println("error"+e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCariPetugasActionPerformed

    private void btnCariPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPeminjamanActionPerformed
        // TODO add your handling code here:
        String keyword;
        keyword = JOptionPane.showInputDialog(null, "Masukan Pencarian", "Filter/Pencarian", JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Peminjaman");         
            model.addColumn("ID Anggota");        
            model.addColumn("Nama Peminjam");                 
            model.addColumn("ISBN");
            model.addColumn("Judul Buku");        
            model.addColumn("Tanggal Pinjam");        
            try{
                String sql = "select t_pinjam.id_peminjaman, "
                        + "t_anggota.id_anggota, "
                        + "t_anggota.nama_anggota, "
                        + "t_buku.isbn,"
                        + "t_buku.judul_buku,"
                        + "t_pinjam.tgl_pinjam "
                        + "from t_anggota, t_buku, t_pinjam "
                        + "where "
                        + "t_anggota.id_anggota=t_pinjam.id_anggota and t_buku.isbn=t_pinjam.isbn "
                        + "and nama_anggota like '%"+keyword+"%' or judul_buku like '%"+keyword+"%'";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()){
                    model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                }  
                tblPinjam.setModel(model);
            } catch(SQLException e){
                System.out.println("error"+e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCariPeminjamanActionPerformed

    private void btnCariPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPengembalianActionPerformed
        // TODO add your handling code here:
        String keyword;
        keyword = JOptionPane.showInputDialog(null, "Masukan Pencarian", "Filter/Pencarian", JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Pengembalian");         
            model.addColumn("ID Peminjaman");        
            model.addColumn("Nama Anggota");                 
            model.addColumn("Judul Buku");                 
            model.addColumn("Tanggal Pinjam");                 
            model.addColumn("Tanggal Kembali");
            model.addColumn("Denda");                    
            try{
                String sql = "select t_kembali.id_pengembalian, "
                        + "t_pinjam.id_peminjaman, "
                        + "t_anggota.nama_anggota, "
                        + "t_buku.judul_buku, "
                        + "t_pinjam.tgl_pinjam, "
                        + "t_kembali.tgl_kembali, "
                        + "t_kembali.denda from t_pinjam, "
                        + "t_kembali, t_anggota, t_buku "
                        + "where "
                        + "t_pinjam.id_peminjaman = t_kembali.id_peminjaman "
                        + "and "
                        + "t_pinjam.id_anggota = t_anggota.id_anggota "
                        + "and "
                        + "t_pinjam.isbn = t_buku.isbn "
                        + "and nama_anggota like '%"+keyword+"%' or judul_buku like '%"+keyword+"%' ";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()){
                    model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
                }  
                tblKembali.setModel(model);
            } catch(SQLException e){
                System.out.println("error"+e.getMessage());
            }             
        }
    }//GEN-LAST:event_btnCariPengembalianActionPerformed

    private void btnCariAktivitasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAktivitasiActionPerformed
        // TODO add your handling code here:
        String keyword;
        keyword = JOptionPane.showInputDialog(null, "Masukan Pencarian", "Filter/Pencarian", JOptionPane.QUESTION_MESSAGE);
        if(keyword!=null){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Aktivitas");         
            model.addColumn("ID Anggota");        
            model.addColumn("Nama Anggota");
            model.addColumn("Isbn");    
            model.addColumn("Judul Buku");    
            model.addColumn("Tanggal");                                               
            model.addColumn("Jenis Aktivitas");  
            model.addColumn("ID Petugas");
            try{
                String sql = " select t_aktivitas.id_aktivitas, "
                        + "t_anggota.id_anggota, "
                        + "t_anggota.nama_anggota, "
                        + "t_buku.isbn, "
                        + "t_buku.judul_buku, "
                        + "t_aktivitas.tgl_aktivitas, "
                        + "t_aktivitas.jenis_aktivitas, "
                        + "t_petugas.id_petugas "
                        + "from t_buku, t_anggota, t_petugas, t_aktivitas "
                        + "where t_aktivitas.id_anggota = t_anggota.id_anggota "
                        + "and t_aktivitas.id_petugas = t_petugas.id_petugas "
                        + "and t_aktivitas.isbn = t_buku.isbn and nama_anggota like '%"+keyword+"%' or judul_buku like '%"+keyword+"%'";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()){
                    model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
                }  
                tblAktivitas.setModel(model);
            } catch(SQLException e){
                System.out.println("error"+e.getMessage());
            }                
        }
    }//GEN-LAST:event_btnCariAktivitasiActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        login lg = new login();
        
        if(txtId.getText().equals("")||txtPwd.getText().equals("")){
            JOptionPane.showMessageDialog(null, "username dan password tidak boleh kosong");
        }else{
            lg.setId(txtId.getText());
            lg.setPassword(txtPwd.getText());
            lg.login();            
        }

        if(lg.getStatus().equals("berhasil")){
            panelUtama();
        }                         
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCetakAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakAktivitasActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection conn = (Connection)konfig.configDB();
            
            HashMap param = new HashMap();
            
            File file = new File("src/laporan/laporanAktivitas.jasper");
            JasperReport jr = (JasperReport)JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            
        }catch(Exception e){
            System.out.println("erorr : "+e.getMessage());
        }
    }//GEN-LAST:event_btnCetakAktivitasActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        tampilDataDashboard();
        panelDashboard();
    }//GEN-LAST:event_jLabel33MouseClicked

    private void panelMenuBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuBukuMouseEntered
        // TODO add your handling code here:        
    }//GEN-LAST:event_panelMenuBukuMouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        panelMenuBuku.setBackground(new Color(107, 115, 138));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        panelMenuBuku.setBackground(new Color(61,67,85));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        panelMenuAnggota.setBackground(new Color(107, 115, 138));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        panelMenuAnggota.setBackground(new Color(61,67,85));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        panelMenuPetugas.setBackground(new Color(107, 115, 138));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        panelMenuPetugas.setBackground(new Color(61,67,85));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        panelMenuPinjam.setBackground(new Color(107, 115, 138));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        panelMenuPinjam.setBackground(new Color(61,67,85));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        panelMenuKembali.setBackground(new Color(107, 115, 138));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        panelMenuKembali.setBackground(new Color(61,67,85));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        panelMenuTransaksi.setBackground(new Color(107, 115, 138));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        panelMenuTransaksi.setBackground(new Color(61,67,85));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        // TODO add your handling code here:
        panelMenuDashboard.setBackground(new Color(107, 115, 138));
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        // TODO add your handling code here:
        panelMenuDashboard.setBackground(new Color(61,67,85));
    }//GEN-LAST:event_jLabel33MouseExited

    private void jLabel54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseEntered
        // TODO add your handling code here:
        menuBuku.setBackground(new Color(209, 209, 209));
    }//GEN-LAST:event_jLabel54MouseEntered

    private void jLabel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseExited
        // TODO add your handling code here:
        menuBuku.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_jLabel54MouseExited

    private void jLabel57MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseEntered
        // TODO add your handling code here:
        menuAnggota.setBackground(new Color(209, 209, 209));
    }//GEN-LAST:event_jLabel57MouseEntered

    private void jLabel57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseExited
        // TODO add your handling code here:
        menuAnggota.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_jLabel57MouseExited

    private void jLabel60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseEntered
        // TODO add your handling code here:
        menuPetugas.setBackground(new Color(209, 209, 209));
    }//GEN-LAST:event_jLabel60MouseEntered

    private void jLabel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseExited
        // TODO add your handling code here:
        menuPetugas.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_jLabel60MouseExited

    private void jLabel63MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseEntered
        // TODO add your handling code here:
        menuPinjam.setBackground(new Color(209, 209, 209));
    }//GEN-LAST:event_jLabel63MouseEntered

    private void jLabel63MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseExited
        // TODO add your handling code here:
        menuPinjam.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_jLabel63MouseExited

    private void jLabel66MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseExited
        // TODO add your handling code here:
        menuKembali.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_jLabel66MouseExited

    private void jLabel66MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseEntered
        // TODO add your handling code here:
        menuKembali.setBackground(new Color(209, 209, 209));
    }//GEN-LAST:event_jLabel66MouseEntered

    private void jLabel69MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseEntered
        // TODO add your handling code here:
        menuAktivitas.setBackground(new Color(209, 209, 209));
    }//GEN-LAST:event_jLabel69MouseEntered

    private void jLabel69MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseExited
        // TODO add your handling code here:
        menuAktivitas.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_jLabel69MouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        panelBuku();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        panelAnggota();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        panelPetugas();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        panelPeminjaman();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        panelPengembalian();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        panelAktivitas();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:        
        JOptionPane.showMessageDialog(null, "Aplikasi Pengolahan Database Perpustakaan\n\n"
                + "Anggota Kelompok : \n "
                + "1. Neti Febriyani - 10119267\n"
                + "2. Rikrik Herdiana - 10119290\n"
                + "3. Rezza Ramdhani N - 10119291\n"
                + "4. Deri Muhamad Handipa - 10119292");        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
        panelBuku();
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        // TODO add your handling code here:
        panelAnggota();
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        // TODO add your handling code here:
        panelPetugas();
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        // TODO add your handling code here:
        panelPeminjaman();
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        // TODO add your handling code here:
        panelPengembalian();
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        // TODO add your handling code here:
        panelAktivitas();
    }//GEN-LAST:event_jLabel69MouseClicked

    private void txtPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwdActionPerformed
        // TODO add your handling code here:
        login lg = new login();
        
        if(txtId.getText().equals("")||txtPwd.getText().equals("")){
            JOptionPane.showMessageDialog(null, "username dan password tidak boleh kosong");
        }else{
            lg.setId(txtId.getText());
            lg.setPassword(txtPwd.getText());
            lg.login();            
        }

        if(lg.getStatus().equals("berhasil")){
            panelUtama();
        }              
    }//GEN-LAST:event_txtPwdActionPerformed

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        // TODO add your handling code here:        
        if(showPassword.getText().equals("Show Password")){
            showPassword.setText("Hide Password");
            txtPwd.setEchoChar((char)0);
        }else{
            showPassword.setText("Show Password");                     
            txtPwd.setEchoChar('*');            
        }
    }//GEN-LAST:event_showPasswordMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalAktivitas;
    private javax.swing.JButton btnBatalAnggota;
    private javax.swing.JButton btnBatalBuku;
    private javax.swing.JButton btnBatalPengembalian;
    private javax.swing.JButton btnBatalPetugas;
    private javax.swing.JButton btnBatalPinjam;
    private javax.swing.JButton btnBersihkanAktivitas;
    private javax.swing.JButton btnBersihkanAnggota;
    private javax.swing.JButton btnBersihkanBuku;
    private javax.swing.JButton btnBersihkanPengembalian;
    private javax.swing.JButton btnBersihkanPetugas;
    private javax.swing.JButton btnBersihkanPinjam;
    private javax.swing.JButton btnCariAktivitasi;
    private javax.swing.JButton btnCariAnggota;
    private javax.swing.JButton btnCariBuku;
    private javax.swing.JButton btnCariPeminjaman;
    private javax.swing.JButton btnCariPengembalian;
    private javax.swing.JButton btnCariPetugas;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnCetakAktivitas;
    private javax.swing.JButton btnEditBuku;
    private javax.swing.JButton btnHapusDataAktivitas;
    private javax.swing.JButton btnHapusDataAnggota;
    private javax.swing.JButton btnHapusDataBuku;
    private javax.swing.JButton btnHapusDataKembali;
    private javax.swing.JButton btnHapusDataPetugas;
    private javax.swing.JButton btnHapusDataPinjam;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnTambahAktivitas;
    private javax.swing.JButton btnTambahAnggota;
    private javax.swing.JButton btnTambahBuku;
    private javax.swing.JButton btnTambahDataAktivitas;
    private javax.swing.JButton btnTambahDataAnggota;
    private javax.swing.JButton btnTambahDataBuku;
    private javax.swing.JButton btnTambahDataKembali;
    private javax.swing.JButton btnTambahDataPetugas;
    private javax.swing.JButton btnTambahDataPinjam;
    private javax.swing.JButton btnTambahPengemabalian;
    private javax.swing.JButton btnTambahPetugas;
    private javax.swing.JButton btnTambahPinjam;
    private javax.swing.JButton btnUbahAktivitas;
    private javax.swing.JButton btnUbahAnggota;
    private javax.swing.JButton btnUbahDataAktivitasi;
    private javax.swing.JButton btnUbahDataAngota;
    private javax.swing.JButton btnUbahDataBuku;
    private javax.swing.JButton btnUbahDataKembali;
    private javax.swing.JButton btnUbahDataPetugas;
    private javax.swing.JButton btnUbahDataPinjam;
    private javax.swing.JButton btnUbahPengembalian;
    private javax.swing.JButton btnUbahPetugas;
    private javax.swing.JButton btnUbahPinjam;
    private javax.swing.JComboBox<String> cbJenisAktivitas;
    private javax.swing.JComboBox<String> cbKelamin;
    private javax.swing.JPanel formAktivitas;
    private javax.swing.JPanel formAnggota;
    private javax.swing.JPanel formBuku;
    private javax.swing.JPanel formPeminjaman;
    private javax.swing.JPanel formPengembalian;
    private javax.swing.JPanel formPetugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lblIdAnggota;
    private javax.swing.JLabel lblIdKembali;
    private javax.swing.JLabel lblIdPeminjaman;
    private javax.swing.JLabel lblIdPetugas;
    private javax.swing.JLabel lblIdTransaksi;
    private javax.swing.JPanel menuAktivitas;
    private javax.swing.JPanel menuAnggota;
    private javax.swing.JPanel menuBuku;
    private javax.swing.JPanel menuKembali;
    private javax.swing.JPanel menuPetugas;
    private javax.swing.JPanel menuPinjam;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPanel panelDataAktivitas;
    private javax.swing.JPanel panelDataAnggota;
    private javax.swing.JPanel panelDataBuku;
    private javax.swing.JPanel panelDataPeminjaman;
    private javax.swing.JPanel panelDataPengembalian;
    private javax.swing.JPanel panelDataPetugas;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuAnggota;
    private javax.swing.JPanel panelMenuBuku;
    private javax.swing.JPanel panelMenuDashboard;
    private javax.swing.JPanel panelMenuKembali;
    private javax.swing.JPanel panelMenuPetugas;
    private javax.swing.JPanel panelMenuPinjam;
    private javax.swing.JPanel panelMenuTransaksi;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JLabel showPassword;
    private javax.swing.JTable tblAktivitas;
    private javax.swing.JTable tblAnggota;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTable tblKembali;
    private javax.swing.JTable tblPetugas;
    private javax.swing.JTable tblPinjam;
    private javax.swing.JTextArea txtAlamatAnggota;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdAktivitas;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdAnggotaTransaksi;
    private javax.swing.JTextField txtIdKembali;
    private javax.swing.JTextField txtIdPeminjam;
    private javax.swing.JTextField txtIdPetugas;
    private javax.swing.JTextField txtIdPetugasTransaksi;
    private javax.swing.JTextField txtIdPinjam;
    private javax.swing.JTextField txtIdPinjamKembali;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtIsbnPinjam;
    private javax.swing.JTextField txtIsbnTransaksi;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JLabel txtJmlAktivitas;
    private javax.swing.JLabel txtJmlAnggota;
    private javax.swing.JLabel txtJmlBuku;
    private javax.swing.JLabel txtJmlKembali;
    private javax.swing.JLabel txtJmlPetugas;
    private javax.swing.JLabel txtJmlPinjam;
    private javax.swing.JTextArea txtJudul;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNamaAnggota;
    private javax.swing.JTextField txtNamaPetugas;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPenulis;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtTahun;
    private javax.swing.JTextField txtTelat;
    private javax.swing.JTextField txtTelpAnggota;
    private javax.swing.JTextField txtTelpPetugas;
    private com.toedter.calendar.JDateChooser txtTglAktivitas;
    private com.toedter.calendar.JDateChooser txtTglKembali;
    private com.toedter.calendar.JDateChooser txtTglPinjam;
    private com.toedter.calendar.JDateChooser txtTglPinjamKb;
    // End of variables declaration//GEN-END:variables
}
