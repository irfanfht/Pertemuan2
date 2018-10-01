/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini untuk mengubah huruf besar dan kecil
 */
package PBO2_10117060_Latihan27_Huruf_Besar_Kecil;

import java.util.Scanner;

public class PBO2_10117060_Latihan27_Huruf_Besar_Kecil {

    public static void main(String[] args) {

        String Kalimat;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();

        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf kecil = " + Kecil);
    }

}
