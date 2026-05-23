/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek30042026;

/**
 *
 * @author dhiii
 */
public class udara extends kendaraan {
    private boolean mesin;
    
    public udara() {
        super();
    }
    public udara(String nama, int tahunProduksi, boolean mesin){
        super(nama, tahunProduksi);
        this.mesin = mesin;
    }
    public boolean getMesin() {
        return mesin;
    }
    
    public void setMesin(Boolean mesin) {
        this.mesin = mesin;
    }
    
    @Override
    public void cetak() {
        super.cetak();
        System.out.println("menggunakan mesin: " + mesin);
    } 
}
