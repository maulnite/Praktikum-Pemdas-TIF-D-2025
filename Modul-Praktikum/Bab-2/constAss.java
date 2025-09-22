import java.util.Scanner;

public class constAss {
    public static void main(String[] args) {
        String s = "filkom";
        String val = (s == "filkom") ? "Brawijaya" : "null";
        System.out.println(s + " " + val);
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = inp.nextLine();
        System.out.print("Masukkan password: ");
        String password = inp.nextLine();

        System.out.print("Masukkan konfirmasi nama: ");
        String confirmation_name = inp.nextLine();
        System.out.print("Masukkan konfirmasi password: ");
        String confirmation_password = inp.nextLine();

        if(name.equalsIgnoreCase(confirmation_name) && password.equals(confirmation_password)) {
            System.out.println("Selamat datang di Universitas Brawijaya");
        } else {
            System.out.println("Nama atau password tidak sesuai");
        }

    }
}
