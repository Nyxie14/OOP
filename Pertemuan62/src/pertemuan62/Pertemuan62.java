/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan62;

/**
 *
 * @author Gede Wahyu Raditya
 */
import java.util.Scanner;

public class Pertemuan62 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LuasSegiTiga sg01 = new LuasSegiTiga();

        System.out.print("Masukkan alas: ");
        sg01.alas = (int) input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        sg01.tinggi = (int) input.nextDouble();

        System.out.println("Luas Segitiga: " + sg01.hitungluas());
    }
}

