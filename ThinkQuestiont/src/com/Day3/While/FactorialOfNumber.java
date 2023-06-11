package com.Day3.While;

import java.util.Scanner;

	public class FactorialOfNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num=sc.nextInt();
			
			int fact=1;
			int i=1;
			while(i<=num) {
				fact=fact*i;
				i++;
			}
			System.out.println("Factorial of number is: "+fact);
		}

}
