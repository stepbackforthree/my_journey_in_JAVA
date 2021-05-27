package Advanced.day8.StreamCreate;

// 本类用于演示如何获取Stream流

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreateTest {
    @Test
    public void listStream() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        Stream<Student> stream1 = stream.filter(t -> t.getName().charAt(0) == '王');
        stream1.forEach(System.out::println);
    }

    @Test
    public void arrayStream() {
        Integer[] nums = {20, 30, 34, 67, 54};
        Stream<Integer> stream = Arrays.stream(nums);
        stream.forEach(System.out::println);
    }

    // 从散列数据中获取Stream
    @Test
    public void hashStream() {
        Stream<String> stream = Stream.of("a", "b", "c", "d");
        stream.forEach(System.out::println);
    }

    // 无限流
    @Test
    public void infiniteStream() {
        Stream<Double> stream = Stream.generate(Math::random);
        stream.forEach(System.out::println);
    }
}
