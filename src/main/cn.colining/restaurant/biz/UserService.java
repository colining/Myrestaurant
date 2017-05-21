package restaurant.biz;


import restaurant.bean.User;
import restaurant.dao.UserDAO;
import restaurant.utils.DAOFactory;

public class UserService {
    public boolean validateUser(User user) {
        UserDAO userdao = (UserDAO) DAOFactory.newInstance("UserDAO");
        return userdao.findUser(user);
    }
}
