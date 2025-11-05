package LC4;

import java.util.Scanner;

public class DoctorStrangeMenara {

    public static void pindahMenara(int n, char sumber, char bantu, char tujuan) {
        if (n == 1) {
            System.out.println("Pindahkan cakram 1 dari Menara " + sumber + " ke Menara " + tujuan);
            return;
        }
        pindahMenara(n - 1, sumber, tujuan, bantu);
        System.out.println("Pindahkan cakram " + n + " dari Menara " + sumber + " ke Menara " + tujuan);
        pindahMenara(n - 1, bantu, sumber, tujuan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pindahMenara(n, 'A', 'B', 'C');
        input.close();
    }
}