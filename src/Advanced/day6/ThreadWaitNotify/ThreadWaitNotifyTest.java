package Advanced.day6.ThreadWaitNotify;

public class ThreadWaitNotifyTest {
    public static void main(String[] args) {
        ThreadWaitNotify threadWaitNotify = new ThreadWaitNotify();
        new Thread(threadWaitNotify).start();
        new Thread(threadWaitNotify).start();
    }
}
