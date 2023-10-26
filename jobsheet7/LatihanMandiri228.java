import java.util.Scanner;
public class LatihanMandiri228{
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int jumlahMahasiswa= 30, jumlahPerempuan=0 ;
        char jenisKelamin;
        String nama;

        System.out.println(" Masukkan nama dan jenis kelamim Mahasiswa: ");
        while ( jumlahPerempuan< jumlahMahasiswa){
            System.out.print("Nama Mahasiswa:  ");
            nama= input28.nextLine();

            System.out.print(" Jenis Kelamin (L/P):  ");
            jenisKelamin= input28.nextLine().charAt(0);

            if (jenisKelamin == 'P' || jenisKelamin=='p') {
            System.out.println(" Mahasiswa Perempuan: " +nama);
            jumlahPerempuan++;
           }  
    }
}
}