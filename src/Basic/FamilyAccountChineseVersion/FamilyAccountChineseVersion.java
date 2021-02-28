package FamilyAccountChineseVersion;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

class Interface {
    public static void displayInterface() {
        System.out.println("---------------家庭收支记账工具---------------\n");
        System.out.println("\t\t\t\t1 收支明细");
        System.out.println("\t\t\t\t2 记录收入");
        System.out.println("\t\t\t\t3 记录支出");
        System.out.println("\t\t\t\t4 退出\n");
        System.out.print("\t\t\t\t请选择(1-4): ");
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
        return sc.next().toUpperCase().charAt(0) == 'Y';
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
            System.out.println("\n\t\t\t\t目前还没有收支记录。\n");
        } else {
            System.out.println("\n---------------当前收支明细记录---------------");
            System.out.println("\t收入/支出\t\t金额\t\t余额\t\t备注");
            for (int i = 0; i < count; i++) {
                if (state.get(i).equals("收入")) {
                    System.out.println("\t  " + state.get(i) + "\t\t\t" + amount.get(i) + "  " + df.format(balance.get(i)) + "\t" + description.get(i) + "\n");
                } else {
                    System.out.println("\t  " + state.get(i) + "\t\t\t" + amount.get(i) + "  " + df.format(balance.get(i)) + "\t" + description.get(i) + "\n");
                }
            }
            System.out.println("-------------------------------------------\n");
        }
    }
}

public class FamilyAccountChineseVersion {
    public static void main(String[] args) {
        boolean loop_flag = true;
        Keyboard keyboard = new Keyboard();
        DetailsCollection details = new DetailsCollection();
        while (loop_flag) {
            Interface.displayInterface();
            char selection = keyboard.readInputOfSelection();
            switch (selection) {
                case '4' -> {
                    System.out.print("\n\t\t\t\t请确认是否退出(Y/N): ");
                    if (keyboard.readInputOfYN()) {
                        loop_flag = false;
                        System.out.print("\n\t\t\t\t感谢使用!");
                    }
                    System.out.println("");
                }
                case '3', '2' -> {
                    double amount;
                    String description;
                    if (selection == '3') {
                        System.out.print("\t\t\t\t请输入此次支出的金额: ");
                        amount = keyboard.readInputOfNumber();
                        System.out.print("\t\t\t\t请输入此次支出的备注: ");
                        description = keyboard.readInputOfDescription();
                        details.state.add("支出");
                        if (details.count == 0) {
                            details.balance.add(10000 - amount);
                        } else {
                            details.balance.add(details.balance.get(details.count - 1) - amount);
                        }
                    } else {
                        System.out.print("\t\t\t\t请输入此次收入的金额: ");
                        amount = keyboard.readInputOfNumber();
                        System.out.print("\t\t\t\t请输入此次收入的备注: ");
                        description = keyboard.readInputOfDescription();
                        details.state.add("收入");
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
