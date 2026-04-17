public class Latihan2 {
    public static void main(String[] args) {

      float makan, transport, belanja;
      float p_makan, p_transport, p_belanja;
      float total;

      makan = 20000;
      transport = 10000;
      belanja = 50000;

      total = 20000 + 10000 + 50000;

      p_makan = makan / total * 100;
      p_transport = transport / total * 100;
      p_belanja = belanja / total * 100;

      System.out.println("HITUNG PERSENTASE");
      System.out.println("Persentase dari makan adalah :" + p_makan +"%");
      System.out.println("Persentase dari transport adalah :" + p_transport +"%");
      System.out.println("Persentase dari belanja adalah :" + p_belanja +"%");
  
    }
}
