package restaurant.dao;



import restaurant.bean.User;

import java.util.ArrayList;

public interface UserDAO {
	public ArrayList<User> findUsers();
	public boolean findUser(User user);
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(User user);

}
