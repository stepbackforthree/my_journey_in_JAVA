package Advanced.day4.FileIO;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    @Test
    public void fileWrite() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/FileIO/test.txt", true);
            // 参数有true时在文件末尾续写，无true时覆盖同名文件并写入数据
            fw.write("fileWrite");
        } catch(IOException e) {
            System.out.println(e.toString());
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("close-Exception: " + e.toString());
                }
            }
        }
    }
}
