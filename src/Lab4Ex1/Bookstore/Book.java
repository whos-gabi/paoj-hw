package Lab4Ex1.Bookstore;
//- clasa Book cu următoarele atribute: title, author, publisher, pageCount.

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "BOOK_TITLE: " + title.toUpperCase() + "\n" +
                "BOOK_AUTHOR: " + author + "\n" +
                "BOOK_PUBLISHER: " + publisher.toLowerCase();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPageCount() {
        return pageCount;
    }
}
