/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akhmad
 */
public class admin extends konek {
    public admin(){
        setkonek();
    }
    public void simpanUser(String username,String password,String nama_lengkap,String no_telp,String alamat){
        String simpan = "INSERT INTO admin (username,pass,nama_lengkap,notelp,alamat) VALUES('"+username+"','"+password+"','"+nama_lengkap+"','"+no_telp+"','"+alamat+"')";
        try {       
            st.executeUpdate(simpan);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
