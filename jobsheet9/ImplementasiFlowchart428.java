import java.util.Scanner;
public class ImplementasiFlowchart428 {
    public static void main(String[] args) {
        int [] arrayBil = new int [8];
        Scanner input28 = new Scanner(System.in);
        System.out.println("Masukkan 8 bilangan bulat: ");

        for (int i=0; i<8; i++){
            System.out.println("elemen ke -" + (i +1)+" : ");
            arrayBil[i]=input28.nextInt();

        }   
        int total =0;
        for(int i=0; i<8; i++){
            total += arrayBil[i];
        }
        double Ratarata = total/8;
        System.out.println(" Rata - Rata dari seluruh elemen array adalah:" + Ratarata);
     }
}
