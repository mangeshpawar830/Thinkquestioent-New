package com.Day3.While;

import java.util.Scanner;

public class SumOfDigit {
	//find digit of sum from the number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum Of Digit is: "+sum);
	}

}
