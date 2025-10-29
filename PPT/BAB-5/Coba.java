public class Coba {
    public static void main(String[] args) {
        // ini static
        Karyawan.printUmur();

        // ini non-static
        Karyawan hubert = new Karyawan();
        hubert.printNama();
    }
}

class Karyawan {
    // method non-static
    void printNama() {
        System.out.println("Hubert");
    }

    // method static
    static void printUmur() {
        System.out.println(20);
    }
}