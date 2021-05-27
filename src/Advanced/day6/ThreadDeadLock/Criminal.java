package Advanced.day6.ThreadDeadLock;

public class Criminal implements People {
    @Override
    public void say() {
        System.out.println("你先给我赎金，我就放人质");
    }

    @Override
    public void get() {
        System.out.println("得到赎金");
    }
}
