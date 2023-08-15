package com.practice.Str;

public class ToogleCase {
	
	public static void changeCase(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				if(c[i+1]>='a' || c[i+1]<='z')
				{
					c[i+1]=(char) (c[i+1]-32);
				}
			}
			else
			{
				if(c[0]>='a' && c[0]<='z')
				{
					c[0]=(char) (c[0]-32);
				}
			}
			System.out.print(c[i]);
		}
	}

	public static void main(String[] args) {
		
		String s="india is beautiful country";
		changeCase(s);

	}

}
