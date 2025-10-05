package LC2;

import java.util.Scanner;

public class NaikTurun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        if (n < 3) {
            System.out.println("Bukan pola naik turun");
            input.close();
            return;
        }

        boolean naik = true;
        boolean valid = true;
        boolean pernahNaik = false;
        boolean pernahTurun = false;

        for (int i = 1; i < array.length; i++) {
            if (naik) {
                if (array[i] > array[i - 1]) {
                    pernahNaik = true;
                } else if (array[i] < array[i - 1]) {
                    naik = false;
                    pernahTurun = true;
                } else {
                    valid = false;
                    break;
                }
            } else {
                if (array[i] >= array[i - 1]) {
                    valid = false;
                    break;
                }
            }
        }

        if (valid && pernahNaik && pernahTurun) {
            System.out.println("Pola naik-turun");
        } else {
            System.out.println("Bukan pola naik turun");
        }

        input.close();
    }
}
