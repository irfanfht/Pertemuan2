/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENGGANTI/MERUBAH KATA 
 * YANG TELAH DI INPUTKAN OLEH USER
 */
package PBO2_10117060_Latihan28_Ganti_Kata;

import java.util.Scanner;

public class PBO2_10117060_Latihan_Ganti_Kata {

    public static void main(String[] args) {

        String Kalimat;
        String nGanti,nJadi;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        nGanti = scanner.nextLine();
        
        System.out.print("Menjadi Kata : ");
        nJadi = scanner.nextLine();
                      
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("ADALAH : "+ganti);        
    }

}
