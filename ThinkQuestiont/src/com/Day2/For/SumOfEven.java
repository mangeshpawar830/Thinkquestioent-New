package com.Day2.For;

import java.util.Scanner;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Nth number: ");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			if(num%2==0)
				sum=sum+i;
			
		}
		System.out.println("Sum of Nth Digit: "+sum);
	}

}
