package Advanced.day6.ThreadSleep;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第一个线程正在运行~~~~~~~~~~~~~~" + i);
        }
    }
}
