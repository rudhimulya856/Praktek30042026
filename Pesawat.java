/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek30042026;

/**
 *
 * @author dhiii
 */
public class Pesawat extends udara {
    private int muatan;
    
    public int getMuatan(){
        return muatan;
    }
    public void setMuatan(int muatan){
        this.muatan=muatan;
    }
    public Pesawat(){
        super();
    }
    public Pesawat(String nama, int tahunproduksi, boolean mesin, int muatan){
        super(nama,tahunproduksi,mesin);
        this.muatan=muatan;
    }
    public void reset(String nama, int tahunproduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunproduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    public String kategori(int muatan){
        if (muatan <=50)
            return "kecil";
        else if (muatan <= 150)
            return "sedang";
        else
            return "Besar";
    }
    public void cetak(){
        
        System.out.println("Muatan:"+muatan+"penumpang");
        System.out.println("Kategori"+kategori(muatan));
    }

    private void setTahunProduksi(int tahunproduksi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
