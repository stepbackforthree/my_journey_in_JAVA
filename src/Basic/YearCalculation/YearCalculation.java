package YearCalculation;

import java.util.Scanner;

class ReadYear {
    int year;
    int month;
    int day;
    int total_day;

    public ReadYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        year = sc.nextInt();
        System.out.print("Please enter the month: ");
        month = sc.nextInt();
        System.out.print("Please enter the day: ");
        day = sc.nextInt();
    }

    public int Calculation() {
        switch (month) {
            case 12:
                total_day += 30;
            case 11:
                total_day += 31;
            case 10:
                total_day += 30;
            case 9:
                total_day += 31;
            case 8:
                total_day += 31;
            case 7:
                total_day += 30;
            case 6:
                total_day += 31;
            case 5:
                total_day += 30;
            case 4:
                total_day += 31;
            case 3:
                if ((year % 4 == 0) && (year % 100 != 0)) {
                    total_day += 29;
                } else {
                    total_day += 28;
                }
            case 2:
                total_day += 31;
            case 1:
                total_day += day;
        }
        return total_day;
    }
}

public class YearCalculation {
    public static void main(String[] args) {
        ReadYear r = new ReadYear();
        System.out.println("This day is the " + r.Calculation() + " day in this year.");
    }
}


