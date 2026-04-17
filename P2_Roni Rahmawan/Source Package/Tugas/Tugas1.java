import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1; 
        int angka2;
        int hasil;
        System.out.println("Masukkan angka ke-1 :");
        angka1 = input.nextInt();
        System.out.println("masukkan angka ke-2 :");
        angka2 = input.nextInt();
        hasil = angka1+angka2;
        System.out.println("Penjumlahan dari "+ angka1 + "+" + angka2 + "=" + hasil);

    }
    
}
