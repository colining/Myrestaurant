package restaurant.biz;

import org.junit.Before;
import org.junit.Test;
import restaurant.bean.User;

import static org.junit.Assert.*;

/**
 * Created by asus on 2017/5/21.
 */
public class UserServiceTest {


    UserService userService = null;
    User user = null;
    @Before
    public void setUp() throws Exception {
         userService = new UserService();
         user = new User();
        user.setUsername("apple");
        user.setPassword("1234");

    }

    @Test
    public void validateUser() throws Exception {
        assertTrue(userService.validateUser(user));
        user.setPassword("123");
        assertFalse(userService.validateUser(user));
    }

}