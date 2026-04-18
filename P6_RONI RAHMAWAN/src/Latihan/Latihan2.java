/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Roni Rahmawan
 */
public class Latihan2 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int tipe_villa;
        int hari;
        int harga_permalam;
        String nama_villa;
        int no_kamar;
        
        System.out.print("Pilih tipe villa : (1.Standar,2.Premium,3.PVP): ");
        tipe_villa = input.nextInt();
        
        System.out.print("Lama menginap : ");
        hari = input.nextInt();
        
        if(tipe_villa == 1){
               nama_villa = "Standar Vill";
               harga_permalam = 300000;
               no_kamar = rand.nextInt(5)+1;
        }else if(tipe_villa == 2){
            nama_villa = "Premium Vill";
            harga_permalam = 500000;
            no_kamar = rand.nextInt(5)+6;
        }else if(tipe_villa == 3){
            nama_villa = "PVP Vill";
            harga_permalam = 1000000;
            no_kamar = rand.nextInt(5)+11;
        }else{
            System.out.print("Tipe Villa Tidak Tersedia");
            return;
        }
        
        int total = hari * harga_permalam;
        
        System.out.println("------------------------------");
        System.out.println("Villa yg dipesan    : "+ nama_villa);
        System.out.println("Lama menginap       : "+ hari+" Hari");
        System.out.println("Harga               : "+"Rp."+ total);
        System.out.println("Nomer Kamar         : "+no_kamar);
        
        input.close();
    }
    

    
}
