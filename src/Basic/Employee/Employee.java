package Basic.Employee;

import java.io.*;

public class Employee {
    String name;
    private int age;
    String designation;
    double salary;
    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        this.age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class AudioPlayer{
    protected boolean openSpeaker(){
        return true;
    }
}

class StreamingAudioPlayer extends AudioPlayer {
    public boolean openSpeaker() {
        return false;
    }
    public void method() {
        System.out.println(this.openSpeaker());
        System.out.println(super.openSpeaker());
    }
}