/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
import java.util.Scanner;

/**
 *
 * @author Roni Rahmawan
 */
public class Latihan1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int angka1;
        int angka2;
        
        System.out.println("Masukkan angka ke-1 : ");
        angka1 = input.nextInt();
        
        System.out.println("Masukkan angka ke-2 : ");
        angka2 = input.nextInt();
        
        int hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan dari :"
                + "" + angka1 + 
                "+" + angka2 + 
                "=" + hasil);
        
        
                
                
    }
}
