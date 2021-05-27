package Advanced.day4.ObjectStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectTest4 {
    public static void main(String[] args) {
        File file1 = new File("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/ObjectStream/ArrayTest.txt");
        File file2 = new File("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/ObjectStream/ListTest.txt");
        ObjectInputStream objectInputStream1 = null;
        ObjectInputStream objectInputStream2 = null;
        Person[] people = null;
        ArrayList<Person> arrayList = null;
        try {
            objectInputStream1 = new ObjectInputStream(new FileInputStream(file1));
            objectInputStream2 = new ObjectInputStream(new FileInputStream(file2));
            people = (Person[]) objectInputStream1.readObject();
            arrayList = (ArrayList<Person>) objectInputStream2.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream1 != null) {
                try {
                    objectInputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectInputStream2 != null) {
                try {
                    objectInputStream2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Array display");
        for (Person person : people) {
            System.out.println(person.toString());
        }
        System.out.println("ArrayList display");
        assert arrayList != null;
        for (Iterator<Person> iterator = arrayList.iterator(); iterator.hasNext();) {
            Person person = iterator.next();
            System.out.println(person.toString());
        }
    }
}
