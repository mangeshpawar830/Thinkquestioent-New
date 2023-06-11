package com.Oops.Containtment;

public class Hotel {
	private int id;
	private String hotelName;
	private Menu menuItem;
	
	public Hotel(int id,String hotelName,Menu menuItem) {
		this.id=id;
		this.hotelName=hotelName;
		this.menuItem=menuItem;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Menu getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(Menu menuItem) {
		this.menuItem = menuItem;
	}
	
	public String toString() {
		return "id: "+id+" Hotel name: "+hotelName+" menuItem: "+menuItem;
	}
	
	public static void main(String[] args) {
		Hotel hotel=new Hotel(11,"Orchid",new Menu(12,"MuttonHandi",750));
		System.out.println(hotel.toString());
	}
	

}
