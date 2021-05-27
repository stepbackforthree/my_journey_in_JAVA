package Advanced.day9.JDBC;

// 本类用于演示连接数据库的例子

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.stream.Stream;

public class ConnectDB {
    public static void main(String[] args) {
        try {
            // 第一步，加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 第二步，获取Connection链接对象，必须是java.sql包下的Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployees?user=root&password=&useUnicode=true&characterEncoding=utf-8");
            // 第三步，编写sql语句
            String sql = "SELECT employee_id, first_name, last_name, salary FROM employees";
            // 第四步，创建Statement对象
            Statement statement = connection.createStatement();
            // 执行sql语句，并且返回结果
            ResultSet resultSet = statement.executeQuery(sql);
            // 第六步，遍历resultSet对象
            System.out.println("员工编号\t员工名\t员工姓\t工资");
            while (resultSet.next()) {
                Integer empId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                Double salary = resultSet.getDouble("salary");
                System.out.println(empId + "\t" + firstName + "\t" + lastName + "\t" + salary);
            }
            // 第七步，关闭连接
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
