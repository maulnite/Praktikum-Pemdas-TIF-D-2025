package LC3;

import java.util.Scanner;

public class SaringanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int elemenTersering = arr[0];
        int frekuensiTertinggi = 1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > frekuensiTertinggi) {
                frekuensiTertinggi = count;
                elemenTersering = arr[i];
            } else if (count == frekuensiTertinggi && arr[i] < elemenTersering) {
                elemenTersering = arr[i];
            }
        }

        System.out.println("Elemen tersering: " + elemenTersering);
        System.out.println("Frekuensi: " + frekuensiTertinggi + " kali");

        input.close();
    }
}