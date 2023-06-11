package com.Day1;

import java.util.Scanner;

public class SwapUsingThird {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2=sc.nextInt();
		int num3;
		
		System.out.println("Before Swap: ");
		System.out.println(num1+" "+num2);
		
		num3=num1+num2;
		num1=num3-num1;
		num2=num3-num2;
		
		System.out.println("After swap: ");
		System.out.println(num1+" "+num2);
		
	}

}
