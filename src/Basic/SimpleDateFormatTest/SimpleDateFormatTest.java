package SimpleDateFormatTest;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    @Test
    public void test() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(date);
        System.out.println(simpleDateFormat.format(date));
        System.out.println("----------------------------------------------");

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println(simpleDateFormat1.format(date));
        System.out.println("----------------------------------------------");

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
        System.out.println(simpleDateFormat2.format(date));
        System.out.println("----------------------------------------------");

        Date date1 = simpleDateFormat2.parse("2021.01.18 17:47:49 CST");
        System.out.println(date1);
        System.out.println(date1.getTime());

    }
}
