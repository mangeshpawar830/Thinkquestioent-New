package com.khadijaMam;

public class EqualParts {
	static void equal(String abc,int n) {
		int length=abc.length();
		int part=length/n;
		for(int i=0;i<length;i++) {
			if(i%part==0)
				System.out.println();
			System.out.print(abc.charAt(i));
		}
		
		
	}
	public static void main(String[] args) {
		String abc="aaaabbbbcccc";
		int n=4;
		EqualParts.equal(abc,n);
	}

}
