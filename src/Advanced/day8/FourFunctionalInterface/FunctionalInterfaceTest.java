package Advanced.day8.FourFunctionalInterface;

/*
本类用于演示函数式接口
四大内置核心函数式接口
消费型接口，有参数无返回值
供给型接口，无参数有返回值
函数型接口，一个参数和返回值
判断型接口，有一个参数，返回值必须为boolean
 */

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
    // 测试消费型接口
    @Test
    public void consumer() {
        // 匿名内部类形式
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer1.accept("Hello");

        // lambda表达式形式
        Consumer<String> consumer2 = s -> System.out.println(s);
        consumer2.accept("World");
    }

    // 测试供给型接口
    @Test
    public void supplier() {
        Supplier<String> supplier1 = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        };
        System.out.println(supplier1.get());

        Supplier<String> supplier2 = () -> "World";
        System.out.println(supplier2.get());
    }

    // 测试函数型接口
    @Test
    public void function() {
        Function<String, Integer> function1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };
        System.out.println(function1.apply("10") + 1);

        Function<String, Integer> function2 = s -> Integer.valueOf(s);
        System.out.println(function2.apply("10" + 2));
    }

    // 测试判断型接口
    @Test
    public void predicate() {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i == 10;
            }
        };
        System.out.println(predicate1.test(20));

        Predicate<Integer> predicate2 = i -> i == 10;
        System.out.println(predicate2.test(10));
    }
}
