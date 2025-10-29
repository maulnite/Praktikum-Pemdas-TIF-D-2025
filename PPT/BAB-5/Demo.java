public class Demo {
    static void ubahNilai(int x) {
        x = 10; // hanya mengubah salinan
    }

    public static void main(String[] args) {
        int a = 5;
        ubahNilai(a);
        System.out.println(a); // hasilnya tetap 5
    }
}
