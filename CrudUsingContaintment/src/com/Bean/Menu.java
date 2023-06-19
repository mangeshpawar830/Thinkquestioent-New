package com.Bean;

public class Menu {
	public int mId;
	public String menuName;
	public int price;
	
	public Menu(int mId,String menuName,int price) {
		this.mId=mId;
		this.menuName=menuName;
		this.price=price;
	}
	public String toString() {
		return"menu: menuId:"+ mId+", menuName:"+menuName+", menuPrice:"+price+"]";
	}

}
