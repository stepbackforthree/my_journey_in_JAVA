package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 6, 5, 3, 30, -5, 9, 12};
        // {-5, 3, 5, 6, 9, 10, 12, 20, 30}
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you want to search: ");
        int findNumber = sc.nextInt();
        int start = 0;
        int end = numbers.length - 1;
        while (true) {
            int mid = (start + end) / 2;
            if (numbers[mid] < findNumber) {
                start = mid + 1;
            } else if (numbers[mid] > findNumber) {
                end = mid - 1;
            } else if (numbers[mid] == findNumber) {
                System.out.println("number exists, its position is " + mid);
                break;
            }
            if (start > end) {
                System.out.println("number does not exist.");
                break;
            }
        }

    }
}
