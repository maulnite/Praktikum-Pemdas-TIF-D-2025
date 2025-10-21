import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] n = new int[3][3];
        boolean horizontal1 = false, vertical1 = false, horizontal2 = false, vertical2 = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int a = 0, b = 0, c = 0, d = 0;
            for (int j = 0; j < 3; j++) {
                if (n[i][j] == 1)
                    a++;
                else if (n[i][j] == 0)
                    c++;
                if (n[j][i] == 1)
                    b++;
                else if (n[j][i] == 0)
                    d++;
            }
            if (a == 3)
                horizontal1 = true;
            else if (c == 3)
                horizontal2 = true;
            if (b == 3)
                vertical1 = true;
            else if (d == 3)
                vertical2 = true;
        }

        if (horizontal1 || vertical1)
            System.out.println("Pemain 1 menang!");
        else if (horizontal2 || vertical2)
            System.out.println("Pemain 0 menang!");
        else
            System.out.println("Draw!");

        in.close();
    }
}
