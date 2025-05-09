/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Gede Wahyu Raditya
 */ 
public class PERTEMUAN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnakulit="brown";
        johan.SetWarnaRambut("hitam");
        
        manusia yani = new manusia("P");
        yani.warnakulit="hytam";
        yani.SetWarnaRambut("biru");
        
    }
    
}

class manusia{
    public String warnakulit="";
    private String warnarambut="";
    private String jk="";
    
    //constractor
    public manusia(String Jkel){
        this.jk= Jkel;
    }
    
    public void SetWarnaRambut(String warna){
        this.warnarambut = warna;
    }
}