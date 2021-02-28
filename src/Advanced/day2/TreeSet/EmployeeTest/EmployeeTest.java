package Advanced.day2.TreeSet.EmployeeTest;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeTest {
    @Test
    public void naturalSortTest() {
        TreeSet set = new TreeSet();

        Employee employee1 = new Employee("James", 18, new MyDate(1, 5, 2000));
        Employee employee2 = new Employee("Harden", 19, new MyDate(1, 2, 1980));
        Employee employee3 = new Employee("Chris", 20, new MyDate(1, 3, 2005));
        Employee employee4 = new Employee("Paul", 21, new MyDate(1, 4, 2001));
        Employee employee5 = new Employee("Hector", 22, new MyDate(1, 5, 2000));

        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);

        for (Object object : set) {
            System.out.println(object);
        }
    }

    @Test
    public void customSortTest() {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee employee1 = (Employee) o1;
                Employee employee2 = (Employee) o2;
                MyDate myDate1 = employee1.getBirthday();
                MyDate myDate2 = employee2.getBirthday();
                if (!myDate1.getYear().equals(myDate2.getYear())) {
                    return myDate1.getYear().compareTo(myDate2.getYear());
                } else if ((myDate1.getYear().equals(myDate2.getYear()))&&(!myDate1.getMonth().equals(myDate2.getMonth()))) {
                    return myDate1.getMonth().compareTo(myDate2.getMonth());
                } else if ((myDate1.getYear().equals(myDate2.getYear()))&&(myDate1.getMonth().equals(myDate2.getMonth()))&&(!myDate1.getDay().equals(myDate2.getDay()))) {
                    return myDate1.getDay().compareTo(myDate2.getDay());
                } else {
                    return employee1.getName().compareTo(employee2.getName());
                }
            }
        });

        Employee employee1 = new Employee("James", 18, new MyDate(1, 5, 2000));
        Employee employee2 = new Employee("Harden", 19, new MyDate(1, 2, 1980));
        Employee employee3 = new Employee("Chris", 20, new MyDate(1, 3, 2005));
        Employee employee4 = new Employee("Paul", 21, new MyDate(1, 4, 2001));
        Employee employee5 = new Employee("Hector", 22, new MyDate(1, 5, 2000));

        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);

        for (Object object : set) {
            System.out.println(object);
        }
    }
}
