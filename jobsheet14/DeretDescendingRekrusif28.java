package jobsheet14;

import java.util.Scanner;
public class DeretDescendingRekrusif28 {
   static void deretDescendingRekrusif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekrusif(n - 1);
        }
    }

    static void deretDescendingIteraktif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan angka: ");
        angka = sc.nextInt();

        System.out.println("Deret descending dengan Iteratif: ");
        deretDescendingIteraktif(angka);
        System.out.println();

        System.out.println("Deret descending dengan Rekrusif: ");
        deretDescendingRekrusif(angka);
        System.out.println();

        sc.close();
    }
}