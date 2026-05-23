/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek30042026;

/**
 *
 * @author dhiii
 */
public class kendaraan {
    private String nama;
    private int tahunProduksi;
    
    public kendaraan() {
        
    }
    
    public kendaraan(String nama, int tahunProduksi) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getTahunproduksi() {
        return tahunProduksi;
    }
    
    public void setTahunPorduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    
    public void cetak() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}
