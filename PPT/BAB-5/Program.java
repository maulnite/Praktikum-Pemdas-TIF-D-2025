public class Program {
    static int global = 10;

    static void tambahGlobal() {
        global++;
    }

    public static void main(String[] args) {
        int lokal = 10;
        global++;
        lokal++;

        tambahGlobal();

        System.out.println(lokal);
        System.out.println(global);
    }
}
