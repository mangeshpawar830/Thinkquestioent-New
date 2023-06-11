package com.Oops.Polymorphism;

public class AreaOfAll {
	public void area(int radius) {
		double areaOfCircle=3.14*(radius*radius);
		System.out.println("Area Of Circle: "+areaOfCircle);
		
	}
	public void area(int base,int height) {
		double areaOfTriangle=0.5*base*height;
		System.out.println("Area Of Triangle: "+areaOfTriangle);
		
	}
	public void area(double length,double width) {
		double areaOfRectangle=length*width;
		System.out.println("Area Of Rectangle: "+areaOfRectangle);
	}
	public void area(double side) {
		double areaOfSquare=side*side;
		System.out.println("Area Of Square: "+areaOfSquare);
		
	}
	public static void main(String[] args) {
		AreaOfAll a=new AreaOfAll();
		a.area(5);
		a.area(5, 6);
		a.area(5.6, 6.5);
		a.area(6.6);
	}


}
