package CharSwtich;

import java.util.Scanner;

class ReadChar {
    char ch;
    String s;
    public ReadChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the alphabet: ");
        s = sc.next();
        ch = s.charAt(0);
    }
    public char FormatSwitch(char ch) {
        return switch (ch) {
            case 'a' -> 'A';
            case 'b' -> 'B';
            case 'c' -> 'C';
            case 'd' -> 'D';
            default -> 'E';
        };
    }
}
public class CharSwitch {
    public static void main(String[] args) {
        ReadChar r = new ReadChar();
        if (r.FormatSwitch(r.ch) == 'E') {
            System.out.println("other");
        } else {
            System.out.println("This is the result of switch: " + r.FormatSwitch(r.ch));
        }
    }

}
