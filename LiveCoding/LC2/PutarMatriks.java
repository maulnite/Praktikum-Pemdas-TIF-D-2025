package LC2;
import java.util.*;
public class PutarMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriks[i][j] = input.nextInt();
            }
        }
        int jlh = input.nextInt();
        int totalPutar = jlh % 4;
        int i = 0;
        while (i != totalPutar) {
            int[][] arr = new int[3][3];
            for (int j = 0; j < 3; j++) {
                for (int k = 0, l = 2; l >= 0 ; l--, k++) {
                    arr[j][k] = matriks[l][j];
                }
            }
            matriks = arr;
            i++;
        }
        System.out.println("Hasil Rotasi Matriks: ");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(matriks[j][k] + " ");
            }
            System.out.println();
        }
        int det = (matriks[0][0] * matriks[1][1] * matriks[2][2] +
                matriks[0][1] * matriks[1][2] * matriks[2][0] +
                matriks[0][2] * matriks[1][0] * matriks[2][1]) -
                (matriks[2][0] * matriks[1][1] * matriks[0][2] +
                matriks[2][1] * matriks[1][2] * matriks[0][0] +
                matriks[2][2] * matriks[1][0] * matriks[0][1]);
        System.out.println("Determinan = " + det);
    }
}