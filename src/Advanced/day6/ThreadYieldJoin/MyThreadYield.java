package Advanced.day6.ThreadYieldJoin;

public class MyThreadYield extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                Thread.yield();
            }
            System.out.println(this.getName() + "第一个线程正在运行~~~~~~~~~~~" + i);
        }
    }
}
