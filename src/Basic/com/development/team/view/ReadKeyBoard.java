package Basic.com.development.team.view;

import java.util.Locale;
import java.util.Scanner;

public class ReadKeyBoard {
    public static char readMenuSelection() {
        while (true) {
            String input = new Scanner(System.in).next();
            char inputChar = input.charAt(0);
            if (input.length() == 1 && inputChar > '0' && inputChar < '5') {
                return inputChar;
            } else {
                System.out.println("Only 1-4 is valid to input, please try again.");
                System.out.print("1-Team List\t2-Add Team Member\t3-Delete Team Member\t4-Quit\tPlease select(1-4): ");
            }
        }
    }

    public static void readReturn() {
        while (true) {
            System.out.println("Press enter to continue...");
            String input = new Scanner(System.in).nextLine();
            if (input.length() == 0) {
                break;
            }
        }
    }

    public static int readInt() {
        while (true) {
            int input = new Scanner(System.in).nextInt();
            if (input >= 0 && input < 100) {
                return input;
            } else {
                System.out.println("Only 0-99 is valid to input, please try again.");
            }
        }
    }

    public static char readConfirmSelection() {
        while (true) {
            char input = new Scanner(System.in).next().toUpperCase(Locale.ROOT).charAt(0);
            if (input == 'Y' || input == 'N') {
                return input;
            } else {
                System.out.println("Only Y, N, y, n is valid to input, please try again");
            }
        }
    }
}

