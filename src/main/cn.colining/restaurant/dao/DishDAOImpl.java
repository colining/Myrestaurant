package restaurant.dao;


import restaurant.bean.Dish;

import java.util.ArrayList;

public class DishDAOImpl extends baseDAO implements DishDAO {

	@Override
	public Dish findDishByID(String dishid) {
		String sql = "select dishid Dishid ,name Dishname,price Price,description Dishdesc,img Img from dish where dishid= ?";
		Object[] params= {dishid};
		return (Dish)this.findObj(sql, params, Dish.class);
	}

	@Override
	public ArrayList<Dish> findDishes() {
		String sql = "select dishid Dishid,name Dishname,price Price,description Dishdesc,img Img from dish";
		return this.findObjs(sql, null,Dish.class);
	}

	@Override
	public int insertDish(Dish dish) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Dish> findDishes(String strsql, Object[] params) {
		return findObjs(strsql,params,Dish.class);
	}

	@Override
	public int getTotalDishs(String strsql) {
		return getTotalRecords(strsql);
	}

}
