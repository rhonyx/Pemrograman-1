/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Roni Rahmawan
 */
import java.util.Scanner;


interface Pembayaran{
    boolean bayar(int jumlah);
    
    String getNamaMetodePembayaran();
}

class TapCard implements Pembayaran{
    private int saldo;
    
    TapCard(int saldo){
        this.saldo = saldo;
    }
    
    @Override
    public boolean bayar(int tarifTol){
        if(saldo >= tarifTol){
            int sisaSaldo = saldo - tarifTol;
            System.out.println("Pembayaran TapCard");
            System.out.println("Tarif Tol :" + tarifTol);
            System.out.println("Sisa Saldo : " + sisaSaldo);
            return true;
        }
        else{
            System.out.println("Saldo tidak cukup!");
            return false;
        }
    }
    
    @Override
    public String getNamaMetodePembayaran(){
        return "TapCard";
    }
}

public class Latihan3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        TapCard Kartu = new TapCard(100000);
        
        System.out.println("Masukkan Tarif Toll : ");
        int tariftol = input.nextInt();
        
        boolean berhasil = Kartu.bayar(tariftol);
        
        if(berhasil){
            System.out.println("Pembayaran Berhasil");
        }
        else{
            System.out.println("Pembayaran Gagal");
        }
        input.close();
    }
}
