package com.Day2;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
				||ch=='A'||ch=='E'||ch=='I'||ch=='U'||ch=='O')
			System.out.println("Vowel");
		else
			System.out.println("consonant");
	}

}
