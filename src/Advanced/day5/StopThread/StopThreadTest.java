package Advanced.day5.StopThread;

public class StopThreadTest {
    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        stopThread.start();

        for (int i = 0; i < 100; i++) {
            if (i == 35) {
                // 通知的方式停止线程
                System.out.println("发送停止通知，停止一个线程");
                stopThread.setFlag(false);
                break;
            }
            System.out.println(Thread.currentThread().getName() + "线程中的代码~~~~~~~~~" + i);
        }
    }
}
