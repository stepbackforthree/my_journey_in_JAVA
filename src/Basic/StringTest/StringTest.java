package StringTest;

import org.junit.jupiter.api.Test;
import java.util.Locale;

public class StringTest {

    @Test
    public void test1() {
        String a = "     abcdefg       ";
        char[] b = a.toCharArray();
        int len = b.length;
        char[] c = new char[len];
        for (char i : b) {
            c[len - 1] = i;
            len--;
        }
        a = new String(c);
        System.out.println(a);
    }

    @Test
    public void test2() {
        String a = "aBcDEFG";
        System.out.println(a.toLowerCase(Locale.ROOT));
        System.out.println(a.toUpperCase(Locale.ROOT));
    }

    @Test
    public void test3() {
        String a = "aBcDEFG";
        char[] b = a.toCharArray();
        char[] c = new char[b.length];
        int index = 0;
        for (char i : b) {
            if (i >= 'a' && i <= 'z') {
                i -= 32;
            } else if (i >= 'A' && i <= 'Z') {
                i += 32;
            }
            c[index++] = i;
        }
        a = new String(c);
        System.out.println(a);
    }

    @Test
    public void test4() {
        String a = "abcdefabcdddabc";
        String[] b = a.split("abc");
        int numB = 0;
        for (String c : b) {
            numB += c.length();
        }
        System.out.println((a.length() - numB) / 3);
    }
}
