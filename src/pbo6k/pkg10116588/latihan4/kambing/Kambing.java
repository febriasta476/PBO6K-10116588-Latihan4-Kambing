/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan4.kambing;

/**
 *
 * @author Indra F
 * Nama                     : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan
 * Jenis - jenis tipe data  : string,bilangan bulat
 */
 
public class Kambing {

   public void tambahKambing() {
       //Deklarasi variabel lokal
       int jumlahKambing = 0;
       
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah Kambing setelah ditambah:" +
               jumlahKambing);
   }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}

