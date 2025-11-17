package LC5;

public class Perpustakaan {
    private String nama;
    private int jumlah = 0;
    private Book[] books;

    public Perpustakaan(String nama, int jumlahBuku) {
        this.nama = nama;
        this.books = new Book[jumlahBuku];
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahBuku() {
        return jumlah;
    }

    public void add(Book book){
        books[jumlah++] = book;
        System.out.println("Buku berjudul " + book.getTitle() + " telah ditambahkan ke perpustakaan " + this.nama);
    }
    public void listBuku(){
        System.out.println("Daftar buku di perpustakaan " + this.nama + ":");
        for(int i = 0; i < jumlah; i++){
            System.out.println((i+1) + ". " + books[i].getTitle() + " oleh " + books[i].getAuthor() + " (Tahun: " + books[i].getTahun() + ")");
        }
    }
    public void remove(String judul){
        for(int i = 0; i < jumlah; i++){
            if(books[i].getTitle().equals(judul)){
                System.out.println("Buku berjudul " + books[i].getTitle() + " telah dihapus dari perpustakaan " + this.nama);
                for(int j = i; j < jumlah - 1; j++){
                    books[j] = books[j + 1];
                }
                books[--jumlah] = null;
                return;
            }
        }
        System.out.println("Buku dengan Judul " + judul + " tidak ditemukan di perpustakaan " + this.nama);
    }
    public void edit(String judulLama, Book bukuBaru){
        for(int i = 0; i < jumlah; i++){
            if(books[i].getTitle().equals(judulLama)){
                books[i] = bukuBaru;
                System.out.println("Buku dengan Judul " + judulLama + " telah diperbarui menjadi " + bukuBaru.getTitle() + " di perpustakaan " + this.nama);
                return;
            }
        }
        System.out.println("Buku dengan Judul " + judulLama + " tidak ditemukan di perpustakaan " + this.nama);
    }
}
