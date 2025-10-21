// Nama Lengkap:
// NIM:
// * ga boleh import lagi

import java.util.Scanner;

public class BukuTamuDengklek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        int reg = 0;
        String[] regs = new String[n];
        int vip = 0;
        String[] vips = new String[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            String a = in.nextLine();
            String[] temp = a.split("-");
            String b = "";

            switch (temp[0]) {
                case "001":
                    if (temp.length > 2) {
                        for (int j = 1; j < temp.length - 1; j++) {
                            b += temp[j] + "-";
                        }
                        b += temp[temp.length - 1];
                    } else {
                        b = temp[1];
                    }
                    regs[reg] = b;
                    reg++;
                    total += 70000;
                    break;

                case "010":
                    if (temp.length > 2) {
                        for (int j = 1; j < temp.length - 1; j++) {
                            b += temp[j] + "-";
                        }
                        b += temp[temp.length - 1];
                    } else {
                        b = temp[1];
                    }
                    vips[vip] = b;
                    vip++;
                    total += 120000;
                    break;
            }
        }

        System.out.println("============= Laporan =============");
        System.out.println("Pengunjung Reguler : " + reg);
        for (int i = 0; i < regs.length; i++) {
            if (regs[i] == null)
                break;
            System.out.println((i + 1) + ". " + regs[i]);
        }

        System.out.println("Pengunjung VIP : " + vip);
        if (vip > 0) {
            for (int i = 0; i < vips.length; i++) {
                if (vips[i] == null)
                    break;
                System.out.println((i + 1) + ". " + vips[i]);
            }
        }

        System.out.println("Total Pendapatan : Rp. " + total);
        in.close();
    }
}