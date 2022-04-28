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
public class petugas {
    private String idPetugas, namaPetugas, jabatan, noTelp, password, status;
    
    public void setIdPetugas(String id){
        this.idPetugas = id;
    }
    
    public String getIdPetugas(){
        return idPetugas;
    }
    
    public void setNamaPetugas(String nm){
        this.namaPetugas = nm;
    }
    
    public String getNamaPetugas(){
        return namaPetugas;
    }
    
    public void setTelpPetugas(String tlp){
        this.noTelp = tlp;
    }
    
    public String getTelpPetugas(){
        return noTelp;
    }
    
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setJabatan(String jb){
        this.jabatan = jb;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setPetugas(String id, String nm, String jb, String no, String pass){
        setIdPetugas(id);
        setNamaPetugas(nm);
        setJabatan(jb);
        setTelpPetugas(no);
        setPassword(pass);
    }
    
    public void tambahPetugas(){                                       
        if(!namaPetugas.equals("")||jabatan.equals("")||password.equals("")){
            try{
                String sql = "insert into t_petugas (nama,jabatan,no_hp,password) values "
                        + "('"+namaPetugas+"','"+jabatan+"','"+noTelp+"','"+password+"');";
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
    
    public void editPetugas(){      
        try{
            String sql = "update t_petugas set id_petugas='"+idPetugas+"', nama='"+namaPetugas+"', "
                    + "jabatan='"+jabatan+"', no_hp='"+noTelp+"', password='"+password+"' where "
                    + "id_petugas='"+idPetugas+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update..");                        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan "+e.getMessage());
        }
    }
    
    public void hapusPetugas(){                    
        try{
            String sql = "delete from t_petugas where id_petugas='"+idPetugas+"';";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus..");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "terjadi kesalahan "+e.getMessage());
        }
    }
}
