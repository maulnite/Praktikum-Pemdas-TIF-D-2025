import java.util.Scanner;
public class ForLoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = input.nextInt();
        int[] arr = new int[jlh];
        for (int i = 0; i < jlh; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Isi array yang dimasukkan: ");
        for (int i = 0; i < jlh; i++) {
            System.out.println("arrInt[" + i + "] = " + arr[i]);
        }

    }
}
