package Advanced.day6.ThreadDeadLock;

public class Negotiation extends Thread {
    private boolean flag;
    private Criminal criminal;
    private Victim victim;

    public Negotiation(boolean flag, Criminal criminal, Victim victim) {
        this.flag = flag;
        this.criminal = criminal;
        this.victim = victim;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (criminal) {
                criminal.say();
                synchronized (victim) {
                    criminal.get();
                }
            }
        } else {
            synchronized (victim) {
                victim.say();
                synchronized (criminal) {
                    victim.get();
                }
            }
        }
    }
}
