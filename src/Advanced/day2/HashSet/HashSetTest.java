package Advanced.day2.HashSet;

import Advanced.day3.CustomGeneric.Book;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Book book1 = new Book("红楼梦", 20.5, "曹雪芹");
        Book book2 = new Book("红楼梦", 20.5, "曹雪芹");
        hashSet.add(book1);
        hashSet.add(book2);
        for (Object object : hashSet) {
            System.out.println(object.toString());
        }
    }
}
