/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Roni Rahmawan
 */
interface Pembayaran{
    int CekSaldo();
    void Bayar(int tarif);
}

class Kartu implements Pembayaran{
    int saldo;
    
    public Kartu (int saldo){
        this.saldo = saldo;
    }
    
    public int CekSaldo(){
        return saldo;
    }
    
    public void Bayar(int tarif){
        saldo -= tarif;
    }
}

public class Latihan2 {
    public static void main(String [] args){
        
        Pembayaran tapcard = new Kartu(100000);
        int tarif = 20000;
        
        System.out.println("Saldo : " + tapcard.CekSaldo());
        tapcard.Bayar(tarif);
        System.out.println("Tarif Toll : " + tarif);
        System.out.println("Sisa Saldo : " + tapcard.CekSaldo());
    }
}
