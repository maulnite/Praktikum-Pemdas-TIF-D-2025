import java.util.*;

public class Array2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String nama[] = new String[10];
        int[][] coba = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 } };
        double[][] bank = new double[2][3];

        System.out.println(" i  j coba[i][j]");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d %2d %3d\n", i, j, coba[i][j]);
            }
        }

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 3; j++) {
                bank[i][j] = i * 0.5 + j * 0.25;
            }
        }

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(bank[i][j] + " ");
            }
        }
        int jumlah = 0;
        int a = 0;
        for (int i = 0; i < coba.length; i++) {
            for (int j = 0; j < coba[i].length; j++) {
                jumlah += coba[i][j];
                a += 1;
            }
        }
        double nilaiRata2 = (double) jumlah / a;
        System.out.println("\n" + nilaiRata2);

        int min = coba[0][0];
        int max = coba[0][0];

        for (int i = 0; i < coba.length; i++) {
            for (int j = 0; j < coba[i].length; j++) {
                min = coba[i][j] < min ? coba[i][j] : min;
                max = coba[i][j] > max ? coba[i][j] : max;
            }
        }

        System.out.println("\nMin : " + min);
        System.out.println("Max : " + max);
    }
}
