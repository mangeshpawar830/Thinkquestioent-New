package com.Day2.For;

import java.util.Scanner;

public class SumOfFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact=fact*i;
				
			}
			
			sum=sum+fact;
		}
		System.out.println("Sum of factorial in given range: "+sum);

	}

}
