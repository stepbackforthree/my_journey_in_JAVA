package Advanced.day6.ThreadYieldJoin;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + "第二个线程正在运行~~~~~~~~~~~" + i);
        }
    }
}
