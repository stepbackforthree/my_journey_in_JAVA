package Advanced.day6.ThreadDaemon;

// setDaemon(true)设置一个线程为守护线程，这个守护线程会在它守护的主线程结束后，结束自己这个线程。

public class ThreadDaemonTest {
    public static void main(String[] args) {
        MyThreadDaemon myThreadDaemon = new MyThreadDaemon();
        myThreadDaemon.setDaemon(true); // 设置该线程为守护线程，由哪个线程创建的该线程，这个守护线程就守护创建它的线程。
        myThreadDaemon.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "主线程正在运行=============" + i);
        }
    }
}
