package com.Day5.Oops;

import java.util.Scanner;

public class AllPrograms {
	Scanner sc=new Scanner(System.in);
	

	
	public void areaOfcircle() {
		System.out.print("Enter Radius Of Circle: ");
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		System.out.println("Area Of Circle: "+area);
	}
	
	public void areaOfrectangle() {
		System.out.print("Enter area Of length: ");
		int length=sc.nextInt();
		System.out.print("Enter the width: ");
		int width=sc.nextInt();
		int area=length*width;
		System.out.println("Area of rectangle: "+area);
	}
	public void daysYear() {
		System.out.print("Enter Days: ");
		int days=sc.nextInt();
		int year=days/365;
		int rem=days%365;
		int month=rem/30;
		int rem1=month%30;
		int week=rem1/7;
		int day=rem1%7;
		System.out.println(year+"years, "+month+"month, "+week+"weeks, "+day+"days");
	}
	
	public static void main(String[] args) {
		AllPrograms ap=new AllPrograms();
		ap.areaOfcircle();
		ap.areaOfrectangle();
		ap.daysYear();
		
		}

}
