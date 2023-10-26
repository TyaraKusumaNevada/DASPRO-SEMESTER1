import java.util.Scanner;
public class Segitiga28 {

    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);

        int alas, tinggi;
        double luas;

        System.out.println("\t Menghitung Luas Segitiga \n");

        System.out.println(" Inputkan Alas : ");
        alas = userInput.nextInt();

        System.out.println(" Inputkan Tinggi : ");
        tinggi = userInput.nextInt();

        luas = (alas * tinggi ) * 0.5;

        System.out.println("\n Luas Segitiga adalah: " + luas);
    }

}