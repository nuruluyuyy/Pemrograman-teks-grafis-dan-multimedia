/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8soal2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Bab8soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Mengambil input dari pengguna
        System.out.print("Tahun Akhir ? : ");
        int tahunAkhir = scanner.nextInt();
        
        // Tahun awal
        System.out.print("Tahun Awal ? : ");
        int tahunAwal = scanner.nextInt();
        
        // Menampilkan tahun dari tahun akhir ke tahun awal
        System.out.println("Hasilnya :");
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System .out.println(tahun);
        }
        
        // Menutup scanner
        scanner.close();
        
    }
    
}
