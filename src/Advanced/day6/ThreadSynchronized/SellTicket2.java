package Advanced.day6.ThreadSynchronized;

// 本类采用synchronized方法处理线程安全问题

public class SellTicket2 implements Runnable {
    private int ticket = 100;
    private boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            sellTicket();
        }
    }

    // 线程安全的方法，synchronized的方法相当于将一个synchronized代码块的开始和方法的开始一起，结束和方法的结束一起。
    // synchronized的方法的锁对象就是this
    public synchronized void sellTicket() {
        if (ticket <= 0) {
            System.out.println("票已卖完，退出");
            flag = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "售票窗口卖出一张票，当前剩余：" + (--ticket));
    }
}
