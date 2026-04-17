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
public class Latihan2 {
    public static void main(String args []){
        Scanner input = new Scanner (System.in);
        
        int total_pertemuan = 21;
        int nilai_akhir;
        int kode_etik;

        System.out.println("Masukkan kehadiran : ");
        int hadir = input.nextInt();

        System.out.println("Masukkan nilai akhir : ");
        nilai_akhir = input.nextInt();
        
        System.out.print("Apakah pernah melanggar kode etik ? (1 = Ya, 0 = Tidak) : ");
        kode_etik = input.nextInt();

        int kehadiran = (hadir * 100 / total_pertemuan);

        if (nilai_akhir >= 80 && kehadiran >= 75) {
            if (kode_etik == 1){
                System.out.println("Nilai : "+ nilai_akhir);
                System.out.println("Grade A-");
            } else {
                System.out.println("Nilai : "+ nilai_akhir);
                System.out.println("Grade A");
            }
        } else if (nilai_akhir >= 70) {
            System.out.println ("Nilai : "+ nilai_akhir);
            System.out.println("Grade B");
        } else if (nilai_akhir >= 60) {
            System.out.println("Nilai :"+ nilai_akhir);
            System.out.println("Grade C");
        } else if (nilai_akhir >= 50) {
            System.out.println("Nilai :"+ nilai_akhir);
            System.out.println("Grade D");
        } else {
            System.out.println("Nilai :"+ nilai_akhir);
            System.out.println("Grade E");
        }

        input.close();
    }
}
