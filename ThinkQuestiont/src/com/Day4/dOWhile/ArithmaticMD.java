package com.Day4.dOWhile;

import java.util.Scanner;

public class ArithmaticMD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		do {
		System.out.print("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2=sc.nextInt();
		System.out.println("1.Addition\t 2.Substraction\t 3.Multipliacation\t 4.Division");
		System.out.print("Enter the Input: ");
		int input=sc.nextInt();
		
		switch(input) {
		case(1):System.out.println("Addition: "+(num1+num2));
		break;
		case(2):System.out.println("Substraction: "+(num1-num2));
		break;
		case(3):System.out.println("Multipliacation: "+(num1*num2));
		break;
		case(4):System.out.println("Division: "+(num1/num2));
		break;
		default:System.out.println("Please Enter Valid Input..");
		}
		System.out.println("We want perform operation(y/n): ");
		choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');
		
		}
	
	

}
