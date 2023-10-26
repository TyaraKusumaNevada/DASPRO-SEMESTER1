import java.util.Scanner;

public class Pemilihan2Percobaan228 {

    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalsudut;

        System.out.println("Masukkan sudut 1: ");
        sudut1 = input28.nextFloat();
        System.out.println("Masukkan sudut 2: ");
        sudut2 = input28.nextFloat();
        System.out.println("Masukkan sudut 3: ");
        sudut3 = input28.nextFloat();
        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if (sudut1 == sudut2 && sudut2 == sudut3) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut3 == sudut1) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}
