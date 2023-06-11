package com.Day2.For;

import java.util.Scanner;

public class SumOfFL {
	//to find sum of first digit and last digit from the number

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int firstDigit=0;
		int lastDigit=num%10;
		
		while(num!=0) {
			firstDigit=num%10;
			num=num/10;
			
		}
		System.out.println("Sum Of First Digit & Last Digit in Number: "+(firstDigit+lastDigit));
		
		
		
	}

}
