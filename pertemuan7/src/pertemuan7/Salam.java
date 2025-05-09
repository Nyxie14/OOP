/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Gede Wahyu Raditya
 */
public class Salam {
    String tx="Tuliskan pesan anda";
    
    void tulispesan(){
        System.out.println(this.tx);
    }
    void tulispesan(String txt1){
        System.out.println(txt1);
    }
    void tulispesan(String nim, String nama){
        System.out.println("Nim saya "+nim+" Nama Saya "+ nama);
    }
}
