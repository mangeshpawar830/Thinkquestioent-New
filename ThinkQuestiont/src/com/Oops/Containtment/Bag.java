package com.Oops.Containtment;

public class Bag {
	private String brandName;
	private String colour;
	private int price;
	private Pen pen;
	
	public Bag(String brandName,String colour,int price,Pen pen) {
		this.brandName=brandName;
		this.colour=colour;
		this.price =price;
		this.pen=pen;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
	
	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public String toString() {
		return "Bag (BrandName: "+brandName+" colour: "+colour+" price: "+price+") Pen: "+pen;
	}
	
	public static void main(String[] args) {
		Bag bag=new Bag("Targus","black",1800,new Pen("cello","blue",10,new Nib("plastik",5)));
		System.out.println(bag);
		bag.setBrandName("Fastrack");
		bag.setColour("blue");
		
	}

}
