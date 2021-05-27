package Advanced.day4.FileIO;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    @Test
    public void fileReader() {
        FileReader fr = null;
        try {
            fr = new FileReader("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/FileIO/test.txt");
            char[] buf = new char[4096];
            int len = 0;
            while ((len = fr.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        } catch (IOException e) {
            System.out.println("read-Exception: " + e.toString());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("close-Exception: " + e.toString());
                }
            }
        }
    }
}
