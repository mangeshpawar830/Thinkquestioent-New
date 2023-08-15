package com.practice;

import java.util.Scanner;

public class OutOfRangeException {
	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("enter any number: ");
	int num=sc.nextInt();
	
		try {
			if (num>=1 && num<=999) {
				
				System.out.println("correct number");
			}
			else
			{
				throw new OutOfRangeeException("number is not between 1 to 999");
			}
		} 
		catch (OutOfRangeeException a)
		{
			System.out.println(a.getMessage());
		}
	}
		
	}