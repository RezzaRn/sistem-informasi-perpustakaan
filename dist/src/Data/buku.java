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
public class buku {
    private String isbn,judulBuku,penulis,jenisBuku,penerbit, tahunTerbit, status;     
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public void setJudulBuku(String judul){
        this.judulBuku = judul;
    }
    
    public String getJudulBuku(){
        return judulBuku;                
    }
    
    public void setPenulis(String pn){
        this.penulis = pn;
    }
    
    public String getPenulis(){
        return penulis;
    }
    
    public void setJenisBuku(String jb){
        this.jenisBuku = jb;
    }
    
    public String getJenisBuku(){
        return jenisBuku;
    }
    
    public void setPenerbit(String pn){
        this.penerbit = pn;
    }
    
    public String getPenerbit(){
        return penerbit;
    }
    
    public void setTahun(String thn){
        this.tahunTerbit = thn;
    }
    
    public String getTahun(){
        return tahunTerbit;
    }       
    
    public String getStatus(){
        return status;
    }
    
    public void setBuku(String isbn, String jdl, String pnls, String thn, String jns, String pnrbt){
        setIsbn(isbn);
        setJudulBuku(jdl);
        setPenulis(pnls);
        setTahun(thn);
        setJenisBuku(jns);
        setPenerbit(pnrbt);
    }
    
    public void tambahBuku(){                
        if(!(isbn.equals("")||judulBuku.equals("")||penulis.equals("")||penerbit.equals(""))){
            try{
                String sql = "insert into t_buku values ('"+isbn+"','"+judulBuku+"','"+penulis+"'"
                        + ",'"+tahunTerbit+"','"+jenisBuku+"','"+penerbit+"');";
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
    
    public void hapusBuku(){                    
        try{
            String sql = "delete from t_buku where isbn='"+isbn+"';";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus..");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "terjadi kesalahan "+e.getMessage());
        }
    }
    
    public void editBuku(){
        try{
            String sql = "update t_buku set isbn='"+isbn+"', judul_buku='"+judulBuku+"', "
                    + "penulis='"+penulis+"', tahun_terbit='"+tahunTerbit+"', "
                    + "jenis_buku='"+jenisBuku+"', penerbit='"+penerbit+"' where isbn='"+isbn+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update..");                        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan "+e.getMessage());
        }
    }                
}
