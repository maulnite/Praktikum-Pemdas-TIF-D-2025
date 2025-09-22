import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta input angka dari user
        int n = input.nextInt();

        // Inisialisasi nilai awal i = 0
        // looping selama nilai i <= n
        for (int i = 0; i <= n; i++) {
            // Setiap iterasi nilai i bertambah 1
            System.out.println(i);
        }

        input.close(); // menutup scanner
    }
}
