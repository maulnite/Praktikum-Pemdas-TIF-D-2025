public class Main1 {
    public static void main(String[] args) {
        Mobil m1 = new Mobil(); // membuat objek
        m1.merk = "Toyota";
        m1.tahun = 2022;
        m1.info();

        Mobil m2 = new Mobil();
        m2.merk = "Honda";
        m2.tahun = 2020;
        m2.info();
    }
}
