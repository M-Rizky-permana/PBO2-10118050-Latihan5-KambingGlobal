/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO210118050Latihan5KambingGlobal;

/**
 *
 * @author 
 * NAMA     : Muhamad Rizky Permana
 * KELAS    : IF-2
 * NIM      : 10118050
 * Deskripsi Program : Menampilkan data kambing global
 */
public class PBO210118050Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    int jumlahKambing = 88;
    
    //
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    
    }
    
    //
     public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
         System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    
    }
    
    public static void main(String[] args) {
       PBO210118050Latihan5KambingGlobal kambingSusu = new PBO210118050Latihan5KambingGlobal();
       
        
        //
       kambingSusu.getJumlahKambing(); 
        
       //
       kambingSusu.tambahKambing();
       
       //
       kambingSusu.getJumlahKambing();
        
    }
    
}
