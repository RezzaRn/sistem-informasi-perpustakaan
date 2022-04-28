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
public class anggota {
    private String namaAnggota, noTelp, alamat, status;
    private String idAnggota;
    private Object jenisKelamin;
    
    public void setIdAnggota(String id){
        this.idAnggota = id;
    }
    
    public String getIdAnggota(){
        return idAnggota;
    }
    
    public void setNamaAnggota(String nm){
        this.namaAnggota = nm;
    }
    
    public String getNamaAnggota(){
        return namaAnggota;
    }
    
    public void setKelamin(Object jk){
        this.jenisKelamin = jk;
    }
    
    public Object getKelamin(){        
        return jenisKelamin;
    }
    
    public void setTelp(String telp){
        this.noTelp = telp;
    }
    
    public String getTelp(){
        return noTelp;
    }
    
    public void setAlamat(String almt){
        this.alamat = almt;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setAnggota(String id, String nm, Object jk, String no, String alm){
        setIdAnggota(id);
        setNamaAnggota(nm);
        setKelamin(jk);
        setTelp(no);
        setAlamat(alm);
    }
    
    public void tambahAnggota(){                                       
        if(!(namaAnggota.equals("")||jenisKelamin.equals("")||noTelp.equals("")||alamat.equals(""))){
            try{
                String sql = "insert into t_anggota (nama_anggota,jenis_kelamin,no_telpon,alamat) "
                        + "values ('"+namaAnggota+"','"+jenisKelamin+"','"+noTelp+"','"+alamat+"');";
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
    
    public void hapusAnggota(){                    
        try{
            String sql = "delete from t_anggota where id_anggota='"+idAnggota+"';";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus..");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "terjadi kesalahan "+e.getMessage());
        }
    }
    
     public void editAnggota(){      
        try{
            String sql = "update t_anggota set id_anggota='"+idAnggota+"', "
                    + "nama_anggota='"+namaAnggota+"', jenis_kelamin='"+jenisKelamin+"', "
                    + "no_telpon='"+noTelp+"', alamat='"+alamat+"' where id_anggota='"+idAnggota+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update..");                        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan "+e.getMessage());
        }
    }
}
