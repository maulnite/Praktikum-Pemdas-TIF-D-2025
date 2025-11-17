package LC5;
import java.util.Scanner;
public class HarryPotter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String namaPerpustakaan = in.nextLine();
        int jumlahBuku = in.nextInt();
        in.nextLine();
        Perpustakaan perpustakaan = new Perpustakaan(namaPerpustakaan, jumlahBuku);
        for (int i = 0; i < jumlahBuku; i++) {
            String judul = in.nextLine();
            String penulis = in.nextLine();
            String isbn = in.nextLine();
            Book book = new Book(judul, penulis, isbn);
            perpustakaan.add(book);
        }
        int ops = in.nextInt();
        in.nextLine();
        for (int i = 0; i < ops; i++) {
            String operation = in.nextLine();
            if (operation.equals("LIST")) {
                perpustakaan.listBuku();
            } else if (operation.equals("REMOVE")) {
                String judul = in.nextLine();
                perpustakaan.remove(judul);
            } else if (operation.equals("EDIT")) {
                String judulLama = in.nextLine();
                String judulBaru = in.nextLine();
                String penulisBaru = in.nextLine();
                String isbnBaru = in.nextLine();
                Book bukuBaru = new Book(judulBaru, penulisBaru, isbnBaru);
                perpustakaan.edit(judulLama, bukuBaru);
            }
        }
    }
}
