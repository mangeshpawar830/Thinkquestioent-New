package com.practice.Str;

public class SameContainCharacter {
	
	public static void displaySameCharacter(String s,String s1)
	{

		String sameChar="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					sameChar=sameChar+s.charAt(i)+" ";
					break;
				}
			}
		}
		System.out.println(sameChar);
	}

	public static void main(String[] args) {
		
		String s="javascript";
		String s1="java";
		displaySameCharacter(s, s1); 

	}

}