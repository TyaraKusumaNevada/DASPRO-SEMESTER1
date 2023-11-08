package jobsheet11;
import java.util.Scanner;
public class TugasSegitigaAngka28 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Mencetak leading spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print("   ");
                }

                // Mencetak angka dari 1 hingga i
                for (int j = 1; j <= i; j++) {
                    System.out.print(String.format("%3d", j));
                }

                System.out.println();
            }
        }
    }
}


