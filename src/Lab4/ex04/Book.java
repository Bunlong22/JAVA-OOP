package Lab4.ex04;

public class Book {
    //a. Data member
    public String title;
    public String author;
    public String isbn;

    //b. Method member and constructor:
    //constructor
    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    // All method set
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    // Method
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public  String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        /* Book myBook=new Book();
        myBook.setTitle("The Magic");
        myBook.setAuthor("Rhonda Byrne");
        myBook.setIsbn("978-1451673449");
        */
      //  Book myBook=new Book("The Magic");

        Book myBook = new Book("The Magic","Rhonda Byrne","978-1451673449");
        System.out.println("The title of the book is "+myBook.getTitle());
        System.out.println("The author of the book is "+myBook.getAuthor());
        System.out.println("The ISBN of the book is "+myBook.getIsbn());
    }
}
