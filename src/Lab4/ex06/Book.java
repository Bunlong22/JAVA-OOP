package Lab4.ex06;

public class Book {
    // Fields
    private String isbn, title, author, publishYear;

    Book() {
    }

    Book(String title) {

        this.title = title;

    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }

    Book(String isbn, String title, String author, String publishYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }
    public void getInfo() {
        System.out.println();
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("PY: " + getPublishYear());
        System.out.println("ISBN: " + getIsbn());
        System.out.println();
    }
}