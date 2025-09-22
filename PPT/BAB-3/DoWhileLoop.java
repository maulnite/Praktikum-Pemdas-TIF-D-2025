import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);
        int angka;

        // Perulangan minimal sekali
        do {
            System.out.print("Masukkan angka antara 1–10: ");
            angka = input.nextInt();

            // Jika input salah, loop akan mengulang
        } while (angka < 1 || angka > 10);

        // Jika input benar, tampilkan angka
        System.out.println("Angka valid: " + angka);

        input.close();
    }
}
