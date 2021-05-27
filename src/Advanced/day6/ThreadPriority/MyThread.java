package Advanced.day6.ThreadPriority;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "线程正在运行 " + i);
        }
    }
}
