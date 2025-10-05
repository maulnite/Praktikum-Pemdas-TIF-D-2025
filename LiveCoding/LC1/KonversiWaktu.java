package LC1;

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = input.nextInt();

        if (totalDetik < 0) {
            System.out.println("Input tidak boleh negatif");
        } else {
            int jam = totalDetik / 3600;
            int sisaDetik = totalDetik % 3600;
            int menit = sisaDetik / 60;
            int detik = sisaDetik % 60;

            System.out.println("Hasil konversi: " + jam + " jam " + menit + " menit " + detik + " detik");
        }

        input.close();
    }
}