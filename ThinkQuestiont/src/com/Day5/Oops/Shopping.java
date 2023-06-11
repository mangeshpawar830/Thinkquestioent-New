package com.Day5.Oops;

/*create a shopping class which has product id, p.name, quantity, price per item, create
first method to accept the product details second method to calculate bill
if quantity is 0 or less than 0 then show error message otherwise calculate the bill
third method to display product details with total bill */

public class Shopping {
	int productId;
	String productName;
	int quantity;
	int price;
	int bill;
	
	public void acceptDetails(int apid,String apname,int aquantity,int aprice) {
		productId=apid;
		productName=apname;
		quantity=aquantity;
		price=aprice;
	}
	
	public void calBill() {
		if(quantity>0)
			bill=quantity*price;
		
	}
	
	public void display() {
		if(quantity>0) {
		System.out.println("productId: "+productId);
		System.out.println("productName: "+productName);
		System.out.println("productId: "+quantity);
		System.out.println("totalBill: "+bill);
		}else
			System.out.println("Error...");
	}
	
	public static void main(String[] args) {
		Shopping sp=new Shopping();
		sp.acceptDetails(1, "FaceWash", 0, 100);
		sp.calBill();
		sp.display();
		
	}

}
