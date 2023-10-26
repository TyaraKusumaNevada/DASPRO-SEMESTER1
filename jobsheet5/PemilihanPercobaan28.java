import java.util.Scanner;

public class PemilihanPercobaan28 {

    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.println("masukkan angka: ");
        int angka = input28.nextInt();

        String JenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " +angka+ " bilangan "  +JenisAngka);
    }
}