/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Gede Wahyu Raditya
 * TGL: 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama= "Wahyu";
        String nim= "2301010029";
        double ipk=3.25;
        
        
        BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Nama Mahasiswa: ");
        try{
            nama= dtain.readLine();
        }catch(IOException e){
            System.out.println("Error pembacaan data");
        }
        System.out.print("Input NIM Mahasiswa: ");
        try{
            nim= dtain.readLine();
        }catch(IOException e){
            System.out.println("Error pembacaan data");
        }
         System.out.print("Input IPK Mahasiswa: ");
        try{
            ipk= Double.parseDouble(dtain.readLine());
        }catch(IOException e){
            System.out.println("Error pembacaan data");
        }
        
        
        System.out.println(nama);
        System.out.println(nim);
        
        System.out.printf("Nama Saya %s dengan NIM %s dengan IPK %.2f", nama, nim,ipk);
    }
    
}
