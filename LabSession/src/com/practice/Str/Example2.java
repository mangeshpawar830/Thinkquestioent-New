package com.practice.Str;

import java.util.Iterator;

public class Example2 {
	public static void reverse(String str) {
		String []abc=str.split(" ");
		String rev=" ";
		for (int i = 0; i<abc.length;i++) {
			for(int j=abc[i].length()-1;j>=0;j--) {
				rev=rev+abc[i].charAt(j);
			}
			rev=rev+" ";
			
		}
		System.out.println(rev);
		
	}
	
	public static void main(String[] args) {
		String str="java programming language";
		Example2.reverse(str);
		
	}

}
