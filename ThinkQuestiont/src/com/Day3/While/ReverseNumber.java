package com.Day3.While;

import java.util.Scanner;

public class ReverseNumber {
	//reverse a number
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num=sc.nextInt();
			int reverse=0;
			
			while(num>0) {
				int digit=num%10;
				reverse=reverse*10+digit;
				num=num/10;
			}
			System.out.println("Reverse Number: "+reverse);
		}


}
