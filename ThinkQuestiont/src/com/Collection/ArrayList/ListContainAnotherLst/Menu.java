package com.Collection.ArrayList.ListContainAnotherLst;

import java.util.ArrayList;

public class Menu {
	int menuId;
	String menuName;
	ArrayList<MenuItem>list;
	
	public Menu(int menuId, String menuName, ArrayList<MenuItem> list) {
		this.menuId = menuId;
		this.menuName = menuName;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", list=" + list + "]";
	}
	
	
	
	
	
	

}
