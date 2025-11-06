public class Motor {
    String merk;
    int tahun;

    // Constructor
    public Motor(String m, int t) {
        merk = m;
        tahun = t;
    }

    void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}

class Main {
    public static void main(String[] args) {
        Motor m1 = new Motor("Suzuki", 2023);
        m1.info();
    }
}