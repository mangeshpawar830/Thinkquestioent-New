package com.Day2.For;

import java.util.Scanner;

public class PrimeNumberRange {
	public void prime(int num1,int num2) {
		int count=0;
		for(int i=num1;i<=num2;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
			else
				count=0;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		PrimeNumberRange pr=new PrimeNumberRange();
		pr.prime(num1,num2);
		
	}

}
