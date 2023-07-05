package com.String;

import java.util.Scanner;

public class PassWordProgram {
	public static void checkPassword(String str[]) {
		char ch[];
		for(int i=0;i<str.length;i++) {
			String str2=str[i];
			ch=str2.toCharArray();
		}
			
		
		
	
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password: ");
		String str[]=new String[3];
		for(int i=0;i<str.length;i++) {
			str[i]=sc.nextLine();
		}
		PassWordProgram.checkPassword(str);
	}

}
