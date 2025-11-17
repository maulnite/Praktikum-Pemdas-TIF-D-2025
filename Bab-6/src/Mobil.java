import java.util.Scanner;
public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private int waktu;
    public void setNoPlat(String s) {
        noPlat = s;
    }
    public void setWarna(String s) {
        warna = s;
    }
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    public void setKecepatan(double i) {
        kecepatan = i;
    }
    public void setWaktu(int i) {
        waktu = i*3600;
    }
    public void ubahKecepatan(){
        kecepatan *= 1000.0/3600;
    }
    public void hitungJarak(){
        double jarak = kecepatan * waktu;
        System.out.println("Jarak yang ditempuh mobil adalah " + jarak + " meter");
    }
    public void displayMessage() {
        System.out.println("Mobil Anda Adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("dalam waktu " + waktu + " detik");
        hitungJarak();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // instansiasi objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan waktu tempuh mobil (dalam jam): ");
        m1.setWaktu(input.nextInt());
        m1.setKecepatan(50);
        m1.ubahKecepatan();
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1231 UA");
        m1.setWarna("Merah");
        m1.displayMessage();

        System.out.println("--------------");

        // instansiasi objek bernama m2
        Mobil m2 = new Mobil();

        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Biru");
        m2.displayMessage();

        System.out.println("==============");
        System.out.println("Atribut pada objek m1 diubah.");

        // mengubah warna dari objek m1
        m1.setWarna("Hijau");

        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}
