package com.Day2;

import java.util.Scanner;

public class DivisibleBy3Or9 {
	//to check given number is divisible by 3 or 9
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		
		if(num%3==0 || num%9==0)
			System.out.println("Number is Divisible..");
		else
			System.out.println("Number is not Divisible..");
	}


}
