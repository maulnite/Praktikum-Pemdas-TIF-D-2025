public class NestedForLoop {
    public static void main(String[] args) {
        int tinggi = 10;

        for (int i = 0; i < tinggi; i++) {

            // print spasi
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }

            // print bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // pindah ke baris berikutnya
            System.out.println();
        }
    }
}
