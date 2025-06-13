/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catatanapp;

import java.util.Scanner;

/**
 *
 * @author Gede Wahyu Raditya
 */
public class CatatanApp {
// INI ADALAH ARRAY UNTUK MENYIMPAN OBJEK Catatan
    private Catatan[] catatanArray = new Catatan[100]; 
    private int jumlahCatatan = 0; // menghitung berapa banyak catatan disimpan
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CatatanApp app = new CatatanApp();
        app.menu(); // jalankan aplikasi
    }

    public void menu() {
        int pilihan;
        do {
            System.out.println("\n=== Aplikasi Catatan (Menggunakan Array) ===");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Tampilkan Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    tambahCatatan();
                    break;
                case 2:
                    tampilkanCatatan();
                    break;
                case 3:
                    ubahCatatan();
                    break;
                case 4:
                    hapusCatatan();
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    private void tambahCatatan() {
        if (jumlahCatatan < catatanArray.length) {
            System.out.print("Masukkan isi catatan: ");
            String isi = scanner.nextLine();
            // Buat objek baru lalu simpan di array
            Catatan catatan = new Catatan(jumlahCatatan + 1, isi);
            catatanArray[jumlahCatatan] = catatan;
            jumlahCatatan++;
            System.out.println("Catatan berhasil ditambahkan ke array.");
        } else {
            System.out.println("Array penuh, tidak bisa menambah catatan lagi.");
        }
    }

    private void tampilkanCatatan() {
        System.out.println("\n--- Daftar Catatan (Dari Array) ---");
        if (jumlahCatatan == 0) {
            System.out.println("Belum ada catatan.");
        } else {
            // Loop array untuk menampilkan semua catatan
            for (int i = 0; i < jumlahCatatan; i++) {
                System.out.println(catatanArray[i]);
            }
        }
    }

    private void ubahCatatan() {
        tampilkanCatatan();
        if (jumlahCatatan > 0) {
            System.out.print("Masukkan nomor catatan yang mau diubah: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine(); // buang newline
            if (index >= 0 && index < jumlahCatatan) {
                System.out.print("Masukkan isi baru: ");
                String isiBaru = scanner.nextLine();
                // Ubah isi catatan di array
                catatanArray[index].setIsi(isiBaru);
                System.out.println("Catatan berhasil diubah.");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    private void hapusCatatan() {
        tampilkanCatatan();
        if (jumlahCatatan > 0) {
            System.out.print("Masukkan nomor catatan yang mau dihapus: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine(); // buang newline
            if (index >= 0 && index < jumlahCatatan) {
                // Geser array ke kiri supaya tidak ada lubang
                for (int i = index; i < jumlahCatatan - 1; i++) {
                    catatanArray[i] = catatanArray[i + 1];
                    // Update ID agar tetap urut
                    catatanArray[i] = new Catatan(i + 1, catatanArray[i].getIsi());
                }
                // Null-kan item terakhir
                catatanArray[jumlahCatatan - 1] = null;
                jumlahCatatan--;
                System.out.println("Catatan berhasil dihapus.");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }    
}
