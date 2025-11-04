import java.util.*;

public class Prak_arr_retval {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 19, 4, 11, 3, 27, 17, 10};
        arr = sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index ke-" + (i + 1) + " : " + arr[i]);
        }
    }

    private static int[] sort(int[] acak) {
        int i = 0;
        int j = 0;

        while (i < acak.length) {
            j = i;
            while (j < acak.length) {
                if (acak[i] < acak[j]) {
                    int temp = acak[i];
                    acak[i] = acak[j];
                    acak[j] = temp;
                }
                j++;
            }
            i++;
        }

        return acak;
    }
}
