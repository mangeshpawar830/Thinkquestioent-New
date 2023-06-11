package com.Day3.While;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base=sc.nextInt();
		System.out.print("Enter the index: ");
		int index=sc.nextInt();
		int power=1;
		while(index!=0) {
		power=power*base;
		--index;
		}
		
		System.out.println("Power is: "+power);
	}

}
