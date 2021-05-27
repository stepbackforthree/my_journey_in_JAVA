package Advanced.day6.ThreadSynchronized;

public class SellTicket1Test {
    public static void main(String[] args) {
        SellTicket1 sellTicket1 = new SellTicket1();
        Thread thread1 = new Thread(sellTicket1);
        thread1.setPriority(Thread.MIN_PRIORITY);
        Thread thread2 = new Thread(sellTicket1);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();
        Thread thread3 = new Thread(sellTicket1);
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread3.start();
        thread1.start();
    }
}
