package Advanced.day9.JDBC;

// 演示使用配置文件读取相关信息

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class UtilityProperties {
    public static Connection getConn() throws IOException, ClassNotFoundException, SQLException {
        Connection connection;
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("src/Advanced/day9/JDBC/jdbc.properties")));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
