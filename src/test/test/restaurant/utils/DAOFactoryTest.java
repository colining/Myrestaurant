package restaurant.utils;

import org.junit.Test;
import restaurant.dao.DishDAO;
import restaurant.dao.DishDAOImpl;
import restaurant.dao.UserDAO;
import restaurant.dao.UserDAOImpl;

import static org.junit.Assert.*;

/**
 * Created by asus on 2017/5/31.
 */
public class DAOFactoryTest {
    @Test
    public void newInstance() throws Exception {
        Object newInstance = DAOFactory.newInstance("DishDAO");
        assertTrue(newInstance instanceof DishDAOImpl);
        assertFalse(newInstance instanceof UserDAOImpl);

        Object newInstance2 = DAOFactory.newInstance("UserDAO");
        assertTrue(newInstance2 instanceof UserDAOImpl);
        assertFalse(newInstance2 instanceof DishDAOImpl);




    }
}