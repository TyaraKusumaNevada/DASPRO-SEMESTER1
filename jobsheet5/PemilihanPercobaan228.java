import java.util.Scanner;
public class PemilihanPercobaan228 {

    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.println("Nilai uas:");
        float uas = input28.nextFloat();
        System.out.println("Nilai uts:");
        float uts = input28.nextFloat();
        System.out.println("Nilai kuis:");
        float kuis = input28.nextFloat();
        System.out.println("Nilai tugas:");
        float tugas = input28.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String nilaiHuruf;
        String kualifikasi;
        String nilaisetara;

        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
            nilaisetara = "4";
            kualifikasi = "Sangat baik";
            
        } else if ( total > 73 && total <= 80) {
            nilaiHuruf = "B+";
            nilaisetara = "3,5";
            kualifikasi = "Lebih dari baik";
        }else if (total > 65 && total <= 73) {
            nilaiHuruf = "B";
            nilaisetara = "3";
            kualifikasi= "Baik";
        } else if (total > 60 && total <= 65) {
            nilaiHuruf = "C+";
            nilaisetara = "2,5";
            kualifikasi = "Lebih dari cukup";
        }else if (total > 50 && total <= 60) {
            nilaiHuruf = "C";
            nilaisetara = "2";
            kualifikasi = "Cukup";
        } else if (total > 39 && total <= 50) {
            nilaiHuruf = "D";
            nilaisetara = "1,5";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaisetara ="1";
            kualifikasi = "Gagal";
        }

        

        System.out.println("Nilai huruf: " + nilaiHuruf + " - jumlah total " + total + " - setara "+ nilaisetara +" Kualifikasi: " + kualifikasi);
        
    }
}