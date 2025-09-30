public class DaftarBelanja {
    public static void main(String[] args) {
        // deklarasi dan inisialisasi array string sebanyak 5 elemen
        String[] barang = {"Beras", "Minyak goreng", "Gula", "Telur", "Kopi"};

        System.out.println("Daftar belanja hari ini:");

        // menggunakan loop for untuk mengakses dan menampilkan setiap elemen
        for (int i = 0; i < barang.length; i++) {
            System.out.println((i + 1) + ". " + barang[i]);
        }
    }
}
