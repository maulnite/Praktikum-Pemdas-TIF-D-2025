package LC1;

import java.util.Scanner;

public class JenisSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi a: ");
        int a = input.nextInt();
        System.out.print("Masukkan sisi b: ");
        int b = input.nextInt();
        System.out.print("Masukkan sisi c: ");
        int c = input.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Sisi tidak valid");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Bukan segitiga");
        } else if (a == b && b == c) {
            System.out.println("Segitiga Sama Sisi");
        } else if (a == b || a == c || b == c) {
            System.out.println("Segitiga Sama Kaki");
        } else if ((a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a)) {
            System.out.println("Segitiga Siku-siku");
        } else {
            System.out.println("Segitiga Sembarang");
        }

        input.close();
    }
}