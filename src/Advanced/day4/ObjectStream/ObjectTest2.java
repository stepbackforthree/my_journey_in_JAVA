package Advanced.day4.ObjectStream;

import java.io.*;

public class ObjectTest2 {
    public void deserialization(File file) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                try {
                    Person person = (Person) objectInputStream.readObject();
                    System.out.println(person.toString());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (EOFException ee) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ObjectTest2 objectTest2 = new ObjectTest2();
        objectTest2.deserialization(new File("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/ObjectStream/test.txt"));
    }
}
