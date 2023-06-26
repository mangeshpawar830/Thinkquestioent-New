package com.main;

import java.util.Scanner;

import org.junit.Test;

import com.DAO.CalculatorImplementation;


public class CalculatorMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CalculatorImplementation c=new CalculatorImplementation();
		char ch;
		do {
			
			System.out.print("Enter first number: ");
			int num1=sc.nextInt();
			System.out.print("Enter second number: ");
			int num2=sc.nextInt();
			System.out.println("Enter the choice: ");
			System.out.println("1.Addition\n2.Sustraction\n3.Multiplication\n4.division");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				c.add(num1, num2);
				break;
			case 2:
				c.sub(num1, num2);
				break;
			case 3:
				c.mul(num1, num2);
				break;
			case 4:
				c.div(num1, num2);
				break;
			default:
				System.out.println("Invalid Input..");
			}
			System.out.print("Do you want continue: ");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}
