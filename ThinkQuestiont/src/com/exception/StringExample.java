package com.exception;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name=sc.next();
		
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(i))
				System.out.println();
		}
	}

}
