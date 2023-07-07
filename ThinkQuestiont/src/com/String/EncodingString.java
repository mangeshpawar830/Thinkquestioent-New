package com.String;

public class EncodingString {
	public static void main(String[] args) {
		String str="hello world";
		int shift=1;
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch==' ') {
				sb.append('#');
			}
			else {
			char encode=(char) (ch+shift);
			sb.append(encode);
			}
		}
		System.out.println(sb);
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		
	}
	

}
