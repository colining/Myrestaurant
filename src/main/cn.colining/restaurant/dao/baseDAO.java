package restaurant.dao;



import restaurant.utils.JDBCUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;

public class baseDAO {
	public ArrayList findObjs(String sql, Class clazz) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList objs = new ArrayList();
		try {
			connection = JDBCUtils.getConnection();
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Object obj = mappingObj(rs, clazz);              //这里取结果集就厉害了；来什么取什么
				objs.add(obj);
			}
			JDBCUtils.free(rs, ps, connection);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return objs;
	}

	public Boolean findObj(String sql) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ResultSet resultSet = null;
		try {
			connection = JDBCUtils.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			if (resultSet != null) {
				return true;
			}
			JDBCUtils.free(resultSet,preparedStatement,connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	private Object mappingObj(ResultSet rs, Class clazz) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//实例化映射对象
		Object obj = clazz.newInstance();
		//获取映射对象的方法
		Method[] methods = clazz.getMethods();
		//获取结果集中元数据信息
		ResultSetMetaData meta = rs.getMetaData();
		// 按字段数目循环结果集中记录，进行对象映射
		System.out.println(meta.getColumnCount());
		for (int i = 1; i <= 4; i++) {
			// 构造当前列的set方法名称
			String columnLabel = meta.getColumnLabel(i);
			String methodName = "set" + columnLabel;
			System.out.println(methodName);
			// 循环查找同名方法，并通过反射调用该方法，设置属性
			for (Method method : methods) {
				if (method.getName().equals(methodName)) {
					System.out.println(methodName + "find");
					method.invoke(obj, rs.getObject(i));
					break;
				}
			}
		}
		return obj;
	}
}
