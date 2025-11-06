public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
}

class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Orie", "245150207111050", 3.9);
        mhs1.tampilData();
    }
}