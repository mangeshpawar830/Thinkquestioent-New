package com.Day2;

import java.util.Scanner;

public class NumLessThan50 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		
		if(num<50)
			System.out.println("Number is Less than 50");
		else
			System.out.println("Number is Not Less than 50");
	}
		
	

}
