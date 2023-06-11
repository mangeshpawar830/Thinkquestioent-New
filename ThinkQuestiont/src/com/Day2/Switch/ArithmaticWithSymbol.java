package com.Day2.Switch;

import java.util.Scanner;

public class ArithmaticWithSymbol {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2=sc.nextInt();
		System.out.println("+.Addition\t -.Substraction\t *.Multipliacation\t /.Division");
		System.out.print("Enter the Input: ");
		char input=sc.next().charAt(0);
		
		switch(input) {
		case('+'):System.out.println("Addition: "+(num1+num2));
		break;
		case('-'):System.out.println("Substraction: "+(num1-num2));
		break;
		case('*'):System.out.println("Multipliacation: "+(num1*num2));
		break;
		case('/'):System.out.println("Division: "+(num1/num2));
		break;
		default:System.out.println("Please Enter Valid Input..");
		
		
		}

}
}
