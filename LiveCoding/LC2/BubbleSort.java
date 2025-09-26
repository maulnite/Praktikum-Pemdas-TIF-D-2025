package LC2;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = input.nextInt();
        int[] array = new int[jlh];
        for (int i = 0; i < jlh; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < jlh; i++) {
            for (int j = 0; j < jlh - 1 - i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        int jlhGanjil = 0, jlhGenap = 0;
        double rata = 0;
        int total = 0;
        int idx1 = 0;
        int idx2 = 0;
        System.out.println("Array setelah diurutkan: ");
        for (int i = 0; i < jlh; i++) {
            System.out.print(array[i] + " ");
            total += array[i];
            if(array[i] % 2 != 0) {
                jlhGanjil++;
            }
            if(array[i] % 2 == 0) {
                jlhGenap++;
            }
        }
        int[] ganjil = new int[jlhGanjil];
        int[] genap = new int[jlhGenap];
        int tot1 = 0;
        int tot2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                ganjil[idx1++] = array[i];
                tot1 += array[i];
            }
            if(array[i] % 2 == 0) {
                genap[idx2++] = array[i];
                tot2 += array[i];
            }
        }
        rata = (double) total / array.length;
        System.out.println("\nData ganjil: ");
        for (int i = 0; i < ganjil.length; i++) {
            System.out.print(ganjil[i] + " ");
        }
        System.out.println("\nJumlah Ganjil: "+ jlhGanjil);
        System.out.println("Total Ganjil: "+ tot1);
        System.out.println("Data genap: ");
        for (int i = 0; i < genap.length; i++) {
            System.out.print(genap[i] + " ");
        }
        System.out.println("\nJumlah Genap: "+ jlhGenap);
        System.out.println("Total Genap: "+ tot2);
        System.out.printf("Rata: %.2f\n", rata);
    }
}