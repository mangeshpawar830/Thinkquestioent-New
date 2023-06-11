package com.Day3.While;

import java.util.Scanner;

public class DisarumNumber {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num=sc.nextInt();
	int  digit=0,sum=0;
	
	int n=num;
	while(n>0) {
		digit++;
		n=n/10;

	}
	n=num;
	while(n>0) {
		int rem=n%10;
		sum=sum+(int)Math.pow(rem, digit);
		n=n/10;
		digit--;
	}
	if(num==sum)
		System.out.println("Disarum Number..");
	else
		System.out.println("Not Disarum Number");
	}
}
