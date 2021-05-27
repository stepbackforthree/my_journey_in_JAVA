package Advanced.day9.JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

/*
本类用于演示PreparedStatement
PreparedStatement有占位符，占位符可以使得拼接sql不需要断开，使用占位符占位，然后再填充占位符参数
PreparedStatement在执行sql语句之前有一个预编译动作，可以提高sql执行效率
以后一律使用PreparedStatement代替Statement
 */

public class PreparedStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学员名：");
        String name = input.next();
        System.out.println("请输入生日：");
        String birthday = input.next();
        System.out.println("请输入性别：");
        String gender = input.next();

        try {
            // 不使用Utility的状态
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studb?user=root&password=&useUnicode=true&characterEncoding=utf-8");

            // 使用Utility的状态
            // Connection connection = Utility.getConn();

            // 使用读取配置文件UtilityProperties的状态
            // Connection connection = UtilityProperties.getConn();

            // 使用德鲁伊连接池获取连接的方式
            Connection connection = ConnectionPoolDruid.getConn();

            // String sql = "INSERT INTO stuinfo VALUES(7, ?, ?, NULL, ?, 1008, 3)";
            String sql = "UPDATE studb.stuinfo SET stuname = ?, borndate = ?, gender = ? WHERE id = 7";
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql); // PreparedStatement创建对象时就需要给出sql语句
            preparedStatement.setString(1, name); // 填充占位符的值，问号从sql语句左侧开始查，第一个问号的索引为1，以此类推
            preparedStatement.setString(2, birthday);
            preparedStatement.setString(3, gender);
            int index = preparedStatement.executeUpdate(); // 执行sql语句时无参数
            if (index == 1) {
                System.out.println("成功");
            } else {
                System.out.println("失败");
            }
            // 不使用Utility的状态
//            preparedStatement.close();
//            connection.close();
            // 使用Utility的状态
            Utility.closeAll(connection, preparedStatement, null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
