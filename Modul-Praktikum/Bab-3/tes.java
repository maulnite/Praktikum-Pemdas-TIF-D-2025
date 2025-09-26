import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input n :");
        int n = n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i >= j) {
                    System.out.print(" *");}
                else{System.out.print("  ");
                    }
                }

                System.out.println();
            }
        }
    }
