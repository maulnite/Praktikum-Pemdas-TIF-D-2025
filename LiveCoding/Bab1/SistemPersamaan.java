package Bab1;
import java.util.Scanner;
public class SistemPersamaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double diskriminan = Math.pow(b,2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
        double x2 = (-b - Math.sqrt(diskriminan)) / (2 * a);

        System.out.printf("%dx^2 %+2dx %+d = 0\n", a, b, c);
        if(diskriminan >= 0 && a!= 0 && b != 0 && c != 0) {
            System.out.printf("x1 = %.2f x2 = %.2f\n", x1, x2);
        }
        else {
            System.out.println("Nilai x1 dan x2 tidak terdefinisi");
        }
    }
}
