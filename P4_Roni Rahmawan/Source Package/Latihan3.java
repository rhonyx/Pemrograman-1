import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float makan, transport, belanja;
        float total, diskon, totalbayar;

        System.out.println("Masukkan biaya makan :");
        makan = input.nextFloat();
        System.out.println("Masukkan biaya transport :");
        transport = input.nextFloat();
        System.out.println("Masukkan biaya belanja :");
        belanja = input.nextFloat();

        total = makan+transport+belanja;
        diskon = total*10/100;
        totalbayar = total-diskon;

        System.out.println("Total pengeluaran sebelum diskon :  Rp." + total);
        System.out.println("Total diskon yg didapat          :  Rp." + diskon);
        System.out.println("Total pengeluaran setelah diskon :  Rp." + totalbayar);
    }
}
