package jobsheet10;
import java.util.Scanner;
public class BioskopWithScanner28 {
    public static void main(String[] args) {

        Scanner input28 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];


        while (true) {
            System.out.println("masukkan nama: ");
            nama = input28.nextLine();
            System.out.println("masukkan baris");
            baris = input28.nextInt();
            System.out.println("masukkan kolom");
            kolom = input28.nextInt();
            input28.nextLine();
            
            penonton[baris -1][kolom-1]= nama;

            System.out.println("input penonton lainnya? (y/n): ");
            next = input28.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    
}
