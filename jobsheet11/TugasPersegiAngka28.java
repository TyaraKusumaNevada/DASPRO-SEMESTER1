package jobsheet11;
import java.util.Scanner;
public class TugasPersegiAngka28 {
   

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = n;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1)) {
                    System.out.print(arr[i][j]);
                } else if (j == 0 || j == (n - 1)) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

