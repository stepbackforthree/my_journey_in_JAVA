package Advanced.day5.RandomPrint;

import java.util.Random;

public class RandomPrint extends Thread {
    private boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (flag) {
            System.out.println("随机打印100以内的整数：" + random.nextInt(101));
        }
    }
}
