package com.Oops.Containtment;

public class Menu {
	private int mId;
	private String menuName;
	private int price;
	
	public Menu(int mId,String menuName,int price){
		this.mId=mId;
		this.menuName=menuName;
		this.price=price;
	}
	
	public void setMid(int mId) {
		this.mId=mId;
	}
	public int getMid() {
		return mId;
	}
	public void setMenuname(String menuName) {
		this.menuName=menuName;
	}
	public String getMenuname() {
		return menuName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "menuId: "+mId+" menuName: "+menuName+" price: "+price;
	}


}
