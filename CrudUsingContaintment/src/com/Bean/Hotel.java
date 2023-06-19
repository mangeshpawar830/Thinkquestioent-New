package com.Bean;


public class Hotel {
	public int id;
	public String hotelName;
	public Menu menuItem;
	
	public Hotel(int id,String name,Menu menuItem) {
		this.id=id;
		this.hotelName=hotelName;
		this.menuItem=menuItem;
		
	}
	public String toString() {
		return "Hotel d:"+id+", Hotel Name:"+hotelName+" ["+menuItem;
	}

}
