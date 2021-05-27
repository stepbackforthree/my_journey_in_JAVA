package Advanced.day6.ThreadYieldJoin;

public class MyThreadJoin extends Thread {
    private MyThread myThread;
    public MyThreadJoin(MyThread myThread) {
        this.myThread = myThread;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                try {
                    myThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName() + "第一个线程正在运行~~~~~~~~~~~" + i);
        }
    }
}
