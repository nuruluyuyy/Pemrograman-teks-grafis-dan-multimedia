/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab5soal2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Bab5soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("### Operator Mencari Luas Segitiga ###m ");
        System.out.println("Masukkan nilai alas : ");
        double alas = scanner.nextDouble();
        System.out.println("Masukkan nilai tinggi : ");
        double tinggi = scanner.nextDouble();
        
        double luas = (alas * tinggi)/2;
        
        System.out.println("Luas Segitiga : " + luas);
        
        //Menutup scanner
        scanner.close();
        }
    }
    

