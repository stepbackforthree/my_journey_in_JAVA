package Advanced.day5.StopThread;

public class StopThread extends Thread {
    private boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println("演示通知的方式退出一个线程~~~~~~~~~~~~~~~~~~");
        }
    }
}
