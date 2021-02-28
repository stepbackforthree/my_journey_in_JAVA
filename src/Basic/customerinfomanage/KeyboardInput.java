package Basic.customerinfomanage;

import java.util.Locale;
import java.util.Scanner;

public class KeyboardInput {
    public static char readMenuSelection() {
        while (true) {
            char input = new Scanner(System.in).next().charAt(0);
            if (input <= '5' && input >= '1') {
                return input;
            } else {
                System.out.print("Selection invalid. Please try again: ");
            }
        }
    }

    public static char readChar() {
        return new Scanner(System.in).nextLine().charAt(0);
    }

    public static char readChar(char defaultValue) {
        String input = new Scanner(System.in).nextLine();
        if (input.length() == 0) {
            return defaultValue;
        }
        return input.charAt(0);
    }

    public static int readInt() {
        while (true) {
            int input = new Scanner(System.in).nextInt();
            if ((input > 99 || input < 0) && input != -1) {
                System.out.print("Input invalid. Please try again: ");
            } else {
                return input;
            }
        }
    }

    public static int readInt(int defaultValue) {
        while (true) {
            String input = new Scanner(System.in).nextLine();
            if (input.length() > 2) {
                System.out.print("Input invalid. Please try again: ");
            } else if (input.length() == 0){
                return defaultValue;
            } else {
                return Integer.parseInt(input);
            }
        }
    }

    public static String readString(int limit) {
        while (true) {
            String input = new Scanner(System.in).nextLine();
            if (input.length() > limit) {
                System.out.println("Input invalid. Please try again: ");
            } else {
                return input;
            }
        }
    }

    public static String readString(int limit, String defaultValue) {
        String input = readString(limit);
        return (input.length() == 0) ? defaultValue : input;
    }

    public static char readConfirmSelection() {
        while (true) {
            char input = new Scanner(System.in).next().toUpperCase(Locale.ROOT).charAt(0);
            if (input == 'Y' || input == 'N') {
                return input;
            } else {
                System.out.println("Input invalid. Please try again: ");
            }
        }
    }
}
