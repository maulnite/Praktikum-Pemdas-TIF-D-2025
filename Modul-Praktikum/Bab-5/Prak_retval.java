import java.util.Scanner;

public class Prak_retval {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Program Pendataan Mahasiswa\n");

        String nim1, nama1, jur1;
        String nim2, nama2, jur2;

        System.out.print("Masukkan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();

        System.out.print("Masukkan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();

        System.out.print("Masukkan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();

        System.out.print("Masukkan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();

        System.out.print("Masukkan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();

        System.out.print("Masukkan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();

        System.out.println("\nData Mahasiswa:");
        System.out.println(showData(nim1, nama1, jur1));
        System.out.println(showData(nim2, nama2, jur2));
    }

    private static String showData(String nim, String nama, String jurusan) {
        String show = "\nNIM : " + nim + "\nNama : " + nama + "\nJurusan : " + jurusan;
        return show;
    }
}
