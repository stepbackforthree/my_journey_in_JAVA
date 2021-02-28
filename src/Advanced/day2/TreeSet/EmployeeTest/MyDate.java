package Advanced.day2.TreeSet.EmployeeTest;

public class MyDate implements Comparable {
    private Integer month;
    private Integer day;
    private Integer year;

    public MyDate(Integer month, Integer day, Integer year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        MyDate myDate = (MyDate) o;
        if (!this.getYear().equals(myDate.getYear())) {
            return -this.getYear().compareTo(myDate.getYear());
        } else if (this.getYear().equals(myDate.getYear())&&(!this.getMonth().equals(myDate.getMonth()))) {
            return -this.getMonth().compareTo(myDate.getMonth());
        } else if ((this.getMonth().equals(myDate.getMonth()))&&(this.getYear().equals(myDate.getYear()))&&(!this.getDay().equals(myDate.getDay()))) {
            return -this.getDay().compareTo(myDate.getDay());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
