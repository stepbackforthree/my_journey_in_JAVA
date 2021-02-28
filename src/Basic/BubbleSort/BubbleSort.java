package Basic.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 6, 5, 3, 30, -5, 9, 12};
        int unknown = numbers.length - 1;
        while (unknown != 0) {
            for (int i = 0; i < unknown; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
            unknown--;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
