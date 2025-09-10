import java.util.Scanner;

public class Luas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;
        System.out.println(luas);
        input.close();
    }
}