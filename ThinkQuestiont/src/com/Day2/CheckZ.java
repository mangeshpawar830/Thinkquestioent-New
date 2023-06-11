package com.Day2;

import java.util.Scanner;

public class CheckZ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch=sc.next().charAt(0);
		
		if(ch=='z')
			System.out.println("Correct");
		else
			System.out.println("Not Correct");
	
	}

}
