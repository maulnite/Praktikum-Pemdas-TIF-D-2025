import java.util.*;
public class NestedLoopArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nilai1 = new int[3][3];
        // menggunakan for untuk mengisi array 2 dimensi
        for (int i = 0; i < nilai1.length; i++) {
            for (int j = 0; j < nilai1[i].length; j++) {
                nilai1[i][j] = in.nextInt();
            }
        }

        // menggunakan for untuk menampilkan array 2 dimensi
        for (int i = 0; i < nilai1.length; i++) {
            for (int j = 0; j < nilai1[i].length; j++) {
                System.out.print(nilai1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
