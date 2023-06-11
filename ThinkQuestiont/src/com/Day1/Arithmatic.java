package com.Day1;

import java.util.Scanner;

public class Arithmatic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2=sc.nextInt();
		int result;
		
		result=num1+num2;
		System.out.println("Addition Of Number: "+result);
		result=num1-num2;
		System.out.println("Substraction of Number: "+result);
		result=num1*num2;
		System.out.println("Multiplication of Number: "+result);
		result=num1/num2;
		System.out.println("Division of Number: "+result);
		
	}

}
