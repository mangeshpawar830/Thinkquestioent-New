package com.Day2.For;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}
