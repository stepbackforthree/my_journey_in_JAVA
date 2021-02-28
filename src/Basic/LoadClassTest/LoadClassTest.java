package LoadClassTest;

import org.junit.jupiter.api.Test;

public class LoadClassTest {
    @Test
    public void test() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader(); // System ClassLoader
        System.out.println(classLoader);
        classLoader = classLoader.getParent(); // Extension ClassLoader
        System.out.println(classLoader);
        classLoader = classLoader.getParent(); // Bootstrap ClassLoader
        System.out.println(classLoader);
    }
}
