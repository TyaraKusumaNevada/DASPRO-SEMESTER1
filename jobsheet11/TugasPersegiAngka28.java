package jobsheet11;
import java.util.Scanner;
public class TugasPersegiAngka28 {
   

    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        System.out.print("Masukkan N = ");
        int n = sc28.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    arr[i][j] = 5;
                } else if (i == j || i+j == n-1) {
                    arr[i][j] = 3;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

