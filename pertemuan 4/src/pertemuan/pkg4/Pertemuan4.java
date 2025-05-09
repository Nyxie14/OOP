/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg4;

import java.util.Scanner;



/**
 *
 * @author Gede Wahyu Raditya
 */ 
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        
        nama[0] = "Yinari";
        nama[1] = "wahyu";
        nama[2] = "andre";
        nama[3] = "wila";
        nama[4]="Raditya";
        
        Scanner inp = new Scanner(System.in);
        
        for(int idx=0; idx<5; idx++ ){
            System.out.print("Data Teman ke-"+String.valueOf(idx)+":");
            nama[idx]=inp.nextLine();
        }
//        String namateman = nama[3];
//        System.out.printf("data teman: %s",nama[2]);
        for (int i = 0; i< nama.length; i++){
            System.out.println("nama pada index ke-"+i+":"+nama[i]);
        }
        //foreach
        for(String nm:nama){
            System.out.println(nm);
        }
    }
    
}
