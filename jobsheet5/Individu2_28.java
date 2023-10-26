import java.util.Scanner;
public class Individu2_28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner (System.in);
        String username, password, usernameBenar, passwordBenar;
        usernameBenar = "Neva";
        passwordBenar = "1234";


        System.out.println("Masukkan username: ");
        username = input28.nextLine();
        System.out.println("Masukkan password: ");
        password = input28.nextLine();

        if (username.equals(usernameBenar) && password.equals(passwordBenar) ) {
            System.out.println("Selamat datang di Neva");
        } else {
            System.out.println("Username atau password salah");
        }
    }
}