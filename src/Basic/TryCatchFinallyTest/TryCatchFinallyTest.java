package TryCatchFinallyTest;

import java.util.Locale;

public class TryCatchFinallyTest {
    @org.junit.jupiter.api.Test
    public void Test1() {
        System.out.println("aaa");
        try {
            String a = "bbb";
            int[] b = new int[2];
            System.out.println(a.toUpperCase(Locale.ROOT));
            System.out.println(b[2] );
        } catch (NullPointerException e) {
            System.out.println("try again");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Another type of error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("There is some error");
        }
        System.out.println("ccc");
    }
}
