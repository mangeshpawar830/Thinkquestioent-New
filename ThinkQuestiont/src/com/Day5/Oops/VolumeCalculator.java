package com.Day5.Oops;

import java.util.Scanner;

public class VolumeCalculator {
	double calVolume;
	double calVolume1;
	
	 double calculateVolume(double radius,double height) {
		 calVolume=3.10*radius*radius*height;
		return calVolume;
	 }
		
	 double calculateVolume(int length,int breadth,int height) {
		calVolume1=length*breadth*height;
		return calVolume;
		
	}
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Choice: ");
			int input=sc.nextInt();
			VolumeCalculator vc=new VolumeCalculator();
		switch(input) {
		case(1):
			System.out.print("Enter the radius: ");
			int radius=sc.nextInt();
			System.out.print("Enter the height: ");
			int height=sc.nextInt();
			vc.calculateVolume(radius, height);
			System.out.println("Volume of the Cylinder is: "+vc.calVolume);
		break;
		case(2):
			System.out.print("Enter the length: ");
		int length=sc.nextInt();
		System.out.print("Enter the breadth: ");
		int breadth=sc.nextInt();
		System.out.print("Enter the height: ");
		int height1=sc.nextInt();
			vc.calculateVolume(length, breadth, height1);
			System.out.println("Volume of the cuboid is: "+vc.calVolume1);
		break;
	}
	
		
	}

}
