package jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            int choice = input28.nextInt();
            input28.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Masukkan nama: ");
                    nama = input28.nextLine();
                   boolean seatNotAvailable = true; 
            
                 while (seatNotAvailable) {
                    System.out.println("Masukkan baris: ");
                    baris = input28.nextInt();
                    System.out.println("Masukkan kolom: ");
                    kolom = input28.nextInt();
                    input28.nextLine();
            
                    if (isValidSeat(baris, kolom, penonton)) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan.");
                        seatNotAvailable = false;
                    } else {
                        System.out.println("Maaf, kursi sudah terisi atau tidak valid. Silakan pilih kursi lain.");
                    }
                 }
                 break;
            
            
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }

            System.out.print("Lanjutkan? (y/n): ");
            next = input28.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    boolean isValidSeat(int baris, int kolom, String[][] penonton) {
        return baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2 && penonton[baris - 1][kolom - 1] == null;
    }
}
