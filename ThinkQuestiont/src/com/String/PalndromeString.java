package com.String;

import java.util.Scanner;

public class PalndromeString {
	public static void isPalindrome(String s1) {
		String rev="";
	for(int i=s1.length()-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	}
	if(s1.equals(rev)) 
		System.out.println("Palindrome string..");
	else 
		System.out.println("Not Palindrome string...");
	
	
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s1=sc.next();
		PalndromeString.isPalindrome(s1);
		
	}

}
