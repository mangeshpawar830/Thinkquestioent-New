package com.exception;

import java.util.Scanner;

public class String1 {
	public static void checkString(String s1) throws InvalidStringException {
		if(!s1.matches("\\d+")) {
			throw new InvalidStringException("String conatians non digit character");
		}
		if(s1.length()<3) {
			throw new InvalidStringException("String length is less than 3");
		}
		
//		int firstThree=Integer.parseInt(s1.substring(0,3));
//		int lastThree=Integer.parseInt(s1.substring(s1.length()-3));
//		
//		if(firstThree+lastThree==0) {
//			throw new InvalidStringException("Invalid resut...");
//		}
		int sumFirstThree=0;
		int sumLastThree=0;
		for(int i=0;i<3;i++) {
			int digit=Character.getNumericValue(s1.charAt(i));
			sumFirstThree=sumFirstThree+digit;
		}
		for(int i=s1.length()-3;i<s1.length();i++) {
			int digit=Character.getNumericValue(s1.charAt(i));
			sumLastThree=sumLastThree+digit;
		}
		if(sumFirstThree+sumLastThree==0) {
	throw new InvalidStringException("Invalid resut...");

		}
		
		
		}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.next();
		try {
			checkString(s1);
			System.out.println("Valid String..");
		}catch(InvalidStringException e) {
		System.out.println("Invalid String.."+e.getMessage());
		}
	

	}
}
