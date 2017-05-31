package restaurant.utils;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * Created by asus on 2017/5/31.
 */
public class JDBCUtilsTest {
    Connection connection = null;

    @Test
    public void getConnection() throws Exception {
        connection = JDBCUtils.getConnection();
        //最多获取5个数据库连接
        for (int i = 0; i < 4; i++) {
            Connection testconnection = JDBCUtils.getConnection();
            System.out.println(testconnection.hashCode());
        }
        assertTrue(connection != null);
    }

    @Test
    public void free() throws Exception {
        JDBCUtils.free(null, null, connection);
        //数据库连接释放
        assertTrue(connection == null);
    }

}