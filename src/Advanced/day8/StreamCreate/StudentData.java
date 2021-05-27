package Advanced.day8.StreamCreate;

/*
创建一个集合，保存20个学生对象，学生姓名随机产生，年级随机的[1~6]，分数随机的[0~100]
 */

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    public static List<Student> getList() {
        List<Student> list = new ArrayList<>();
        String[] familyName = {"张", "王", "李", "杨", "罗", "赵", "刘", "韩"};
        String[] firstName = {"伟", "丽", "刚", "龙", "琳", "凤", "丹", "宇", "健", "霞"};
        for (int i = 0; i < 20; i++) {
            int id = i + 1;
            int index1 = (int) (Math.random() * 100) % familyName.length;
            int index2 = (int) (Math.random() * 100) % firstName.length;
            String name = familyName[index1] + firstName[index2];
            int grade = (int) (Math.random() * 6 + 1);
            double score = (int) (Math.random() * 101);
            list.add(new Student(id, name, grade, score));
        }
        return list;
    }
}
