/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8soal1;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Bab8soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);
       
        // Input nilai awal
        System.out.print("Nilai Awal ? : ");
        int nilaiAwal = scanner.nextInt();
        
        // Meminta input nilai akhir
        System.out.print("Nilai Akhir ? :");
        int nilaiAkhir = scanner.nextInt();
        
        // Menampilkan hasil pertambahan dengan langkah 5
        System.out.println("Hasil nya : ");
        int nomor = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(nomor + ". " + i);
            nomor++;
            
        // Menutup scanner
        scanner.close();
        
        }
    }
    
    
}
