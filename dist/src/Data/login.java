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
public class login {
    private String id, password, status;
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setPassword(String pwd){
        this.password = pwd;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void login(){       
        try{
                String sql = "select*from t_petugas where id_petugas='"+id+"' and password='"+password+"'";
                java.sql.Connection conn = (Connection)konfig.configDB();
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql);

                if(rs.next()){
                    if(!id.equals(rs.getString("nama")) && password.equals(rs.getString("password"))){
                        status = "berhasil";
                        JOptionPane.showMessageDialog(null, "Login Berhasil");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah!");
                }  
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "terjadi kesalahan :"+e.getMessage());
            }
    }
}
