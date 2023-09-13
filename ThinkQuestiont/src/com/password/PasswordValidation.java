package com.password;

import java.util.Scanner;

public class PasswordValidation {
	public static void valid(String str) {
		String regex="^(?=.*[a-zA-Z])(?=.*\\d)$";
	
}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		PasswordValidation.valid(str);
	}

}
