package LC4;

import java.util.Scanner;

public class FibonacciWar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = input.nextInt();
        int arr[] = new int[jlh];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            boolean fibo = false;
            for (int j = 0; j <= arr[i]; j++) {
                int a = fibonacci(j);
                if (a == arr[i]) {
                    fibo = true;
                    break;
                }
            }
            if (cekPrima(arr[i]) && fibo) {
                sum += arr[i];
            }
        }
        int darahMonster = input.nextInt();
        if (darahMonster > sum) {
            System.out.println("Monster menang!");
            System.out.println("Darah Monster: " + darahMonster);
            System.out.println("Total Power Valid: " + sum);
        } else if (darahMonster < sum) {
            System.out.println("Player menang!");
            System.out.println("Darah Monster: " + darahMonster);
            System.out.println("Total Power Valid: " + sum);
        } else {
            System.out.println("Draw!");
            System.out.println("Darah Monster: " + darahMonster);
            System.out.println("Total Power Valid: " + sum);
        }

    }

    static boolean cekPrima(int a) {
        if (a < 2)
            return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
