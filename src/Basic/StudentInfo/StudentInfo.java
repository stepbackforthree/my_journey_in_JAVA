package StudentInfo;

class Students {
    int number;
    int grade;
    int score;
    
    public void inputInfo(int number) {
        this.number = number;
        this.grade = (int)Math.round(Math.random() * 5) + 1;
        this.score = (int)Math.round(Math.random() * 100);
    }

    public void printInfo() {
        System.out.println("Number: " + number + "\nGrade: " + grade + "\nScore: " + score);
    }
}

class InfoHandle {
    public static void findSpecialGrade(int grade, Students[] students) {
        for (Students student : students) {
            if (student.grade == grade) {
                student.printInfo();
            }
        }
    }

    public static Students[] infoBubbleSort(Students[] students) {
        int unknown = students.length - 1;
        while (unknown != 0) {
            for (int i = 0; i < unknown; i++) {
                if (students[i].score > students[i + 1].score) {
                    Students temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
            unknown--;
        }
        return students;
    }

    public static void travelInfo(Students[] students) {
         for (int i = 0; i < students.length - 1; i++) {
             students[i].printInfo();
         }
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Students[] students = new Students[20];
        for(int i = 0; i < 20; i++) {
            Students student = new Students();
            student.inputInfo(i);
            students[i] = student;
        }
        System.out.println("Question 1\n");
        InfoHandle.findSpecialGrade(3, students);
        System.out.println("\nQuestion 2\n");
        students = InfoHandle.infoBubbleSort(students);
        InfoHandle.travelInfo(students);
    }
}
