package com.String;

public class DuplicateCharacterString {
	static void duplicate(String str) {
		char ch[]=str.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++) {
			count=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j])
					count++;
			}
			if(count>0)
				System.out.println(ch[i]);
		}
		
		
	}
	public static void main(String[] args) {
		String str="java";
		DuplicateCharacterString.duplicate(str);
	}

}
