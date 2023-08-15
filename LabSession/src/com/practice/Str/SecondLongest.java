package com.practice.Str;

public class SecondLongest {
	
	public static void secondHighest(String s)
	{
		String str=s.toLowerCase();
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].length()<a[j].length())
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				else if(a[i].length()==a[j].length())
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
				
			}

		}
		System.out.println("Second Highest Length Word is: "+a[1]);
	}

	public static void main(String[] args) {
		
		String s="India is beautiful countary";
		secondHighest(s);

	}

}