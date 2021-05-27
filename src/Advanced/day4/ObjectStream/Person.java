package Advanced.day4.ObjectStream;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private Integer age;
    private  Integer weight;
    private String location;
    @Serial
    private static final long serialVersionUID = 0;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", location='" + location + '\'' +
                '}';
    }

    public Person(String name, Integer age, Integer weight, String location) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
