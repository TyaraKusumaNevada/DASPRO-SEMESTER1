import java.util.Scanner;
public class ImplementasiFlowchart328{
    public static void main(String[] args) {
    String[] namaBulan={"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
    Scanner input28 = new Scanner(System.in);
    System.out.println("Masukkan angka antara 1-12:  ");
    int angkaBulan = input28.nextInt();

if (angkaBulan>=1 && angkaBulan<= 12) {
    String nama = namaBulan[angkaBulan-1];
    System.out.println("Bulan ke- " +angkaBulan+ " Adalah " +nama);
} else {
    System.out.println("Angka yang di masukkan tidak valid. Masukkan angka antara 1-12. ");
}
    }
}
