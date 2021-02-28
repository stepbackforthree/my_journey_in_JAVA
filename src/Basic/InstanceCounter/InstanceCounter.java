package InstanceCounter;

import java.util.Scanner;

public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; i++) {
            new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
        String st = "abc";
        String sr = "def";
        System.out.print(st.concat(sr));
        StringBuffer str = new StringBuffer("www.");
        int [][] nums = new int[2][];
        nums[0] = new int[2];
        nums[1] = new int[3];

        Scanner s = new Scanner(System.in);
        Byte i = s.nextByte();
        System.out.print(i);
    }
}
