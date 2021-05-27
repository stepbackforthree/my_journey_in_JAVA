package Advanced.day6.Race;

public class Tortoise extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            if (i % 10 == 0 && i != 0) {
                try {
                    System.out.println("乌龟已跑" + i + "米");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("乌龟已跑完");
    }
}
