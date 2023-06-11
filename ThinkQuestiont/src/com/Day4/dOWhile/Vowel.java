package com.Day4.dOWhile;

//to check given character is vowel or consonant using switch


import java.util.Scanner;

public class Vowel {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter The Character: ");
			char ch=sc.next().charAt(0);
			int choice;
			
			do {
			switch(ch) {
			case('a'):System.out.println("Vowel");
			break;
			case('e'):System.out.println("Vowel");
			break;
			case('i'):System.out.println("Vowel");
			break;
			case('o'):System.out.println("Vowel");
			break;
			case('u'):System.out.println("Vowel");
			break;
			case('A'):System.out.println("Vowel");
			break;
			case('E'):System.out.println("Vowel");
			break;
			case('I'):System.out.println("Vowel");
			break;
			case('O'):System.out.println("Vowel");
			break;
			case('U'):System.out.println("Vowel");
			break;
			default:System.out.println("Consonant..");
			break;
			}
			System.out.print("We want more operation: ");
			choice=sc.nextInt();
			}while(choice==0||choice==1);
		
	}

	}



