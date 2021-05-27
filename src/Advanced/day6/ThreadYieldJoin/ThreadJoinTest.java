package Advanced.day6.ThreadYieldJoin;

public class ThreadJoinTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThreadJoin myThreadJoin = new MyThreadJoin(myThread);
        myThreadJoin.start();
    }
}
