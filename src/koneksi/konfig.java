/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RezzaRn
 */
public class konfig {
    private static Connection MYSQLConfig;
    
    public static Connection configDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/db10119291Perpustakaan";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url,user,pass);
        } catch(SQLException e) {
            System.out.println("Koneksi ke databases gagal "+e.getMessage());
        }
        return MYSQLConfig;
    }
}