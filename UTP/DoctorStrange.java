import java.util.Scanner;

public class DoctorStrange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] energi = new int[n];

        for (int i = 0; i < n; i++) {
            energi[i] = input.nextInt();
        }

        int maxSum = energi[0];
        int currentSum = energi[0];
        int tempStart = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < n; i++) {
            if (currentSum < 0) {
                currentSum = energi[i];
                tempStart = i;
            } else {
                currentSum += energi[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestStart = tempStart;
                bestEnd = i;
            } else if (currentSum == maxSum) {
                int currentLength = i - tempStart;
                int bestLength = bestEnd - bestStart;
                if (currentLength < bestLength) {
                    bestStart = tempStart;
                    bestEnd = i;
                }
            }
        }

        System.out.println("Kekuatan maksimum = " + maxSum);
        System.out.print("Jalur energi = ");
        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(energi[i]);
            if (i != bestEnd)
                System.out.print(" ");
        }

        input.close();
    }
}