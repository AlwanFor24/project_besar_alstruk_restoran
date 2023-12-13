/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author Akhmad
 */
public class getMenu {
    private int id;
    private String nama_menu;
    private String harga;
    
    public getMenu (int id, String Nama, String Harga){
        this.id = id;
        this.nama_menu = Nama;
        this.harga = Harga;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNama(){
        return nama_menu;
    }
    
    public String getHarga(){
        return harga;
    }
   
}
