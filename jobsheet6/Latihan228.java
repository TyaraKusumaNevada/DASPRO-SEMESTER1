import java.util.Scanner;
public class Latihan228{
public static void main(String[] args) {
    Scanner input28 = new Scanner(System.in);
    String Buku;
    int JmlBuku,diskon= 0;
    System.out.println("Masukkan Jenis buku (kamus/novel/lainya):  ");
    Buku= input28.nextLine();
    System.out.println("Masukkan jumlah buku yang di beli:  ");
    JmlBuku=input28.nextInt();
  if (Buku.equals("kamus")) {
            diskon = 10;
            if (JmlBuku > 2) {
                diskon += 2 * (JmlBuku - 2);
            }
        } else if (Buku.equals("novel")) {
            diskon = 7;
            if (JmlBuku > 3) {
                diskon += 2 * (JmlBuku - 3);
            } else {
                diskon += 1 * JmlBuku;
            }
        } else {
            if (JmlBuku > 3) {
                diskon = 5;
            }
        }
        System.out.println("Total diskon yang didapat adalah: " + diskon + "%");
    }
}