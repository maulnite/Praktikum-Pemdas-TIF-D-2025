import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // loop tak terbatas
        while (true) {
            System.out.print("> "); // gunakan print agar prompt tetap di baris yang sama
            String input = scanner.nextLine();

            // keluar dari loop jika user mengetik 'stop'
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            // cetak input user
            System.out.println(input);
        }

        // pesan setelah keluar loop
        System.out.println("Program berhenti.");

        scanner.close();
    }
}
