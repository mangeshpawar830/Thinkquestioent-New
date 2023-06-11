package com.Oops.Containtment;

public class Pen {
	private String penName;
	private String colour;
	private int price;
	private Nib nib;
	
	public Pen(String penName, String colour, int price,Nib nib) {
		this.penName = penName;
		this.colour = colour;
		this.price = price;
		this.nib=nib;
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}

	
	public String toString() {
		return "(penName: " + penName + ", colour: " + colour + ", price: " + price+") Nib: ("+nib;
	}
	
	

}
