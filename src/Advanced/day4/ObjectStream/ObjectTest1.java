package Advanced.day4.ObjectStream;

import java.io.*;

public class ObjectTest1 {
    public void serializeObject(ObjectOutputStream objectOutputStream, Person person, File file) {
        try {
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("a", 18, 150, "1");
        Person person2 = new Person("b", 20, 170, "2");
        Person person3 = new Person("c", 30, 200, "3");
        File file = new File("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/ObjectStream/test.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectTest1 objectTest1 = new ObjectTest1();
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        objectTest1.serializeObject(objectOutputStream, person1, file);
        objectTest1.serializeObject(objectOutputStream, person2, file);
        objectTest1.serializeObject(objectOutputStream, person3, file);
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
