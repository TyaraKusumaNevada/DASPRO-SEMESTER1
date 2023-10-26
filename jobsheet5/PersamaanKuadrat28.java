import java.util.Scanner;
public class PersamaanKuadrat28{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        double D, x, x1, x2;
        System.out.println("Masukkan nilai a:  ");
         a = input.nextInt();
         System.out.println("Masukkan nilai b:  ");
         b = input.nextInt();
         System.out.println("Masukkan nilai c:  ");
         c = input.nextInt();

         D = (b*b)- (4*a*c);
        System.out.print(" Diskriminan: " +D);
         if (D ==0){
            x= -c / b;
           System.out.print(" hasilnya adalah Akar tunggal "+x);

         }else if (D < 0){
            System.out.print(" hasilnya adalah Akar imajiner ");

         }else {
                 x1 = -b + Math.sqrt(D) /(2*a);
                 x2 = -b - Math.sqrt(D)/(2*a);
                System.out.print(" hasilnya adalah akar 1: " +x1 );
                System.out.print(" hasilnya adalah akar 2: " +x2);

            }
    }
}