public class PassingByReferenceString {
    public static void tambahS(String teks) {
        teks += "S";
    }

    public static void main(String[] args) {
        String nama = "ASPRAK";
        tambahS(nama);
        System.out.println(nama);
    }
}