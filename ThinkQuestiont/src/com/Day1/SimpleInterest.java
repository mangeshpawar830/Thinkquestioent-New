package com.Day1;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle: ");
		int p=sc.nextInt();
		System.out.print("Enter Rate Of Interest: ");
		int r=sc.nextInt();
		System.out.print("Enter Time Period: ");
		int t=sc.nextInt();
		
		
		int simpleInterest=(p*t*r)/100;
		
		System.out.println("Simple Interest is: "+simpleInterest);
	}

}
