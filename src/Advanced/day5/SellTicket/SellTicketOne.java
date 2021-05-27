package Advanced.day5.SellTicket;

// 本类用于演示继承Thread类的方式实现的多线程
// 三个窗口同时卖票，一共100张，票卖完就退出

public class SellTicketOne extends Thread {
    private static int ticket = 100;
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
