package com.Oops.Containtment;

public class Nib {
	private String materialType;
	private int price;
	
	public Nib(String materialType, int price) {
		
		this.materialType = materialType;
		this.price = price;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String toString() {
		return "materialType: " + materialType + ", price: " + price+")";
	}
	
	
	

}
