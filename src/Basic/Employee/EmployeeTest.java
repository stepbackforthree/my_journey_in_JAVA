package Basic.Employee;

import java.io.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("Jack");
        Employee empTwo = new Employee("V");

        empOne.empAge(26);
        empOne.empDesignation("senior");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("junior");
        empTwo.empSalary(500);
        empTwo.printEmployee();
        StreamingAudioPlayer au = new StreamingAudioPlayer();
        au.method();
    }
}
