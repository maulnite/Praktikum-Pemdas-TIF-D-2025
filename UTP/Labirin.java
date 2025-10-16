import java.util.*;
public class Labirin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] labirin = new char[n][n];
        System.out.print("Start: ");
        int start1 = scanner.nextInt();
        int start2 = scanner.nextInt();
        System.out.print("Finish: ");
        int finish1 = scanner.nextInt();
        int finish2 = scanner.nextInt();
        System.out.println("Labirin Awal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == start1 && j == start2) labirin[i][j] = 'S';
                else if(i == finish1 && j == finish2) labirin[i][j] = 'F';
                else labirin[i][j] = '.';
                System.out.print(labirin[i][j]);
            }
            System.out.println();
        }
        int x = start1;
        int y = start2;

        int jlhOps = scanner.nextInt();
        scanner.nextLine();
        boolean keluar = false;
        for (int i = 0; i < jlhOps; i++) {
            String ops = scanner.next();
            labirin[x][y] = '.';
            switch (ops) {
                case "W":
                    if (x - 1 < 0) {
                        System.out.println("Invalid Move! Mentok atas.");
                    } else {
                        x--;
                    }
                    break;
                case "A":
                    if (y - 1 < 0) {
                        System.out.println("Invalid Move! Mentok kiri.");
                    } else {
                        y--;
                    }
                    break;
                case "S":
                    if (x + 1 >= n) {
                        System.out.println("Invalid Move! Mentok bawah.");
                    } else {
                        x++;
                    }
                    break;
                case "D":
                    if (y + 1 >= n) {
                        System.out.println("Invalid Move! Mentok kanan.");
                    } else {
                        y++;
                    }
                    break;
                default:
                    System.out.println("Input tidak valid!");
                    continue;
            }
            if(x == finish1 && y == finish2){
                System.out.println("Selamat Kamu Berhasil Keluar!!");
                return;
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j == x && k == y) labirin[j][k] = 'P';
                    System.out.print(labirin[j][k]);
                }
                System.out.println();
            }
        }

        System.out.println("Kamu terjebak dalam labirin!");
        System.out.println("Labirin Akhir:");
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(labirin[j][k]);
            }
            System.out.println();
        }

    }
}