package restaurant.biz;


import restaurant.bean.User;
import restaurant.dao.UserDAO;
import restaurant.utils.DAOFactory;

public class UserService {
    public static void main(String[] args) {
        User user = new User("apple", "1234");
        UserService userService = new UserService();
        System.out.println(userService.validateUser(user));
    }

    public boolean validateUser(User user) {
        //去DB中查找指定用户名和口令的用户
//		UserDAO userdao = new UserDAOImpl();
        UserDAO userdao = (UserDAO) DAOFactory.newInstance("UserDAO");
        return userdao.findUser(user);
    }
}
