/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Bab9soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai awal dan nilai akhir
        System.out.println(" Masukkan bilangan awal: ");
        int awal = scanner.nextInt();
        
        System.out.println(" Masukkan bilangan akhir: ");
        int akhir = scanner.nextInt();
                
        // Menampilkan hasil deret bilangan
        System.out.println(" Hasil deret bilangan: ");
        for (int i = awal; i <= akhir; i+=5) {
            System.out.println(i);
            if (i + 5 <= akhir) {
                System.out.println(", ");
            }
        }
    }
    
}
