package Advanced.day6.ThreadPriority;

// setPriority设置一个线程的优先级，这个参数必须是1-10之间的整数。可以使用三个常量MAX_PRIORITY(10)，MIN_PRIORITY(1)，NORM_PRIORITY(5)
// getPriority获取一个线程的优先级
// setName设置一个线程的名字，结果由getName获得。

public class ThreadPriorityTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("线程优先级测试");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.setPriority(Thread.NORM_PRIORITY);
        myThread.setPriority(3);
        myThread.start();
    }
}
