package com.Day2.Switch;

import java.util.Scanner;

public class EvenOddSwitch {
	//to check number odd or even using switch case

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		
		switch(num%2) {
		case(0):System.out.println("even number");
		break;
		default:System.out.println("odd number");
		
		}
		
	}

}
