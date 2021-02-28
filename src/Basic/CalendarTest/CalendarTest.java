package CalendarTest;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class CalendarTest {
    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("---------------------------");

        calendar.add(Calendar.DAY_OF_MONTH, -2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("---------------------------");

        calendar.set(Calendar.DAY_OF_MONTH, 30);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("---------------------------");

        System.out.println(calendar.getTime());
    }
}
