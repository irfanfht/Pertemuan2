/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan WAKTU DAN TANGGAL SEKARANG
 */
package PBO2_10117060_Latihan26_WaktuSaatIni;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PBO2_10117060_Latihan26_WaktuSaatIni {

    public static void main(String[] args) {

     Date Waktu = new Date( );
      SimpleDateFormat FormatWaktu = new SimpleDateFormat ("EEEE, dd MMM yyyy hh:mm:ss");

      System.out.println("Hari ini adalah hari : " + FormatWaktu.format(Waktu));
    }

}
