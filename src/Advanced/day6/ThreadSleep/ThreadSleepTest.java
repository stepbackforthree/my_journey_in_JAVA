package Advanced.day6.ThreadSleep;

// sleep()线程的休眠，有一个long参数，代表休眠的毫秒数，该方法会让当前线程处于休眠或线程阻塞状态
// interrupt()方法唤醒沉睡线程，唤醒沉睡线程时会抛出一个InterruptedException异常。

public class ThreadSleepTest {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
