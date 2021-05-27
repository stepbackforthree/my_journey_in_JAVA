package Advanced.day6.ThreadWaitNotify;

public class ThreadWaitNotify implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (this) {
                this.notify();
                System.out.println(Thread.currentThread().getName() + "线程正在打印" + i);
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (this) {
            this.notify();
        }
    }
}
