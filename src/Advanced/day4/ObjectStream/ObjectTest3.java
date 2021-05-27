package Advanced.day4.ObjectStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectTest3 {
    public static void main(String[] args) {
        Person person1 = new Person("a", 18, 150, "1");
        Person person2 = new Person("b", 20, 170, "2");
        Person person3 = new Person("c", 30, 200, "3");
        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);

        File file1 = new File("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/ObjectStream/ArrayTest.txt");
        File file2 = new File("/Users/haoyuwang/IdeaProjects/my_learning/src/Advanced/day4/ObjectStream/ListTest.txt");
        ObjectOutputStream objectOutputStream1 = null;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream1 = new ObjectOutputStream(new FileOutputStream(file1));
            objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file2));
            objectOutputStream1.writeObject(people);
            objectOutputStream1.flush();
            objectOutputStream2.writeObject(arrayList);
            objectOutputStream2.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream1 != null) {
                try {
                    objectOutputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
