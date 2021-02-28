package Advanced.day2.TreeSet;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    // TreeSet自然排序
    public void natureTest() {
        Set set = new TreeSet();
        Book book1 = new Book("三国演义", 12.5, "罗贯中");
        Book book2 = new Book("三国演义2", 25.5, "罗贯中1");
        Book book3 = new Book("三国演义2", 35.5, "罗贯中2");

        set.add(book1);
        set.add(book2);
        set.add(book3);

        for (Object object : set) {
            System.out.println(object);
        }
    }

    @Test
    // TreeSet定制排序
    public void customTest() {
        // 需要在初始化TreeSet时声明匿名内部类Comparator并重写compare()方法
        Set set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return (int) (book2.getPrice() - book1.getPrice());
            }
        });

        Book book1 = new Book("三国演义", 12.5, "罗贯中");
        Book book2 = new Book("三国演义2", 25.5, "罗贯中1");
        Book book3 = new Book("三国演义2", 35.5, "罗贯中2");
        set.add(book1);
        set.add(book2);
        set.add(book3);

        for (Object object : set) {
            System.out.println((Book) object);
        }
    }
}
