package FreshJuiceTest;

class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println("");
        System.out.println(juice.size);
    }
}
