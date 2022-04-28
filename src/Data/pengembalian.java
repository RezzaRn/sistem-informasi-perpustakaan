package Data;


import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.konfig;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RezzaRn
 */
public class pengembalian {
    private String idKembali, idPinjam, tglPinjam, tglKembali, status;
    private int denda;
    private int lama, telat;
    
    public void setIdKembali(String idKmb){
        this.idKembali = idKmb;
    }
    
    public String getIdKembali(){
        return idKembali;
    }
    
    public void setIdPinjam(String idPjm){
        this.idPinjam = idPjm;
    }
    
    public String getIdPinjam(){
        return idPinjam;
    }
    
    public void setTglPinjam(String tglPj){
        this.tglPinjam = tglPj;
    }
    
    public String getTglPinjam(){
        return tglPinjam;
    }
    
    public void setTglKembali(String tglKm){
        this.tglKembali = tglKm;
    }
    
    public String getTglKembali(){
        return tglKembali;
    }
    
    public void setDenda(int denda){
        this.denda = denda;
    }        
    
    public int hitungTelat(){
        telat = lama-3;
        if(telat<0){
            return telat=0;
        }
        return telat;
    }
    
    public int hitungDenda(){                  
        if(lama>3){               
            return denda = 1000*hitungTelat();
        }else{
            return denda = 0;
        }        
    } 
    
    public void setLama(int lm){
        this.lama = lm;
    }
    
    public int getLama(){
        return lama;
    }        
    
    public String getStatus(){
        return status;
    }
    
    public void setPengembalian(String idKm, String idPj, String tglPj, String tglKm, int denda){
        setIdKembali(idKm);
        setIdPinjam(idPj);
        setTglPinjam(tglPj);
        setTglKembali(tglKm);
        setDenda(denda);
    }     
    
    
    public void tambahPengembalian(){
        if(!idPinjam.equals("")||tglKembali.equals("")){
            try{
                String sql = "insert into t_kembali (id_peminjaman,tgl_kembali,denda) values "
                        + "('"+idPinjam+"','"+tglKembali+"','"+denda+"');";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                status = "success";
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Data tidak boleh ada yang kosong");
        }
    }
    
    public void ubahPengembalian(){
        try{
            String sql = "update t_kembali set id_pengembalian='"+idKembali+"', "
                    + "id_peminjaman='"+idPinjam+"', tgl_kembali='"+tglKembali+"', "
                    + "denda='"+String.valueOf(denda)+"' where id_pengembalian='"+idKembali+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update..");                        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan "+e.getMessage());
        }
    }
    
    public void hapusPengembalian(){
        try{
            String sql = "delete from t_kembali where id_pengembalian='"+idKembali+"';";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus..");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "terjadi kesalahan "+e.getMessage());
        }
    }
}
