package Advanced.day2.HashMap.BookTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookLibrary {
    private Map bookMap = new HashMap();

    public void addBook(Book book, Double price) {
        bookMap.put(book, price);
    }

    public void deleteBook(Book book) {
        bookMap.remove(book);
    }

    public void findBook(Book book) {
        System.out.println(bookMap.get(book));
    }

    public void editBook(Book book, Double price) {
        bookMap.put(book, price);
    }

    public void traverseBook() {
        Iterator iterator = bookMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = new Book(1, "1", "a", 11.5);
        Book book2 = new Book(2, "2", "b", 31.5);
        Book book3 = new Book(3, "3", "c", 110.0);
        Book book4 = new Book(4, "4", "d", 24.7);
        Book book5 = new Book(5, "5", "e", 5.5);

        bookLibrary.addBook(book1, book1.getPrice());
        bookLibrary.addBook(book2, book2.getPrice());
        bookLibrary.addBook(book3, book3.getPrice());
        bookLibrary.addBook(book4, book4.getPrice());
        bookLibrary.addBook(book5, book5.getPrice());

        bookLibrary.traverseBook();
    }
}
