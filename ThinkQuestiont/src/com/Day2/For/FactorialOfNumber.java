package com.Day2.For;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of number is: "+fact);
	}

}
