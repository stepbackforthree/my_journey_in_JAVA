package Advanced.day5.Thread;

// 本类用于测试自定义线程类

public class MyTestOne {
    public static void main(String[] args) {
        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "线程正在运行=====" + i);
        }
    }
}
