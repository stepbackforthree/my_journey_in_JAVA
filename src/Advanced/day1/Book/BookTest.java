package Advanced.day1.Book;

import java.util.ArrayList;
import java.util.LinkedList;

public class BookTest {
    public static void sort(ArrayList books) {
        int unknown = books.size() - 1;
        while (unknown != 0) {
            for (int i = 0; i < unknown; i++) {
                Book book1 = (Book) books.get(i);
                Book book2 = (Book) books.get(i + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    books.set(i + 1, book1);
                    books.set(i, book2);
                }
            }
            unknown--;
        }
    }

    public static void main(String[] args) {
        ArrayList books = new ArrayList();
        Book book1 = new Book("1", 11.5, "1");
        Book book2 = new Book("2", 35.5, "2");
        Book book3 = new Book("3", 22.5, "3");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        sort(books);
        for (Object object : books) {
            Book book = (Book) object;
            System.out.println(book.toString());
        }
    }
}
