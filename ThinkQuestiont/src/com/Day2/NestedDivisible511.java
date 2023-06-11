package com.Day2;

import java.util.Scanner;

public class NestedDivisible511 {
	//to check number is divisible by 5 and 11

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		
		if(num%5==0) {
			if(num%11==0) {
				System.out.println("Divisible Number");
			}
			else
				System.out.println("Not Divisible");
		}
		else
			System.out.println("Not Divisible");
		
	}

}
