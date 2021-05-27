package Advanced.day6.ThreadSynchronized;

// 本类采用synchronized代码块处理线程安全问题

public class SellTicket1 implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            // synchronized同步代码块，被代码块括中的内容，在一个线程没有执行完所有代码的时候，其他线程是无法执行这段代码的。
            // 担任锁对象这个对象必须保证所有的线程用的是同一个锁对象，普通方法的锁对象通常就是this。
            synchronized (this) {
                if (ticket <= 0) {
                    System.out.println("票已卖完，退出");
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "售票窗口卖出一张票，当前剩余：" + (--ticket));
            }
        }
    }
}
