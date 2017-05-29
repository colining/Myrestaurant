package restaurant.dao;



import restaurant.bean.User;

import java.util.ArrayList;

public class UserDAOImpl extends baseDAO implements UserDAO {

	@Override
	public ArrayList<User> findUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findUser(User user) {
		//通过使用别名来寻找到set方法，取代了大写首字母的方式
		String sql = "SELECT userid Userid,username Username" +
				",password Password ,createdate Createdate from user WHERE username = ? AND password = ?";
		Object[] params = {user.getUsername(), user.getPassword()};
		if (findObj(sql, params,User.class)==null){
			return false;
		}
		return true;
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
