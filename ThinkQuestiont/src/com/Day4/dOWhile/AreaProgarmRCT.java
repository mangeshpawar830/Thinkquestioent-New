package com.Day4.dOWhile;

import java.util.Scanner;

//write code to calculate area of rectangle,circle,triangle,
//square,using menu driven program-do while and switch

public class AreaProgarmRCT {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	char choice;
	do {
	System.out.println("1.A.Rectangle\n2.A.Circle\n3.A.Triangle\n4.A.Square");
	int input=sc.nextInt();
	
	switch(input) {
	case(1):
		System.out.print("Enter the length of rectangle: ");
		int length=sc.nextInt();
	    System.out.print("Enter the width of rectangle: ");
	    int width=sc.nextInt();
	    int areaOfRectangle=length*width;
	    System.out.println("Area Of Rectangle: "+areaOfRectangle);
	    break;
	case(2):
		System.out.print("Enter the radius of circle: ");
		int radius=sc.nextInt();
		double areaOfCircle=3.14*(radius*radius);
		System.out.println("Area of Circle is: "+areaOfCircle);
		break;
	case(3):
		System.out.print("Enter the base of triangle: ");
		double base=sc.nextDouble();
		System.out.print("Enter the height of circle: ");
		double height=sc.nextDouble();
		double areaOfTriangle=1/2*(base*height);
		System.out.println("Enter the area of circle: "+areaOfTriangle);
		break;

	case(4):
		System.out.print("Enter the side of square: ");
		int side=sc.nextInt();
		int areaOfSquare=side*side;
		System.out.println("Area Of Square: "+areaOfSquare);
		break;
	default:
		System.out.println("Invalid input");
		break;

	}
	System.out.print("Want to perform operation? (y or n): ");  
	choice = sc.next().charAt(0);
	sc.nextLine();
	}while(choice=='y'||choice=='Y');
	}
	


}