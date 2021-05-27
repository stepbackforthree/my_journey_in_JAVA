package Advanced.day6.ThreadDeadLock;

public class ThreadDeadLockTest {
    public static void main(String[] args) {
        Criminal criminal = new Criminal();
        Victim victim = new Victim();
        Negotiation negotiation1 = new Negotiation(true, criminal, victim); // 罪犯开始工作
        Negotiation negotiation2 = new Negotiation(false, criminal, victim); // 受害者开始工作
        negotiation1.start();
        negotiation2.start();
    }
}
