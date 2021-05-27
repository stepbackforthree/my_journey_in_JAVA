package Advanced.day6.ThreadDaemon;

public class MyThreadDaemon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("守护线程正在运行~~~~~~~~~~~");
        }
    }
}
