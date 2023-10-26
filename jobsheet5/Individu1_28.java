import java.util.Scanner;

public class Individu1_28 {

    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int jarakMusuh = 0;
        boolean jarakDekat = false, jarakJauh = false;

        System.out.println("Masukkan jarak musuh: ");
        jarakMusuh = input28.nextInt();

        if (jarakMusuh <= 5 && jarakMusuh >= 0) {
            System.out.println("Musuh berada pada jarak yang dekat, sehingga mendapatkan senjata Melee Weapon");
        } else if (jarakMusuh >= 5) {
            System.out.println("Musuh berada pada jarak yang jauh, sehingga mendapatkan senjata Ranged Weapon");
        } else {
            System.out.println("Masukkan value yang benar!");
        }
    }
    
}