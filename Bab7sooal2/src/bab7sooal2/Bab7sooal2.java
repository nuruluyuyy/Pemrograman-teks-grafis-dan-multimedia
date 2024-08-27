/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab7sooal2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Bab7sooal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input dari pengguna
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        
        // Input Nama
        System.out.print("NAMA : ");
        String nama = scanner.nextLine();
        
        // Input Tahun
        System.out.print("TAHUN : ");
        int tahun = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline yang tersisa
        
        // Input Pilih Peminatan
        System.out.print("PILIH PEMINATAN (M/J): ");
        char peminatan = scanner.nextLine().charAt (0);
        
        // Menentukan output berdasarkan pilihan peminatan
        String peminatanOutput;
        switch (peminatan) {
            case 'M':
                peminatanOutput = " PEMROGRAMAN MOBILE, PEMROGRAMAN JAVA " + tahun;
                break;
            case 'J':
                peminatanOutput = " PEMROGRAMAN JAVA, PEMROGRAMAN MOBILE " + tahun;
                break;
            default:
                peminatanOutput = " Pilihan peminatan tidak valid ";
                 break;
        }
        
        // Menampilkan hasil
        System.out.println("\nOutput : ");
        System.out.println(peminatanOutput);
                
       
        
}
    }