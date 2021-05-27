package Advanced.day6.ThreadDeadLock;

public class Victim implements People {
    @Override
    public void say() {
        System.out.println("你先给我人质，我就给赎金");
    }

    @Override
    public void get() {
        System.out.println("得到人质");
    }
}