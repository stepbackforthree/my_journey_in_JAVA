package FamilyAccount;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

class Interface {
    public void displayInterface() {
        System.out.println("----------------Family Income and Expenditure Operation----------------\n");
        System.out.println("\t\t\t\t\t1 Income and Expenditure Details");
        System.out.println("\t\t\t\t\t2 Record Income");
        System.out.println("\t\t\t\t\t3 Record Expenditure");
        System.out.println("\t\t\t\t\t4 Exit\n");
        System.out.print("\t\t\t\t\tPlease Select(1-4): ");
    }
}

class Keyboard {
    public char readInputOfSelection() {
        Scanner sc = new Scanner(System.in);
        char selection = sc.next().charAt(0);
        return switch (selection) {
            case '4' -> '4';
            case '3' -> '3';
            case '2' -> '2';
            case '1' -> '1';
            default -> '0';
        };
    }

    public String readInputOfDescription() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public double readInputOfNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public boolean readInputOfYN() {
        Scanner sc = new Scanner(System.in);
        return sc.next().charAt(0) == 'Y';
    }
}

class DetailsCollection {
    ArrayList<String> state = new ArrayList<>();
    ArrayList<Double> amount = new ArrayList<>();
    ArrayList<Double> balance = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("#.00");
    int count = 0;

    public void printDetails() {
        if (this.count == 0) {
            System.out.println("\n\t\t\t\t\tSorry, there is no record.\n");
        } else {
            System.out.println("\n---------------Current Details of Income and Expenditure---------------");
            System.out.println("Income/Expenditure\t\tAmount\t\tBalance\t\tDescription");
            for (int i = 0; i < count; i++) {
                if (state.get(i).equals("Income")) {
                    System.out.println("\t" + state.get(i) + "\t\t\t\t" + amount.get(i) + "\t\t" + df.format(balance.get(i)) + "\t\t" + description.get(i) + "\n");
                } else {
                    System.out.println("\t" + state.get(i) + "\t\t\t" + amount.get(i) + "\t\t" + df.format(balance.get(i)) + "\t\t" + description.get(i) + "\n");
                }
            }
            System.out.println("-----------------------------------------------------------------------\n");
        }
    }
}

public class FamilyAccount {
    public static void main(String[] args) {
        boolean loop_flag = true;
        Interface inter = new Interface();
        Keyboard keyboard = new Keyboard();
        DetailsCollection details = new DetailsCollection();
        while (loop_flag) {
            inter.displayInterface();
            char selection = keyboard.readInputOfSelection();
            switch (selection) {
                case '4' -> {
                    System.out.print("\n\t\t\t\t\tPlease confirm whether to exit(Y/N): ");
                    if (keyboard.readInputOfYN()) {
                        loop_flag = false;
                        System.out.print("\n\t\t\t\t\tThanks for using!");
                    }
                    System.out.println("");
                }
                case '3', '2' -> {
                    double amount;
                    String description;
                    if (selection == '3') {
                        System.out.print("\t\tPlease enter the amount of this expenditure: ");
                        amount = keyboard.readInputOfNumber();
                        System.out.print("\t\tPlease enter the description of this expenditure: ");
                        description = keyboard.readInputOfDescription();
                        details.state.add("Expenditure");
                        if (details.count == 0) {
                            details.balance.add(10000 - amount);
                        } else {
                            details.balance.add(details.balance.get(details.count - 1) - amount);
                        }
                    } else {
                        System.out.print("\t\tPlease enter the amount of this income: ");
                        amount = keyboard.readInputOfNumber();
                        System.out.print("\t\tPlease enter the description of this income: ");
                        description = keyboard.readInputOfDescription();
                        details.state.add("Income");
                        if (details.count == 0) {
                            details.balance.add(10000 + amount);
                        } else {
                            details.balance.add(details.balance.get(details.count - 1) + amount);
                        }
                    }
                    details.amount.add(amount);
                    details.description.add(description);
                    details.count++;
                }
                case '1' -> details.printDetails();
            }
        }
    }
}
