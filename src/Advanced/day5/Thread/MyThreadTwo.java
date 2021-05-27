package Advanced.day5.Thread;

public class MyThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "线程正在运行~~~~~" + i);
        }
    }
}
