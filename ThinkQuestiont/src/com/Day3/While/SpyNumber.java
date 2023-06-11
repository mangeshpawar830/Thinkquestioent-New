package com.Day3.While;

import java.util.Scanner;

public class SpyNumber {
	//write code to check the given number is spy or not-
	//number digit sum and digit multiplication are same are called spy number

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int mul=1;
		
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			mul=mul*digit;
			num=num/10;
		}
		if(sum==mul)
			System.out.println("Spy Number..");
		else
			System.out.println("Not a Spy Number");
	}

}
