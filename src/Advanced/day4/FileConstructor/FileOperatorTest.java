package Advanced.day4.FileConstructor;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileOperatorTest {
    @Test
    public void OperatorTest() throws IOException {
        File dir1 = new File("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/dir1");
        if (!dir1.exists()) {
            boolean mk1 = dir1.mkdir();
            assert mk1;
        }
        File dir2 = new File(dir1, "dir2");
        if (!dir2.exists()) {
            boolean mk2 = dir2.mkdirs();
            assert mk2;
        }
        File file1 = new File(dir2, "file1.txt");
        if (!file1.exists()) {
            boolean mk3 = file1.createNewFile();
            assert mk3;
        }
        File file2 = new File(dir1, "file2.txt");
        if (!file2.exists()) {
            boolean mk4 = file2.createNewFile();
            assert mk4;
        }
        listFile(dir1);
        listFile(dir2);
        deleteFile(file1);
        System.out.println("delete file1");
        listFile(dir2);
        listFile(dir1);
        deleteFile(dir2);
        listFile(dir1);
    }

    public void deleteFile(File path) {
        boolean dl1 = path.delete();
        assert dl1;
    }

    public void listFile(File path) {
        if (path.list() != null) {
            for (String file : path.list()) {
                System.out.println(file);
            }
        }
    }
}
