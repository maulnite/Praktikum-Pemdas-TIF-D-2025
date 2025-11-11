public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    public void setNoPlat(String s) {
        noPlat = s;
    }
    public void setWarna(String s) {
        warna = s;
    }
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    public void setKecepatan(int i) {
        kecepatan = i;
    }
    public void displayMessage() {
        System.out.println("Mobil Anda Adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan" + kecepatan);
    }

    public static void main(String[] args) {
        // instansiasi objek bernama m1
        Mobil m1 = new Mobil();

        m1.setKecepatan(50);
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
