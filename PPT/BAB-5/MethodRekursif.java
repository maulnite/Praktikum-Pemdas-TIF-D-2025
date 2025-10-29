public class MethodRekursif {
    static long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * (factorial(num - 1));
    }

    static int fibonacci(int a, int b, int count) {
        if (count == 0) {
            return a;
        }

        return fibonacci(b, a + b, count - 1);
    }

    public static void main(String[] args) {
        int count = 5;
        int a = 0;
        int b = 1;

        for (int i = 0; i < count; i++) {
            System.out.println(a + " " + b + " ");
            a = b;
            b = a + b;
        }
    }
}