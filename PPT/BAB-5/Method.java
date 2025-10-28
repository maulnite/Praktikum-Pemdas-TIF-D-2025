public class Method {
    public static void printLetters(String teks) {
        for (int i = 0; i < teks.length(); i++) {
            System.out.println(teks.charAt(i));
        }
    }

    public static void main(String[] args) {
        printLetters("Halo Semua");
    }
}
