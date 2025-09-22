import java.util.Scanner;

public class Seleksi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();
        if (nilai * 2 < 50) {
            nilai += 10;
        }
        if (nilai <= 20 && nilai % 2 !=0) {
            System.out.println("Filkom UB");
        }
        else if (nilai <= 20 && nilai % 2 == 0){
            System.out.println("FILKOM Brawijaya");
        }
        else if (nilai % 2 != 0) {
            System.out.println("PTIIK UB");
        }
        else {
            System.out.println("PTIIK Brawijaya");
        }
        in.close();
    }
}
