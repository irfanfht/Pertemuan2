/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2_10117060_Latihan17_Kelipatan;

import java.util.Scanner;

/**
 *
 * @author Irfan Faisal Hutama Tanjung
 * NAMA: Irfan Faisal Hutama Tanjung
 * Kelas: IF-2
 * Nim : 10117060
 * Matkul: PBO-2
 * Deskripsi Program: PENAMPILAN PROGRAM TUNJANGAN GAJI
 */
public class PBO2_10117060_Latihan17_Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double gajiPokok,totalGaji;
        String status;
        int tunjangan;
     
        
        System.out.println("======Program Tunjangan======");
        System.out.println("Berapa Gaji Pokok Anda Perbulan ?: Rp. ");
           Scanner scanner = new Scanner (System.in);
           
 
        gajiPokok = scanner.nextDouble();
    
       System.out.println("Gaji Pokok Anda Perbulan ?:|" +gajiPokok);
        System.out.println("Satus Anda (Menikah/Lajang) :|");
       
      status = scanner.next();
    
        System.out.println("Status Anda (Menikah/Lajang) :|" +status);
        
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        
        System.out.println("Gaji Pokok :" +gajiPokok);
        tunjangan =(int)((status.equalsIgnoreCase("menikah"))? gajiPokok*35/100 :0);
        
        System.out.println("Tunjangan :" +tunjangan);
        totalGaji = gajiPokok+tunjangan;
        System.out.println("Total Gaji :" +totalGaji);
        
    }
    
}
