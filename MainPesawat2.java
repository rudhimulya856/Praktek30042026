/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek30042026;

import java.util.Scanner;

/**
 *
 * @author dhiii
 */
public class MainPesawat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah pesawat");
        int jumlah = input.nextInt();
        input.nextLine();// buang newline
        
        Pesawat[] daftarPesawat = new Pesawat[jumlah]; 
        
        for (int i = 0; i < jumlah; i++){
            System.out.println("\n== Input Data Pesawat ke-"+(i+1)+"==");
            
            System.out.print("Nama Pesawat:");
            String nama = input.nextLine();
            
            System.out.print("Tahun Produksi:");
            int tahunproduksi = input.nextInt();
            
            System.out.print("Menggunakan Mesin? (true/false):");
            boolean mesin = input.nextBoolean();
            
            System.out.print("Muatan (jumlah penumpang):");
            int muatan = input.nextInt();
            input.nextLine(); //buang newline
            
            daftarPesawat[i] = new Pesawat (nama, tahunproduksi, mesin, muatan);      
        }
        System.out.println("\n===Daftar Pesawat===");
        System.out.println(">> Pesawat ke-1");
        daftarPesawat[0].cetak();
        
        int max = daftarPesawat[0].getMuatan();
        String maxnama = daftarPesawat[0].getNama();
        for(int i = 1; i < daftarPesawat.length; i++){
            System.out.println(">> pesawat ke-"+(i+1));
            daftarPesawat[i].cetak();
            if(daftarPesawat[i].getMuatan()>max)
            {
                max = daftarPesawat[i].getMuatan();
                maxnama = daftarPesawat[i].getNama();
            }
              System.out.println(); 
        }
        
    }
    
}
