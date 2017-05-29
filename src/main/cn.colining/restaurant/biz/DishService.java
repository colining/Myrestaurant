package restaurant.biz;


import restaurant.bean.Dish;
import restaurant.dao.DishDAO;
import restaurant.utils.DAOFactory;
import restaurant.utils.PageModel;

import java.util.ArrayList;

public class DishService {
	private DishDAO dishdao;

	public DishDAO getDishdao() {
		return dishdao;
	}

	public void setDishdao(DishDAO dishdao) {
		this.dishdao = dishdao;
	}
	
	/**
	 * @param pageNO
	 * @param pageSize
	 * @return
	 */
	public PageModel<Dish> findDish4PageList(int pageNO, int pageSize){
		dishdao = (DishDAO) DAOFactory.newInstance("DishDAO");
		String strsql = "select dishid Dishid,name Dishname,img Img,price Price from dish limit ?,?";
		int actualpageNO = (pageNO-1)*pageSize;
		Object[] params = {actualpageNO,pageSize};
		ArrayList<Dish> dishlist = dishdao.findDishes(strsql, params);
		PageModel<Dish> pagemodel = new PageModel<Dish>(pageSize,pageNO,getTotalDishs(),dishlist);
		return pagemodel;

	}
	
	public int getTotalDishs(){
		dishdao = (DishDAO) DAOFactory.newInstance("DishDAO");
		String strsql = "select count(*) from dish";
		return dishdao.getTotalDishs(strsql);
	}

	public Dish getDish(String s) {
		dishdao = (DishDAO) DAOFactory.newInstance("DishDAO");
		return dishdao.findDishByID(s);
	}
	
}
