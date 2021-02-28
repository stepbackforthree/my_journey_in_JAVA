package extend.exercise;

class Person {
    String name;
    char sex;
    int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {
    long number;
    int math;
    int english;
    int computer;

    public Student(String n, char s, int a, long number, int math, int english, int computer) {
        super(n, s, a);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public double aver() {
        return (math + english + computer) / 3.0;
    }

    public int max() {
        return Math.max(Math.max(math, english), computer);
    }

    public int min() {
        return Math.min(Math.min(math, english), computer);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", number=" + number +
                ", math=" + math +
                ", english=" + english +
                ", computer=" + computer +
                '}';
    }
}

public class PersonStudent {
    public static void main(String[] args) {
        Student a = new Student("Jesse", '1', 18, 1111, 70, 80, 60);
        System.out.println(a.toString());
        System.out.println(a.aver());
        System.out.println(a.max());
        System.out.println(a.min());
    }
}
