package com.Day3.While;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		
		while(num>0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(sum==temp)
			System.out.println("ArmStrong Number..");
		else
			System.out.println("Not a Armstrong Number..");
	}


}
