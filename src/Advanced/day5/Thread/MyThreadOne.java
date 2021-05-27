package Advanced.day5.Thread;

public class MyThreadOne extends Thread {
    // 需要我们使用多线程运行的代码就写在run方法中
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "线程正在运行~~~~~" + i);
        }
    }
}
