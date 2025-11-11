public class Penerbit2{
    String nama;
    String kota = "Malang";

    Penerbit2() {
        this.nama = "Springer";
    }

    Penerbit2(String nama) {
        this.nama = nama;
    }

    Penerbit2(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }

    public void display() {
        System.out.println("Penerbit " + nama);
        System.out.println("di Kota " + kota);
    }
}

class Buku {
    public String judul;
    public int halaman;
    public String author;
    public Penerbit2 penerbit;

    public void display() {
        System.out.println("Buku " + judul);
        System.out.println("Halaman: " + halaman);
        System.out.println("Author: " + author);
        penerbit.display();
        System.out.println("------------------");
    }
    public static void main(String[] args) {

        Penerbit2 gm = new Penerbit2("Gramedia", "Jakarta");
        Penerbit2 sp = new Penerbit2("Springer", "New York");

        Buku artikel = new Buku();
        artikel.judul = "Rahasia OOP";
        artikel.halaman = 10;
        artikel.author = "John D. Walker";
        artikel.penerbit = gm;

        Buku paper = new Buku();
        paper.judul = "Tips dan Trik Pemrograman Diet";
        paper.halaman = 240;
        paper.author = "Cydia Lapr";
        paper.penerbit = sp;

        // ===
        artikel.display();
        paper.display();

        // copy!
        artikel.author = paper.author;

        artikel.author = "Halu de Luna";
        artikel.display();
        paper.display();

        // copy!
        artikel.penerbit = paper.penerbit;

        artikel.penerbit.nama = "UB Press";
        artikel.display();
        paper.display();
    }
}

