package Lab4Ex1.Bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookstoreCheckTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Java Programming", "John Doe", "TechBooks", 500);
        Book book2 = new Book("Python Basics", "Jane Smith", "CodePress", 300);
        // Duplicat:
        Book book3 = new Book("Java Programming", "John Doe", "TechBooks", 500);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        // isDuplicate
        System.out.println("Is book1 a duplicate? " + BookstoreCheck.isDuplicate(book1, books)); // true
        System.out.println("Is book2 a duplicate? " + BookstoreCheck.isDuplicate(book2, books)); // false

        // getThickerBook
        Book thickerBook = BookstoreCheck.getThickerBook(book1, book2);
        System.out.println("The thicker book is: \n" + thickerBook);
    }
}
