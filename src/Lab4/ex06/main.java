package Lab4.ex06;
import java.util.Scanner;
public class main {

    public class Main {
        static Scanner in = new Scanner(System.in);
        static int current_index = 0;

        public static void fillData(Book[] books) {
            if (current_index < books.length) {
                books[current_index] = new Book();
                System.out.println("Book#" + (current_index + 1));
                System.out.print("Title\t: ");
                books[current_index].setTitle(in.nextLine());

                System.out.print("Author\t: ");
                books[current_index].setAuthor(in.nextLine());
                System.out.print("Py\t\t: ");
                books[current_index].setPublishYear(in.nextLine());
                System.out.print("ISBN\t: ");
                books[current_index].setIsbn(in.nextLine());

            } else
                System.out.println("You reach the maximum of books, there are only 5 books for filling data!");
        }

        public static void printAll(Book[] books) {
            for (int i = 0; i < current_index; i++) {
                System.out.print("\nBook#" + (i + 1));
                books[i].getInfo();
            }


        }
        public static void main(String[] args) {
            Book [] books = new Book [2];
            fillData (books);
            printAll (books);
        }
    }
}

