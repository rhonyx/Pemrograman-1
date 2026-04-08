import java.util.Scanner;
public class Latihan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        System.out.println("Masukkan realisasi :");
        realisasi = input.nextFloat();
        System.out.println("Masukkan kehadiran :");
        kehadiran = input.nextFloat();
        System.out.println("Masukkan tugas :");
        tugas = input.nextFloat();
        System.out.println("Masukkan uts :");
        uts = input.nextFloat();
        System.out.println("Masukkan uas :");
        uas = input.nextFloat();

        b_kehadiran = kehadiran/realisasi*10;
        b_tugas = tugas*20/100;
        b_uts = uts*30/100;
        b_uas = uas*40/100;

        total = b_kehadiran+b_tugas+b_uts+b_uas;

        System.out.println("PENILAIAN AKHIR MAHASISWA");
        System.out.println("Realisasi Pertemuan :" + realisasi);
        System.out.println("Kehadiran :" + kehadiran);
        System.out.println("Nilai tugas :" +tugas);
        System.out.println("Nilai uts :" + uts);
        System.out.println("Nilai uas :" + uas);
        System.out.println("Nilai akhir : " + total);

        input.close();

    }
}