package restaurant.biz;

import org.junit.Before;
import org.junit.Test;
import restaurant.bean.Dish;
import restaurant.utils.PageModel;

import static org.junit.Assert.*;

/**
 * Created by asus on 2017/5/31.
 */
public class DishServiceTest {
    DishService dishService = null;
    @Before
    public void setUp() throws Exception {
        dishService = new DishService();
    }

    @Test
    public void findDish4PageList() throws Exception {
       PageModel<Dish>  pageModel =  dishService.findDish4PageList(1,4);
        for (int i = 0; i < 4; i++) {
            assertEquals(pageModel.getList().get(i).getDishid() , i+1);
        }

    }

    @Test
    public void getTotalDishs() throws Exception {
        int num = dishService.getTotalDishs();
        assertEquals(7,num);
    }

    @Test
    public void getDish() throws Exception {
        Dish dish = dishService.getDish("1");
        assertEquals("宫爆Java",dish.getDishname());
        Dish dish1 = dishService.getDish("8");
        assertEquals(dish1,null);
    }

}