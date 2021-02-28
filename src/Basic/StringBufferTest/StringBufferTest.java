package Basic.StringBufferTest;

import org.junit.jupiter.api.Test;

public class StringBufferTest {
    @Test
    public void test1() {
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        StringBuilder sb2 = sb;
        System.out.println(sb2);
        sb.append("ccc");
        System.out.println(sb.hashCode());
        System.out.println(sb2.hashCode());
    }
}
