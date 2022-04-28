/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.konfig;

/**
 *
 * @author RezzaRn
 */
public class aktivitas {
    private String idAktivitas, status, idAnggota, idPetugas, isbn, tglAktivitas, jenisAktivitas;
    
    public void setIdAktivitas(String tr){
        this.idAktivitas = tr;
    }
    
    public String getIdAktivitas(){
        return idAktivitas;
    }
    
    public void setIdAnggota(String ag){
        this.idAnggota = ag;
    }
    
    public String getIdAnggota(){
        return idAnggota;
    }
    
    public void setIdPetugas(String ptg){
        this.idPetugas = ptg;
    }
    
    public String getIdPetugas(){
        return idPetugas;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public void setTglAktivitas(String tgl){
        this.tglAktivitas = tgl;
    }
    
    public String getTglTransaksi(){
        return tglAktivitas;
    }
    
    public void setJenisAktivitas(String jt){
        this.jenisAktivitas = jt;
    }
    
    public String getJenisaktivitas(){
        return jenisAktivitas;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void tambahTransaksi(){
        if(!idAnggota.equals("")||idPetugas.equals("")||isbn.equals("")){
            try{
                String sql = "insert into t_aktivitas (id_anggota,id_petugas,isbn,tgl_aktivitas,"
                        + "jenis_aktivitas) values ('"+idAnggota+"','"+idPetugas+"','"+isbn+"',"
                        + "'"+tglAktivitas+"','"+jenisAktivitas+"');";
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
    
    public void editTransaksi(){
        if(!idAnggota.equals("")||idPetugas.equals("")||isbn.equals("")){
            try{
                String sql = "update t_aktivitas set id_aktivitas='"+idAktivitas+"', "
                        + "id_anggota='"+idAnggota+"', id_petugas='"+idPetugas+"', isbn='"+isbn+"', "
                        + "tgl_aktivitas='"+tglAktivitas+"', jenis_aktivitas='"+jenisAktivitas+"' "
                        + "where id_aktivitas='"+idAktivitas+"'";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil di Update..");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Data tidak boleh ada yang kosong");
        }
    }
    
    public void hapusTransaksi(){
        if(!idAktivitas.equals("")){
            try{
                String sql = "delete from t_aktivitas where id_aktivitas='"+idAktivitas+"'";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus..");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan "+e.getMessage());
            }
        }
    }
}
