package LC3;
import java.util.Scanner;
public class Kandang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = input.nextInt();
        int[] kandang = new int[jlh];
        input.nextLine();
        for (int i = 0; i < jlh; i++) {
            String a = input.nextLine();
            String[] temp = a.split("x");
            kandang[i] = Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
        }
        int target = input.nextInt();
        int luasHewan = input.nextInt();
        System.out.println("Kandang yang memenuhi: ");
        for (int i = 0; i < jlh; i++) {
            if (kandang[i] > target) {
                System.out.print("Kandang ke- " + i);
                System.out.print("\nLuas Kandang: " + kandang[i]);
                System.out.print("\nJumlah Hewan: " + kandang[i]/luasHewan);
                System.out.println("\n------------------------------");
            }
        }
    }
}
