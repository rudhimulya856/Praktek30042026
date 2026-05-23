/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek30042026;

/**
 *
 * @author dhiii
 */
public class mainhewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hewan hewanUmum = new hewan("Makhluk");
        kucing kucing = new kucing("mike");
        anjing anjing = new anjing("bob");
        
        hewanUmum.tampilkanNama();
        hewanUmum.bersuara();
        
        System.out.println();
        
        kucing.tampilkanNama();
        kucing.bersuara();
        
        System.out.println();
        
        anjing.tampilkanNama();
        anjing.bersuara();
    
        System.out.println();
    }
    
}
