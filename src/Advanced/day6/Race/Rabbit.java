package Advanced.day6.Race;

public class Rabbit extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i+= 10) {
            if (i % 10 == 0 && i != 0) {
                try {
                    System.out.println("兔子已跑" + i + "米");
                    Thread.sleep(10000);
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
        System.out.println("兔子已跑完");
    }
}
