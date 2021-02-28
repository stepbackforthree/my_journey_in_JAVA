package abstract_exercise;

abstract class Employee {
    String name;
    int id;
    double salary;

    static {
        System.out.println("time for working!");
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee {
    double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("Manager gets to work, plus bonus: " + bonus);
    }
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("Employee gets to work");
    }
}

public class EmployeeTest {
    public static void printWork(Employee employee) {
        employee.work();
    }

    public static void main(String[] args) {
        Employee a = new CommonEmployee("James", 111, 2000);
        Employee b = new Manager("Harden", 222, 4000, 1000);
        printWork(a);
        printWork(b);
    }
}
