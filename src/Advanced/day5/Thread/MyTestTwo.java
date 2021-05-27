package Advanced.day5.Thread;

// 本类用于测试第二种实现多线程的方法
// 由于Runnable接口只有run一个方法，所以实现Runnable接口的这种方法，线程类本身没有start方法
// 但是必须要调用start方法才能开启多线程，所以需要创建Thread类的对象，把我们的线程类作为参数传递给构造方法。
// 当传参创建出来的Thread对象去调用start方法的时候，运行的是参数这列的run方法。

public class MyTestTwo {
    public static void main(String[] args) {
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        Thread thread = new Thread(myThreadTwo);
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "线程正在运行=====" + i);
        }
    }

}
