package ThrowsTest;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {
    @Test
    public void test() {
        try {
            demo(111);
        } catch (FileNotFoundException e) {
            System.out.println("Your ID number is not correct, please try again");
        }
    }

    public void demo(int id) throws FileNotFoundException {
        demo2(id);
    }

    public void demo2(int id) throws FileNotFoundException {
        new FileInputStream(id + ".txt");
    }
}
