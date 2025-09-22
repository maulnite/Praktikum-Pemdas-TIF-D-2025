import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Meminta input pertama kali
        System.out.print("Masukkan angka antara 1–10: ");
        int angka = input.nextInt();

        // Ulangi jika angka tidak valid
        while (angka < 1 || angka > 10) {
            System.out.println("Input salah, coba lagi!");
            System.out.print("Masukkan angka antara 1–10: ");
            angka = input.nextInt();
        }

        // Jika valid
        System.out.println("Angka valid: " + angka);

        input.close();
    }
}
