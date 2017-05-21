package restaurant.utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
	private static String drivername;
	private static String url;
	private static String username;
	private static String password;
//	private static DataSource myds = new MyDataSource();
	private static DataSource myds = null;
	private JDBCUtils(){
		
	}
	static{
//		Context ic;
//		try {
//			ic = new InitialContext();
//			myds = (DataSource)ic.lookup("java:comp/env/jdbc/test");
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	 	
//		InputStream in = JDBCUtils.class.getClassLoader().
//				getResourceAsStream("dbconfig.properties");
		InputStream in = JDBCUtils.class.getClassLoader().
				getResourceAsStream("dbcpconfig.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			myds = BasicDataSourceFactory.createDataSource(prop);
//			drivername = prop.getProperty("drivername");
//			url = prop.getProperty("url");
//			username = prop.getProperty("username");
//			password = prop.getProperty("password");
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
	}

	/**
	 * 建立数据库连接
	 * 
	 * @return
	 */
//	public static void main(String[] args) {
//		Connection connection = getConnection();
//		System.out.println(connection.toString());
//	}
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = myds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
//		Connection conn = null;
//		try {
//			Class.forName(drivername);
//			conn =  DriverManager.getConnection(url, username, password);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return conn;
	}
	public static void main(String[] args) {
		int i = 10;
		while (i > 0) {
			Connection connection = getConnection();
			System.out.println(connection.hashCode());
			i--;

		}
	}
	/**
	 * 释放资源
	 * 
	 * @param rs
	 * @param ps
	 * @param conn
	 */

	public static void free(ResultSet rs, PreparedStatement ps, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
