package com.String;

import java.util.Scanner;

public class FrequencyOfCharacter {
	public static void frequency(String abc) {
		int frequency[]=new int[abc.length()];
		char[]ch=abc.toCharArray();
		
		for(int i=0;i<abc.length();i++) {
			frequency[i]=1;
			for(int j=i+1;j<abc.length();j++) {
				if(ch[i]==ch[j]) {
					frequency[i]++;
					ch[j]=0;
				}
			}
		}
		for(int i=0;i<frequency.length;i++) {
			if(ch[i]!=' '&&ch[i]!='0')
				System.out.println(ch[i]+":"+frequency[i]);
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String abc=sc.next();
		FrequencyOfCharacter.frequency(abc);
	}
}