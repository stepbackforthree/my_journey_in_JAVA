package Advanced.day8.Lambda;

import org.junit.jupiter.api.Test;

/*
演示lambda表达式第一种形式
lambda表达式省略内容：new Xxxx() 接口中方法的访问类型，返回类型，方法名
lambda表达式只适用于实现一个方法的接口，这种接口被称作函数式接口，拥有两个或以上方法的接口是无法进行推定的
 */

public class LambdaTest1 {
    @Test
    public void lambdaTest1() {
        // 使用匿名内部类实现一个接口
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("in Test1 model 1");
            }
        };
        runnable1.run();

        // lambda表达式形式，lambda是为了实现一个接口
        // Runnable runnable2 = () -> {System.out.println("in Test1 model 2");};
        // 方法体大括号，在方法体只有一句代码的时候是可以省略的
        Runnable runnable2 = () -> System.out.println("in Test1 model 2");
        runnable2.run();
    }

    @Test
    public void lambdaTest2() {
        myInterface1 myInterface1 = new myInterface1() {
            @Override
            public void print() {
                System.out.println("~~~~~~~~~~~~~~~~~~");
            }
        };
        myInterface1.print();

        myInterface1 myInterface2 = () -> System.out.println("================");
    }

    @Test
    public void lambdaTest3() {
        myInterface2 myInterface3 = new myInterface2() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };
        myInterface3.print("Hello World");

        // myInterface2 myInterface4 = (String s) -> System.out.println(s);
        // myInterface2 myInterface4 = (s) -> System.out.println(s); // 省略参数类型
        myInterface2 myInterface4 = s -> System.out.println(s); // 省略参数类型，省略小括号，只有一个参数时才可以使用这种形式
    }

    @Test
    public void lambdaTest4() {
        myInterface3 myInterface5 = new myInterface3() {
            @Override
            public String print(String s, Integer i) {
                return s + i;
            }
        };
        myInterface5.print("Hello World", 10);

        // myInterface3 myInterface6 = (s, i) -> {return s + i;}; // 有两个参数，所以小括号不能省略，参数类型可以省略，return关键字返回值需要有大括号
        myInterface3 myInterface6 = (s, i) -> s + i; // return关键字也可以省略，大括号在return省略的情况下也可以省略
        myInterface6.print("Hello World", 10);
    }
}

@FunctionalInterface
interface myInterface1 {
    public void print();
}

@FunctionalInterface
interface myInterface2 {
    public void print(String s);
}

@FunctionalInterface
interface myInterface3 {
    public String print(String s, Integer i);
}
