import java.util.Scanner;

public class ValidasiSudoku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] tes = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[][] m = new int[9][9];
        int h = 0, w = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                m[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 9; i++) {
            boolean[] valid = new boolean[9];
            boolean[] valid2 = new boolean[9];
            for (int j = 0; j < 9; j++) {
                int n = m[i][j];
                int n2 = m[j][i];
                for (int k = 0; k < 9; k++) {
                    if (n == tes[k] - 1)
                        valid[tes[k] - 1] = true;
                    if (n2 == tes[k] - 1)
                        valid2[tes[k] - 1] = true;
                }
            }
            if (valid[i] && valid2[i])
                h++;
        }
        if (h == 9 && w == 9)
            System.out.println("VALID");
        else
            System.out.println("TIDAK VALID");

        in.close();
    }
}