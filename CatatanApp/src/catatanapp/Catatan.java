/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catatanapp;

/**
 *
 * @author Gede Wahyu Raditya
 */
public class Catatan {
     private int id;
    private String isi;

    // Constructor default
    public Catatan() {
        this.id = 0;
        this.isi = "";
    }

    // Constructor overloading
    public Catatan(int id, String isi) {
        this.id = id;
        this.isi = isi;
    }

    public int getId() {
        return id;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    @Override
    public String toString() {
        return id + ". " + isi;
    }
}
