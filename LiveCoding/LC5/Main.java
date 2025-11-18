package LC5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Avenger[] arr = new Avenger[n];

        for (int i = 0; i < n; i++) {
            String nama = sc.next();
            String kode = sc.next();
            int c = sc.nextInt();
            int t = sc.nextInt();
            int f = sc.nextInt();
            arr[i] = new Avenger(nama, kode, c, t, f);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Nama: " + arr[i].nama);
            System.out.println("Kode: " + arr[i].kode);
            System.out.printf("Power Rating: %.2f\n", arr[i].hitungPowerRating());
            System.out.println("Rank: " + arr[i].getRank());
        }

        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i].hitungPowerRating() > arr[idx].hitungPowerRating()) {
                idx = i;
            }
        }

        System.out.printf("Avenger terkuat: %s (%s) - %.2f", arr[idx].nama, arr[idx].kode,
                arr[idx].hitungPowerRating());

        sc.close();
    }
}