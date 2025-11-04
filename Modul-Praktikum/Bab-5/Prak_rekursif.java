import java.sql.SQLOutput;

public class Prak_rekursif {
    public static void main(String[] args) {
        int hasil;
        int bilangan = 5;
        hasil = faktorial(bilangan);
        System.out.println(fibonanci(10));
        System.out.println("Nilai dari " + bilangan + "! adalah " + hasil);
    }

    private static int faktorial(int bil) {
        if (bil == 1) {
            return 1;
        } else {
            return bil * faktorial(bil - 1);
        }
    }
    public static int fibonanci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        return fibonanci(n-1) + fibonanci(n-2);
    }
}
