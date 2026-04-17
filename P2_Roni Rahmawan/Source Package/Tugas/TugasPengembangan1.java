import java.util.Scanner;

public class TugasPengembangan1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        int angka1, angka2, hasil;
        int menu;

        System.out.println("KALKULATOR");
        System.out.println("1.PENJUMLAHAN");
        System.out.println("2.PENGURANGAN");
        System.out.println("PILIH MENU (1/2) :");

        menu = iScanner.nextInt();

        System.out.println("Masukkan angka ke-1 :");
        angka1 = iScanner.nextInt();

        System.out.println("Masukkan angka ke-2 :");
        angka2 = iScanner.nextInt();

        switch (menu) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan dari "+ angka1 +"+"+ angka2 +"="+ hasil);
                break;

            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan dari "+ angka1 +"-"+ angka2 +"="+ hasil);
                break;

            default:
                System.out.println("Menu yg dipilih tidak valid");
        }
        iScanner.close();
    }
}