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
public class Latihan3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        String nama_barang;
        int harga, jumlah;
        int member;
        int total;
        double diskon;
        
        System.out.print("Nama Barang : ");
        nama_barang = input.nextLine();

        System.out.print("Harga Barang : ");
        harga = input.nextInt();

        System.out.print("Jumlah Beli : ");
        jumlah = input.nextInt();

        System.out.print("Apakah Member? (1 = Ya, 0 = Tidak): ");
        member = input.nextInt();
        
        total = harga*jumlah;
        diskon = 0;
        
        if (total >= 100000) {
            diskon = 0.10;
        } else if (total >= 50000) {
            diskon = 0.5;
        }
        
        if (member == 1) {
            diskon += 0.5;
        }
        double potongan = total * diskon;
        double total_bayar = total - potongan;

        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Barang       : " + nama_barang);
        System.out.println("Total Harga  : " + total);
        System.out.println("Diskon       : " + (diskon * 100) + "%");
        System.out.println("Total Bayar  : " + total_bayar);

        input.close();
    }
}
