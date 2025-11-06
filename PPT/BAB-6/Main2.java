public class Main2 {
    public static void main(String[] args) {
        int x = 5; // primitif
        Motor m = new Motor("Daihatsu", 2021); // referensi

        System.out.println("x: " + x);
        System.out.println("m: " + m);
        System.out.println("m.merk: " + m.merk);
        System.out.println("m.tahun: " + m.tahun);
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}