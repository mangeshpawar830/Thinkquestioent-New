package com.ArrayOfObject;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		Car car[]=new Car[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car details: ");
		for(int i=0;i<car.length;i++) {
			System.out.print("Enter the model number: ");
			int modelNo=sc.nextInt();
			System.out.print("Enter the model name: ");
			String modeName=sc.next();
			System.out.print("Enter the price: ");
			long price=sc.nextLong();
			car[i]=new Car(modelNo,modeName,price);
		}
		System.out.println("---Display car Details----");
		for(int i=0;i<car.length;i++) {
			System.out.println(car[i]);
		}
		System.out.println("-----------between 1 lakh to 7 lakh-----");
		for(int i=0;i<car.length;i++) {
			if(car[i].price>=100000&&car[i].price<=700000)
				System.out.println(car[i]);
		}
	}

}
