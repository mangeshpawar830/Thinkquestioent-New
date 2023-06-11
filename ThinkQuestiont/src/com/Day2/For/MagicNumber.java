package com.Day2.For;

import java.util.Scanner;

public class MagicNumber {
	public static void main(String[] args) {
		int magicNumber=53;
		Scanner sc=new Scanner(System.in);
		
		for(;;) {
			System.out.print("Enter the number: ");
			int num=sc.nextInt();

			if(num>magicNumber) {
				System.out.println("Number is Greter..");
				continue;
			}
			else if(num<magicNumber) {
				System.out.println("Number is smaller..");
				continue;
			}
			else {
				System.out.println("Correct Number..");
				break;
			}
			
		
		}
	}

}
