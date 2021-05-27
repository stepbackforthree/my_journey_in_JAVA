package Advanced.day8.StreamOperation;

// 本类用于演示Stream流操作

import Advanced.day8.StreamCreate.Student;
import Advanced.day8.StreamCreate.StudentData;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationTest {

    // filter方法接收一个判断器Predicate(), 判断器返回boolean，实现这个判断器的时候，写出一个条件，满足返回true，不满足返回false
    // 流会留下符合条件（返回true）的记录，过滤掉不符合条件（返回false）的记录
    @Test
    public void filter() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
//        Stream<Student> stream1 = stream.filter(t -> t.getName().charAt(0) == '王' && t.getScore() > 60);
//        stream1.forEach(System.out::println);
        stream.filter(t -> t.getScore() > 60).filter(t -> t.getName().charAt(0) == '王').forEach(System.out::println);
    }

    // 过滤重复记录，distinct过滤重复记录需要hashCode和equals方法，distinct过滤重复记录的方式和HashSet一样
    @Test
    public void filterDuplication() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        stream.distinct().forEach(System.out::println);
    }

    // 截断流，使元素的数量不超过参数
    @Test
    public void cutOff() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        stream.limit(5).forEach(System.out::println);
    }

    // 跳过流，使得元素跳过参数个数据
    @Test
    public void skip() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        // stream.skip(10).forEach(System.out::println); // 单独使用skip方法
        stream.skip(10).limit(5).forEach(System.out::println);
    }

    // 映射流
    @Test
    public void map() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        stream.map(t -> t.getName() + ": " + t.getScore()).forEach(System.out::println);
    }

    // 排序
    @Test
    public void sorted() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        // 使用sorted没有参数的方法，按照元素的自然排序方式排序
        // stream.sorted().forEach(System.out::println);
        // 使用sorted有一个比较器参数的方法，可以按照比较器的排序规则排序
        stream.sorted((t1, t2) -> (int) (t2.getScore() - t1.getScore())).forEach(System.out::println);
    }

    // 以下为流的终结操作
    // 统计流中的元素数
    @Test
    public void count() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        long l = stream.filter(t -> t.getScore() > 60).count();
        System.out.println(l);
    }

    // 返回所有匹配记录
    @Test
    public void allMatch() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        boolean flag = stream.allMatch(t -> t.getScore() > 60);
        System.out.println(flag);
    }

    // 返回符合条件的第一条记录
    @Test
    public void firstMatch() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        Optional<Student> optionalStudent = stream.filter(t -> t.getScore() > 60).findFirst();
        System.out.println(optionalStudent);
    }

    // 求所有同学的总分
    @Test
    public void sumScore() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();
        Optional<Double> optionalDouble = stream.map(t -> t.getScore()).reduce((t1, t2) -> t1 + t2);
        System.out.println(optionalDouble.orElse(-1.0));
    }

    // 流的收集，将流中操作的数据转换成集合
    @Test
    public void collect() {
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.parallelStream();
        List<Student> list1 = stream.filter(t -> t.getScore() > 60).collect(Collectors.toList());
        for (Student student : list1) {
            System.out.println(student);
        }
    }
}
