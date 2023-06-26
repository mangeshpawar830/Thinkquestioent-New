package com.exception;

import java.util.Scanner;

public class Number {
	public static boolean checkNumber(int num) {
		String binaryString=String.valueOf(num);
		for(char i:binaryString.toCharArray()) {
			if(i!='0'&&i!='1')
				return false;
		}
		return true;	
	}
	public static int binaryToDecimal(int binary)throws InvalidBinaryNumberException{
		if(!checkNumber(binary)) {
			throw new InvalidBinaryNumberException("Invalid binary number");
		}
		int decimal=0;
		String binaryString=String.valueOf(binary);
		StringBuilder reverse=new StringBuilder(binaryString);
		for(int i=0;i<reverse.length();i++) {
			int digit=reverse.charAt(i)-'0';
			decimal=(int) (decimal+digit*Math.pow(2, i));
		}
		return decimal;
	}
	
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter binary number: ");
		int num=sc.nextInt();
		int decimalNumber=binaryToDecimal(num);
		System.out.println("Decimal Number: "+decimalNumber);
		}catch(InvalidBinaryNumberException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
