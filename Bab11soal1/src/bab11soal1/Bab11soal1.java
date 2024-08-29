/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab11soal1;

/**
 *
 * @author Lenovo
 */
public class Bab11soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Membuat objek karyawan dengan constructor parameter
        Karyawan karyawan1 = new Karyawan("101", "John Doe", "A", "Manager", 8000000.0);
        Karyawan karyawan2 = new Karyawan("102", "Jane Smith", "B", "Staff", 6000000.0);
        
        // Menampilkan informasi karyawan
        System.out.println(" Informasi Karyawan 1: ");
        karyawan1.tampilkanInfo();
        
        System.out.println("\nInformasi Karyawan 2: ");
        karyawan2.tampilkanInfo();
        
    }
    
}
