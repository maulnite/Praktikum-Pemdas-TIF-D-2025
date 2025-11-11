public class Penerbit1 {
    String nama;
    String kota = "Malang";

    Penerbit1() {
        this.nama = "Springer";
    }
    Penerbit1(String nama) {
        this.nama = nama;
    }
    Penerbit1(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }

    public void display() {
        System.out.println("Penerbit " + nama);
        System.out.println("di Kota " + kota);
    }
    public static void main(String[] args) {
        Penerbit1 penerbit = new Penerbit1();
        penerbit.display();
        Penerbit1 or = new Penerbit1("O'Reilly");
        or.display();
        Penerbit1 gm = new Penerbit1("Gramedia", "Jakarta");
        gm.display();
    }
}
