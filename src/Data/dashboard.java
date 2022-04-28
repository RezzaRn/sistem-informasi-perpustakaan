/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.SQLException;
import koneksi.konfig;

/**
 *
 * @author RezzaRn
 */
public class dashboard {
    private String jmlBuku, jmlAnggota, jmlPetugas, jmlPinjam, jmlKembali, jmlAktivitas;
    
    public String getJmlBuku(){
        return jmlBuku;
    }
    
    public String getJmlAnggota(){
        return jmlAnggota;
    }
    
    public String getJmlPetugas(){
        return jmlPetugas;
    }
    
    public String getJmlPinjam(){
        return jmlPinjam;
    }
    
    public String getJmlKembali(){
        return jmlKembali;
    }
    
    public String getJmlAktivitas(){
        return jmlAktivitas;
    }
    
    public void jumlahBuku(){
        try{
           String sql = "select count(*) as jumlah from t_buku" ;
           java.sql.Connection conn = (Connection)konfig.configDB();
           java.sql.Statement stmt = conn.createStatement();
           java.sql.ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
               jmlBuku = rs.getString("jumlah");
           }
        }catch(SQLException e){
            
        }
    }
    
    public void jumlahAnggota(){
        try{
           String sql = "select count(*) as jumlah from t_anggota" ;
           java.sql.Connection conn = (Connection)konfig.configDB();
           java.sql.Statement stmt = conn.createStatement();
           java.sql.ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
               jmlAnggota = rs.getString("jumlah");
           }
        }catch(SQLException e){
            
        }
    }
    
    public void jumlahPetugas(){
        try{
           String sql = "select count(*) as jumlah from t_petugas" ;
           java.sql.Connection conn = (Connection)konfig.configDB();
           java.sql.Statement stmt = conn.createStatement();
           java.sql.ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
               jmlPetugas = rs.getString("jumlah");
           }
        }catch(SQLException e){
            
        }
    }
    
    public void jumlahPinjam(){
        try{
           String sql = "select count(*) as jumlah from t_pinjam where tgl_pinjam=curdate()" ;
           java.sql.Connection conn = (Connection)konfig.configDB();
           java.sql.Statement stmt = conn.createStatement();
           java.sql.ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
               jmlPinjam = rs.getString("jumlah");
           }
        }catch(SQLException e){
            
        }
    }
    
    public void jumlahKembali(){
        try{
           String sql = "select count(*) as jumlah from t_kembali where tgl_kembali=curdate()" ;
           java.sql.Connection conn = (Connection)konfig.configDB();
           java.sql.Statement stmt = conn.createStatement();
           java.sql.ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
               jmlKembali = rs.getString("jumlah");
           }
        }catch(SQLException e){
            
        }
    }
    
    public void jumlahAktifitas(){
        try{
           String sql = "select count(*) as jumlah from t_aktivitas where tgl_aktivitas=curdate()" ;
           java.sql.Connection conn = (Connection)konfig.configDB();
           java.sql.Statement stmt = conn.createStatement();
           java.sql.ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
               jmlAktivitas = rs.getString("jumlah");
           }
        }catch(SQLException e){
            
        }
    }
}
