package Lab4Ex1.Bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookstoreTest {
    private static List<Book> books = new ArrayList<>();

    public static void createBook(Book book) {
        if (book.getPageCount() <= 0) {
            System.out.println("Nr de pagini trebuie sa fie mai mare ca zero.");
            return;
        }
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                System.out.println("Carte existenta: " + book);
                return;
            }
        }
        books.add(book);
        System.out.println("Carte adaugata: " + book);
    }

    public static void readBooks() {
        if (books.isEmpty()) {
            System.out.println("Nu exista carti.");
        }
        System.out.println("Carti disponibile:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static boolean updateBook(String title, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.set(i, updatedBook);
                System.out.println("Carte modificata: " + updatedBook);
                return true;
            }
        }
        System.out.println("Cartea cu titlul " + title + " nu a fost gasita.");
        return false;
    }

    public static boolean deleteBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                System.out.println("Cartea " + title + " a fost stearsa.");
                return true;
            }
        }
        System.out.println("Cartea nu a fost gasita.");
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bookstore Admin Panel!\nAici puteti adauga carti, modifica carti, sterge carti si vizualiza cartile disponibile.\n");
        Boolean running = true;
        while (running) {
            System.out.println("-----------------------");
            System.out.println("1. Adauga carte");
            System.out.println("2. Modifica carte");
            System.out.println("3. Sterge carte");
            System.out.println("4. Vizualizeaza cartile");
            System.out.println("5. Exit");
            System.out.println("-----------------------");
            System.out.print("Alege optiunea: ");
            int option = 0;
            try {
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        System.out.print("Introdu titlul cartii: ");
                        String title = scanner.nextLine();
                        System.out.print("Introdu autorul cartii: ");
                        String author = scanner.nextLine();
                        System.out.print("Introdu editura cartii: ");
                        String publisher = scanner.nextLine();
                        System.out.print("Introdu numarul de pagini: ");
                        int pageCount;
                        try {
                            pageCount = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Numar de pagini invalid.");
                            break;
                        }
                        createBook(new Book(title, author, publisher, pageCount));
                        break;

                    case 2:
                        System.out.print("Introdu titlul cartii de modificat: ");
                        String oldTitle = scanner.nextLine();
                        System.out.print("Introdu noul titlu: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Introdu noul autor: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Introdu noua editura: ");
                        String newPublisher = scanner.nextLine();
                        System.out.print("Introdu noul numar de pagini: ");
                        int newPageCount;
                        try {
                            newPageCount = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Numar de pagini invalid.");
                            break;
                        }
                        updateBook(oldTitle, new Book(newTitle, newAuthor, newPublisher, newPageCount));
                        break;

                    case 3:
                        System.out.print("Introdu titlul cartii de sters: ");
                        String deleteTitle = scanner.nextLine();
                        deleteBook(deleteTitle);
                        break;

                    case 4:
                        readBooks();
                        break;

                    case 5:
                        System.out.println("Iesire din aplicatie.");
                        running = false;
                        break;

                    default:
                        System.out.println("Optiune invalida. Te rog sa alegi un numar intre 1 si 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Optiune invalida. Te rog sa alegi un numar.");
            }
        }
        scanner.close();
    }
}