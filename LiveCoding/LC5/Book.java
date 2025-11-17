package LC5;

public class Book {
    private String title;
    private String author;
    private String tahun;

    public Book(String title, String author, String tahun) {
        this.title = title;
        this.author = author;
        this.tahun = tahun;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTahun() {
        return tahun;
    }
}
