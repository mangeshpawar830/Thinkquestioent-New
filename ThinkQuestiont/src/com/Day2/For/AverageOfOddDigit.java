package com.Day2.For;

import java.util.Scanner;

public class AverageOfOddDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0,count=0;
		
		
		while(num>0) {
			int digit=num%10;
			if(digit%2!=0) {
				count++;
			sum=sum+digit;
			}
			num=num/10;
		}
		double average=sum/count;
		System.out.println("Average of Odd Digit in Number is: "+average);
	}

}
