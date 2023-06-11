package com.Day2;

import java.util.Scanner;

public class CheckNumberPN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		
		if(num>0)
			System.out.println("positive number");
		else if(num<0)
			System.out.println("negative number");
		else
			System.out.println("zero");
		
	}

	
}
