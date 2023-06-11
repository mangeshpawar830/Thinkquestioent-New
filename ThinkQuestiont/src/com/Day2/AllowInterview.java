package com.Day2;

import java.util.Scanner;

public class AllowInterview {
	/*to take input from user for percentage and passing year if
	percentage is more than 60 and pass year 2021 then
	allow candidate for interview otherwise reject the 
	candidate using nested if else*/
	
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The Percentage: ");
	double percentage=sc.nextDouble();
	System.out.print("Enter Passing Year: ");
	int passYear=sc.nextInt();
	
	if(percentage>60) {
		if(passYear==2021) {
			System.out.println("Allow For The Interview...");
		}
		else
			System.out.println("Not Allow For Interview");
	}
	else
		System.out.println("Not Allow For Interview");
	
	}		

}
