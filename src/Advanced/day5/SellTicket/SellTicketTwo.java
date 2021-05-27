package Advanced.day5.SellTicket;

// 本类用于演示第二种实现Runnable接口的多线程方式
// 三个窗口卖100张票，卖完退出
// 实现Runnable接口的方式由于开启多线程的时候创建多个Thread对象，所以只需要一个自定义线程类对象
// 那么这个自定义线程类对象的普通属性就可以被多个线程同时访问。
// 所以实现Runnable接口的方式更适合多个线程访问同一个数据。

public class SellTicketTwo implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("票已卖完，退出--------------------");
                break;
            }
            System.out.println(Thread.currentThread().getName() + "售票窗口卖出一张票~~~~~当前还剩余：" + (--ticket));
        }
    }
}
