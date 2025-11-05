package LC4;

import java.util.*;

public class War {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jlh = in.nextInt();
        int[] arr = new int[jlh];
        for (int i = 0; i < jlh; i++) {
            arr[i] = in.nextInt();
        }
        int armor = in.nextInt();
        System.out.println(damage(arr, armor));

    }

    static int damage(int[] arr, int armor) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= armor) {
                total += arr[i];
            }
        }
        return total;
    }
}
