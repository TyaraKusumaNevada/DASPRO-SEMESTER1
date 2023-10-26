import java.util.Scanner;
public class HargaBayar28 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int harga, jumlah, JmlHalBuku;
        double Diskon, total, bayar, jmlDis;
        String MerkBuku;

        System.out.println("masukkan jumlah diskon");
        Diskon=input.nextDouble();
        System.out.println("Masukkan merk buku");
        MerkBuku=input.next();
        System.out.println("Masukkan jumlah halaman buku");
        JmlHalBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah jumlah barang yang dibeli");
        jumlah=input.nextInt();
        total=harga*jumlah;
        jmlDis=total*Diskon;
        bayar=total-jmlDis;
        System.out.println("diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah" +bayar);
      }
}