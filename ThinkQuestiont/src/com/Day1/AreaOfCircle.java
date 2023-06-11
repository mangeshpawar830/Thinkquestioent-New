package com.Day1;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.print("Enter the Radius Of circle: ");
Scanner sc=new Scanner(System.in);
int radius=sc.nextInt();
double area;
		
		area=3.14*(radius*radius);
		
		System.out.println("Area of Circle: "+area);
	}

}
