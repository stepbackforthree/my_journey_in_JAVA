package Advanced.day8.StreamCreate;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int grade;
    private double score;

    public Student() {

    }

    public Student(int id, String name, int grade, double score) {
        super();
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "id: " + id + ", " + "name: " + name + ", " + "grade: " + grade + ", " + "score: " + score;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + grade;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(score);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        if (grade != other.grade) {
            return false;
        }
        if (id != other.getId()) {
            return false;
        }
        if (name == null) {
            if (other.getName() != null) {
                return false;
            } else if (!name.equals(other.getName())) {
                return false;
            }
        }
        return Double.doubleToLongBits(score) == Double.doubleToLongBits(other.getScore());
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.getScore() * 10 - o.getScore() * 10);
    }
}
