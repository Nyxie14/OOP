/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan9;

import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Gede Wahyu Raditya
 */
public class Pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            dbcon dbc = new dbcon();
            Statement stm =  dbc.koneksi().createStatement();
            String sql="SELECT * FROM datateman";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                System.out.println("Nama: "+rs.getString("namateman"));
                System.out.println("Alamat: "+rs.getString("alamat"));
                System.out.println("Telp: "+rs.getString("telp"));
            } 
        }catch(Exception error){
            System.out.println("Error akses data teman");
            
        }
        
    }
    
}
