package restaurant.dao;


import restaurant.bean.Dish;

import java.util.ArrayList;

public interface DishDAO {
	
	public Dish findDishByID(String dishid);
	
	public ArrayList<Dish> findDishes();
	
	public int insertDish(Dish dish);

}
