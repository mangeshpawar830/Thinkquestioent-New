package com.Day1;

import java.util.Scanner;

public class ConvertDays {
	public static void main(String[] args) {
		System.out.print("Enter Days: ");
		Scanner sc=new Scanner(System.in);
		int days=sc.nextInt();
		
		int year=days/365;
		System.out.print(year+" year, ");
		int rem=days%365;
		int month=rem/30;
		System.out.print(month+" month, ");
		int rem1=rem%30;
		int weeks=rem1/7;
		System.out.print(weeks+" week, ");
		int remDays=rem1%7;
		System.out.print(remDays+" day. ");

		
		
	}

}

