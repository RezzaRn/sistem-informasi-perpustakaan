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
public class peminjaman {
    private String idPinjam, idAnggota, isbn, tglPinjam, status;
    
    public void setIdPinjam(String id){
        this.idPinjam = id;
    }
    
    public String getIdPinjam(){
        return idPinjam;
    }
    
    public void setIdAnggota(String idAg){
        this.idAnggota = idAg;
    }
    
    public String getIdAnggota(){
        return idAnggota;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public void setTglPinjam(String tgl){
        this.tglPinjam = tgl;
    }
    
    public String getTglPinjam(){
        return tglPinjam;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setPeminjaman(String id, String ag, String no, String tgl){
        setIdPinjam(id);
        setIdAnggota(ag);
        setIsbn(no);
        setTglPinjam(tgl);
    }
    
    public void tambahPeminjaman(){                
        if(!idAnggota.equals("")||isbn.equals("")){
            try{
                String sql = "insert into t_pinjam (id_anggota,isbn,tgl_pinjam) values "
                        + "('"+idAnggota+"','"+isbn+"','"+tglPinjam+"');";
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
    
    public void hapusPeminjaman(){                    
        try{
            String sql = "delete from t_pinjam where id_peminjaman='"+idPinjam+"';";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus..");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "terjadi kesalahan "+e.getMessage());
        }
    }
    
     public void editPeminjaman(){      
        try{
            String sql = "update t_pinjam set id_peminjaman='"+idPinjam+"', "
                    + "id_anggota='"+idAnggota+"', isbn='"+isbn+"', tgl_pinjam='"+tglPinjam+"' "
                    + "where id_peminjaman='"+idPinjam+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update..");                        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan "+e.getMessage());
        }
    }
}
