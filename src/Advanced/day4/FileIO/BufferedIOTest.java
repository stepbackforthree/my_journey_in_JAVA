package Advanced.day4.FileIO;

import org.junit.jupiter.api.Test;

import java.io.*;

public class BufferedIOTest {
    @Test
    public void bufferedIO() {
        BufferedInputStream br = null;
        BufferedOutputStream bw = null;

        try {
            br = new BufferedInputStream(new FileInputStream("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/FileIO/抽水泵.png"));
            bw = new BufferedOutputStream(new FileOutputStream("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/FileIO/抽水泵（副本）.png"));
            byte[] bytes = new byte[1024];
            while (br.read(bytes) != -1) {
                bw.write(bytes);
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
