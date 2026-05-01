/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Roni Rahmawan
 */
abstract class Kendaraan{
    String tipe;
    
    public Kendaraan(String tipe){
        this.tipe = tipe;
    }
    public void info(){
        System.out.print("Tipe Kendaraan : " + tipe);
    }
    public abstract int tarif();
}

class Golongan_I extends Kendaraan{
    public Golongan_I(String tipe){
        super(tipe);
    }
    @Override
    public int tarif(){
        return 15000;
    }
}

class Golongan_II extends Kendaraan{
    public Golongan_II(String tipe){
        super(tipe);
    }
    @Override
    public int tarif(){
        return 25000;
    }
}
        
public class Latihan1 {
    public static void main(String [] args){
        Kendaraan G1 = new Golongan_I("SEDAN :Rp.");
        Kendaraan G2 = new Golongan_II("TRUCK :Rp.");
        
        G1.info();
        System.out.println(G1.tarif());
        
        G2.info();
        System.out.println(G1.tarif());
    }
}
