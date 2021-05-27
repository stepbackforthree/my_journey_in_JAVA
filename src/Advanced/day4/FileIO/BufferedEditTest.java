package Advanced.day4.FileIO;

import org.junit.jupiter.api.Test;

import java.io.*;

public class BufferedEditTest {
    @Test
    public void bufferedEdit() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/FileIO/BufferedIOTest.java"));

            int count = 1;
            String str;
            while ((str = br.readLine()) != null) {
                System.out.print(count + " ");
                System.out.println(str);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
