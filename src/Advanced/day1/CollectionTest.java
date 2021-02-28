package Advanced.day1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    @Test
    public void test() {
        Collection con = new ArrayList();
        con.add("1");
        con.add("2");
        con.add("3");
        Collection con1 = new ArrayList();
        con1.add("4");
        con1.add("5");
        con.add(con1);
        System.out.println(con.size());
        for (Object object : con) {
            System.out.println(object);
        }
        con.addAll(con1);
        System.out.println(con.size());
        System.out.println(con);
        con.remove(con1);
        System.out.println(con);
        Iterator iterator = con.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
