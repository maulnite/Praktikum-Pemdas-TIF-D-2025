public class PassingByValue {
    public static void ubahData(int n) {
        n += 8;
    }

    public static void main(String[] args) {
        int angka = 20;
        ubahData(angka);
        System.out.println(angka);
    }
}
