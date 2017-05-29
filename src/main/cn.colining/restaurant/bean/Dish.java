package restaurant.bean;

import com.sun.deploy.uitoolkit.ui.DialogHook;

public class Dish {
	private int dishid;
	private String dishname;
	private String dishdesc;
	private String img;
	private double price;
	
	public int getDishid() {
		return dishid;
	}
	public void setDishid(int dishid) {
		this.dishid = dishid;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public String getDishdesc() {
		return dishdesc;
	}
	public void setDishdesc(String dishdesc) {
		this.dishdesc = dishdesc;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public boolean equals(Object obj) {
			Dish dish = (Dish)obj;
			return this.getDishid() == dish.getDishid();
	}
}
