package com.Day1;

import java.util.Scanner;

public class ConvertTemp {
	public static void main(String[] args) {
		
	
	System.out.print("Enter Temparature in Celcius: ");
	Scanner sc=new Scanner(System.in);
	double tempCelcius=sc.nextInt();
	
	
	double fahrenheit=((tempCelcius*9)/5)+32;  
	
	System.out.println("Converted Temparature in Fahrenheit is: "+fahrenheit);

}
}
