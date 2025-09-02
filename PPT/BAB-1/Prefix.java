public class Prefix {
    public static void main(String[] args) {
        // prefix
        int a = 10;
        int x = ++a;   // a = 11, x = 11

        // ekuivalen dengan:
        int b = 10;
        b++;
        int y = b;     // b = 11, y = 11

        System.out.println("a = " + a + ", x = " + x);
        System.out.println("b = " + b + ", y = " + y);
    }
}
