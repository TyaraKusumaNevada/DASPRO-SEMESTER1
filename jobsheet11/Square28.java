package jobsheet11;
import java.util.Scanner;

public class Square28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = input28.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {

            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            
        }
    }
}


