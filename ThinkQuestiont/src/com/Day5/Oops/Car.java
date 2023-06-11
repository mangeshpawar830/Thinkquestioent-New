package com.Day5.Oops;

public class Car {
	int modelNumber;
	String carName;
	long carPrice;
	public static void main(String[] args) {
		Car cr1=new Car();
		cr1.modelNumber=11;
		cr1.carName="BMW";
		cr1.carPrice=500000;
		
		Car cr2=new Car();
		cr2.modelNumber=12;
		cr2.carName="Fortuner";
		cr2.carPrice=1000000;
		
		Car cr3=new Car();
		cr3.modelNumber=13;
		cr3.carName="Creata";
		cr3.carPrice=6000000;
		

		System.out.println(cr1.modelNumber+" "+cr1.carName+" "+cr1.carPrice);;
		System.out.println(cr2.modelNumber+" "+cr2.carName+" "+cr2.carPrice);;
		System.out.println(cr3.modelNumber+" "+cr3.carName+" "+cr3.carPrice);;

		
	}

}
