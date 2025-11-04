import java.sql.SQLOutput;
import java.util.Scanner;

public class Prak_Void {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 3;

        do {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    volPrismaSegitiga();
                    break;
                case 2:
                    volBalok();
                    break;
                case 3:
                    System.out.println("Keluar dari program...");
                    break;
            }
        } while (pilih != 3);
    }

    private static void volPrismaSegitiga() {
        Scanner in = new Scanner(System.in);

        double a, b, c, s, luas, keliling;
        System.out.print("Masukkan Nilai Sisi A : ");
        a = in.nextInt();
        System.out.print("Masukkan Nilai Sisi B : ");
        b = in.nextInt();
        System.out.print("Masukkan Nilai Sisi C : ");
        c = in.nextInt();

        keliling = a+b+c;
        s = keliling/2;
        luas = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("Keliling segitiga: %.2f\n", keliling);
        System.out.printf("Luas segitiga: %.2f\n", luas);
    }

    private static void volBalok() {
        Scanner in = new Scanner(System.in);
        double sisiA, sisiB;
        float sisiMiring, luas, kel;

        System.out.print("Masukkan panjang sisiA : ");
        sisiA = in.nextDouble();
        System.out.print("Masukkan tinggi : ");
        sisiB = in.nextDouble();

        sisiMiring = (float)(Math.sqrt(sisiA*sisiA + sisiB*sisiB));
        luas = (float) (0.5*sisiA*sisiB);
        kel = (float)(sisiA+sisiB+sisiMiring);

        System.out.println("Luas segitiga siku-siku : " +luas);
        System.out.println("Keliling segitiga siku-siku : " +kel);

    }
}
