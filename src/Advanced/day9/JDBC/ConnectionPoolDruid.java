package Advanced.day9.JDBC;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

// 本类用于演示使用数据库连接池的效果
// DBCP 阿帕奇的产品
// C3P0 个人产品
// Druid 阿里巴巴的产品

public class ConnectionPoolDruid {
    public static Connection getConn() throws SQLException {
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/studb");
        ds.setUsername("root");
        ds.setPassword("");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

        ds.setInitialSize(10);//默认值0，应该在maxActive和minIdle之间
        ds.setMaxActive(20);//默认值8
        ds.setMinIdle(1);//默认值0
        //maxIdle是Druid为了方便DBCP用户迁移而增加的，maxIdle是一个混乱的概念。连接池只应该有maxPoolSize和minPoolSize，druid只保留了maxActive和minIdle，分别相当于maxPoolSize和minPoolSize。
        ds.setMaxIdle(5);

        // 	获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。
        ds.setMaxWait(1000);

        //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        ds.setTimeBetweenEvictionRunsMillis(60000);

        //配置一个连接在池中最小生存的时间，单位是毫秒
        ds.setMinEvictableIdleTimeMillis(300000);

        //是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。
        ds.setPoolPreparedStatements(true);
        // 	要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。在Druid中，不会存在Oracle下PSCache占用内存过多的问题，可以把这个数值配置大一些，比如说100
        ds.setMaxPoolPreparedStatementPerConnectionSize(10);
        //配置多个英文逗号分隔
        //通过别名的方式配置扩展插件，常用的插件有： 监控统计用的filter:stat日志用的filter:log4j防御sql注入的filter:wall
        ds.setFilters("stat,wall");

        return ds.getConnection();
    }
}


