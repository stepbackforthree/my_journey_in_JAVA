package Advanced.day2.TreeSet.CarTest;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class CarTest {
    public static TreeSet initCarCollection() {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Car("a", 10000));
        treeSet.add(new Car("b", 5000));
        treeSet.add(new Car("c", 50000));
        treeSet.add(new Car("b", 15000));
        treeSet.add(new Car("e", 80000));
        return treeSet;
    }

    @Test
    public void naturalSortTest() {
        TreeSet treeSet = initCarCollection();
        for (Object object : treeSet) {
            System.out.println(object);
        }
    }

    @Test
    public void customSortTest() {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Car car1 = (Car) o1;
                Car car2 = (Car) o2;
                return car2.getPrice() - car1.getPrice();
            }
        });
        treeSet.add(new Car("a", 10000));
        treeSet.add(new Car("b", 5000));
        treeSet.add(new Car("c", 50000));
        treeSet.add(new Car("b", 15000));
        treeSet.add(new Car("e", 80000));

        for (Object object : treeSet) {
            System.out.println(object);
        }
    }
}
