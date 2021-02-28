package DateTest;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTest {
    @Test
    public void testForUtil() {
        java.util.Date date = new Date(); // Mon Jan 18 17:30:13 CST 2021
        System.out.println(date);
        System.out.println(date.getTime()); // 1610962113075
    }

    @Test
    public void testForSql() {
        java.sql.Date date = new java.sql.Date(1610962113075L); // 2021-01-18
        System.out.println(date);
    }
}
