import java.util.*;
public class Labirin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] labirin = new char[n][n];
        int start1 = scanner.nextInt();
        int start2 = scanner.nextInt();
        int finish1 = scanner.nextInt();
        int finish2 = scanner.nextInt();
        scanner.nextLine();
        String barier = scanner.nextLine();
        String[] tembok = barier.split(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                labirin[i][j] = '.';
            }
        }
        labirin[start1][start2] = 'S';
        labirin[finish1][finish2] = 'F';
        for (int i = 0; i < tembok.length; i++) {
            String[] temp = tembok[i].split(",");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);
            labirin[x][y] = 'T';
        }
        System.out.println("Labirin Awal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(labirin[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int x = start1;
        int y = start2;

        int jlhOps = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < jlhOps; i++) {
            String ops = scanner.next();
            labirin[x][y] = '.';
            switch (ops) {
                case "W":
                    if (x - 1 < 0 || labirin[x-1][y] == 'T') {
                        System.out.println("Invalid Move!");
                    } else {
                        x--;
                    }
                    break;
                case "A":
                    if (y - 1 < 0 || labirin[x][y-1] == 'T') {
                        System.out.println("Invalid Move!");
                    } else {
                        y--;
                    }
                    break;
                case "S":
                    if (x + 1 >= n || labirin[x + 1][y] == 'T') {
                        System.out.println("Invalid Move!");
                    } else {
                        x++;
                    }
                    break;
                case "D":
                    if (y + 1 >= n || labirin[x][y + 1] == 'T') {
                        System.out.println("Invalid Move!");
                    } else {
                        y++;
                    }
                    break;
                default:
                    System.out.println("Input tidak valid!");
                    continue;
            }
            if(x == finish1 && y == finish2){
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (j == x && k == y) labirin[j][k] = 'P';
                        System.out.print(labirin[j][k]);
                    }
                    System.out.println();
                }
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
            System.out.println();
        }
        System.out.println("Kamu terjebak dalam labirin!");
    }
}