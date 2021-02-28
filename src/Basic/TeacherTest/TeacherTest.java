package TeacherTest;

class Teacher{
    String name;
    int age;
    int teachAge;
    String course;

    public void say() {
        System.out.println("name: " + name + "\nage: " + age + "\nteachAge: " + teachAge + "\ncourse: " + course);
    }
}

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "James";
        teacher1.age = 30;
        teacher1.teachAge = 10;
        teacher1.course = "Art";
        teacher1.say();
    }
}
