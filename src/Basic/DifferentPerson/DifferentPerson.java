package DifferentPerson;

class Person {
    String name;
    int age;
    int sex;

    public void study() {
        System.out.println("Studying");
    }

    public void showAge() {
        System.out.println("age: " + age);
    }

    public void addAge(int i) {
        this.age += i;
    }
}

public class DifferentPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "James";
        person1.age = 36;
        person1.sex = 1;
        person2.name = "Harden";
        person2.age = 31;
        person2.sex = 1;
        person2.showAge();
        person2.addAge(3);
        person2.study();
        person2.showAge();
    }
}
