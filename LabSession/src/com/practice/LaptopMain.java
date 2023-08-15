package com.practice;

public class LaptopMain {
	public static void main(String[] args) {
		Laptop lp=new Laptop();
		lp.setbName("dell");
		lp.setPrice(50000);
		lp.setPrinter(new Printer());
		lp.getP().setPrinterName("lenovo");
		lp.getP().setSpecification("all..");
		lp.getP().setPrice(20000);
		
		System.out.println(lp.getbName()+" "+lp.getPrice()+" "+lp.getP().getPrinterName()+" "+lp.getP().getSpecification()+" "+lp.getP().getPrice());
	}

}
