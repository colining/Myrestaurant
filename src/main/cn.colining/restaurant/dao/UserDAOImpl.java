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
		String sql = "SELECT * from user WHERE username = "+'"'+user.getUsername()+'"'+" AND password = "+'"'+user.getPassword()+'"';
		if (findObj(sql, User.class)==null){
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
