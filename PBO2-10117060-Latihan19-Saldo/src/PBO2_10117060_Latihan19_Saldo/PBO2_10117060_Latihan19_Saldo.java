/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2_10117060_Latihan19_Saldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 ** NAMA      : Irfan Faisal Hutama Tanjung
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES :PROGRAM MENAMPILKAN SALDO 
 * @author Irfan Faisal Hutama Tanjung
 */
public class PBO2_10117060_Latihan19_Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double bunga;
        int saldo,bulan ;
     
        saldo = 2500000;
       bulan = 1;
       DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
    while (bulan <= 6 ){
        saldo = (int) (saldo + (saldo * 0.15));
        System.out.printf("Saldo Di Bulan ke-" + bulan + " Rp.%s \n ", kursIndonesia.format(saldo));
        bulan = bulan +1;
    }
    
    }
    
}
