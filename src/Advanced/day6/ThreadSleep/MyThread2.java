package Advanced.day6.ThreadSleep;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第二个线程正在运行=============" + i);
        }
    }
}
