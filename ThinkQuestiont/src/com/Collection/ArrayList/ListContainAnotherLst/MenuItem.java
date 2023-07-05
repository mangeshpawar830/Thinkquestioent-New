package com.Collection.ArrayList.ListContainAnotherLst;

public class MenuItem {
	int miId;
	String miName;
	int miPrice;
	
	
	public MenuItem(int miId, String miName, int miPrice) {
		this.miId = miId;
		this.miName = miName;
		this.miPrice = miPrice;
	}


	@Override
	public String toString() {
		return "MenuItem [miId=" + miId + ", miName=" + miName + ", miPrice=" + miPrice + "]";
	}
	
	
	
	
	

}
