public class MultiForLoop {
    public static void main(String[] args) {

        // for loop dengan dua variabel
        // i dimulai dari 0, j dimulai dari 10
        // perulangan berlangsung selama i < 10 dan j > 0
        for (int i = 0, j = 10; i < 10 && j > 0; i++, j--) {

            // Setiap iterasi:
            // i bertambah 1
            // j berkurang 1
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
    }
}
