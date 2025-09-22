public class Continue {
    public static void main(String[] args) {
        int total = 0;

        // loop dari 0 hingga 100 (inklusif)
        for (int i = 0; i <= 100; i++) {
            // jika bilangan ganjil, skip (lanjut ke iterasi berikutnya)
            if (i % 2 != 0) {
                continue;
            }

            // jika genap, tambahkan ke total
            total += i;
        }

        // cetak hasil penjumlahan bilangan genap
        System.out.printf("Hasil penjumlahan bilangan genap: %d%n", total);
    }
}
