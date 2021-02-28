package NewDateTest;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewDateTest {
    @Test
    public void test() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime =  LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println("------------------------");

        LocalDate localDate1 = LocalDate.of(2021,5,5);
        System.out.println(localDate1);
        System.out.println("------------------------");

        System.out.println(localDate.getDayOfYear());
        System.out.println("------------------------");

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println("------------------------");

        System.out.println(localTime.getHour());
        System.out.println("------------------------");

        LocalDate withDayOfMonth = localDate.withDayOfMonth(2);
        System.out.println(withDayOfMonth);
        System.out.println("------------------------");

        LocalDate plusDays = localDate.plusDays(4);
        System.out.println(plusDays);
    }

    @Test
    public void test2() {
        Instant instant = Instant.now();
        // Standard UTC time
        System.out.println(instant); // 2021-01-22T06:11:24.738726Z

        OffsetDateTime offsetDateTime = OffsetDateTime.now(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
    }

    @Test
    public void test3() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateTimeFormatter.format(localDateTime));
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateTimeFormatter1.format(localDateTime));
    }
}
