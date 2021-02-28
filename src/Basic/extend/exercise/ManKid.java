package extend.exercise;

import javax.swing.*;

class ManKind {
    int sex;
    int salary;

    public void manOrWoman() {
        System.out.println((sex == 1) ? "man" : "woman");
    }

    public void employeed() {
        System.out.println((salary == 0) ? "no job" : "job");
    }
}

class Kids extends ManKind {
    int yearsOld;

    public Kids(int sex, int salary, int yearsOld) {
        this.sex = sex;
        this.salary = salary;
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(yearsOld);
    }
}

public class ManKid {
    public static void main(String[] args) {
        Kids a = new Kids(1, 1000, 18);
        a.printAge();
        a.manOrWoman();
        a.employeed();
    }
}
