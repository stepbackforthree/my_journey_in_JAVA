package Advanced.day5.SellTicket;

public class SellTicketTwoTest {
    public static void main(String[] args) {
        SellTicketTwo sellTicketTwo = new SellTicketTwo();
        new Thread(sellTicketTwo).start();
        new Thread(sellTicketTwo).start();
        new Thread(sellTicketTwo).start();
    }
}
