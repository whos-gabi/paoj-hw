package Lab4Ex1.Bookstore;

import java.util.List;

public class BookstoreCheck {
    public static boolean isDuplicate(Book book, List<Book> books) {
        int count = 0;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle()) &&
                    b.getAuthor().equalsIgnoreCase(book.getAuthor()) &&
                    b.getPublisher().equalsIgnoreCase(book.getPublisher()) &&
                    b.getPageCount() == book.getPageCount()) {
                count++;
            }
        }
        return count > 1;
    }

    public static Book getThickerBook(Book book1, Book book2) {
        return (book1.getPageCount() > book2.getPageCount()) ? book1 : book2;
    }
}