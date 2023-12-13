/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akhmad
 */

public class konek {
    Connection con;
    Statement st;
    public ResultSet rs;
    
    public void setkonek() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msyifaudzihni","root","");
            st = con.createStatement();
            System.out.println("Koneksi sukses");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(konek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(konek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        konek k = new konek();
        k.setkonek();
    }
}