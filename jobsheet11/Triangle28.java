package jobsheet11;
import java.util.Scanner;
public class Triangle28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.println("Masukkan nilai N =");
        int N = input28.nextInt();
        int i = 0;
        while (i<= N) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
                
            }

            i++;
        }
        
    }  
}
