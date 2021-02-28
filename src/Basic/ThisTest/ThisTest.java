package ThisTest;

class Person {
    private String name;
    private int sex;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int sex) {
        this(name);
        this.sex = sex;
    }

    public Person(String name, int sex, int age) {
        this(name, sex);
        this.age = age;
    }

    public Person(String name, int sex, int age, String address) {
        this(name, sex, age);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

public class ThisTest {
    public static void main(String[] args) {
        Person person1 = new Person("WHY", 24, 1, "CHONGQING");
        System.out.println(person1.toString());
    }
}
