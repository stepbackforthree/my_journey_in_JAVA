package Advanced.day6.ThreadSynchronized;

public class SellTicket2Test {
    public static void main(String[] args) {
        SellTicket2 sellTicket2 = new SellTicket2();
        new Thread(sellTicket2).start();
        new Thread(sellTicket2).start();
        new Thread(sellTicket2).start();
    }
}
