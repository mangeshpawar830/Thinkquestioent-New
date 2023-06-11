package com.Day2;

import java.util.Scanner;

public class AlphabateDS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character: ");
	    char ch=sc.next().charAt(0);
	    
	    if(ch>='a'&& ch<='z' || ch>='A'&&ch<='Z')
	    	System.out.println("Alphabate");
	    else if(ch>='0'&&ch<='9')
	    	System.out.println("Digit");
	    else
	    	System.out.println("Special Symbol");
	}

}
