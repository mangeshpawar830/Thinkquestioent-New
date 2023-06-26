package com.String;


public class Anagram {

	public static void main(String[] args) {
		String s="Silent";//keep eilnst
		String s1="listln";//Anagram string  eilnst
		int flag=0;
		int count=0,count1=0;
		//s=eilnst
		//s1=eilnst
		
		String str1=s.toLowerCase();
		
		String str2=s1.toLowerCase();
		
		
	char arr[]=	str1.toCharArray();
	char  arr1[]=str2.toCharArray();
	
	/*for(int i=0;i<arr.length;i++)
	{
		arr[i]=(char) ((char)arr[i]+32);
	}*/
		
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j]) {
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=i+1;j<arr1.length;j++)
		{
			if(arr1[i]>arr1[j]) {
				char temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
		}
	}
	System.out.println("-----");
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	
	//eilnst
	//illnst
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==arr1[i])
		{
			count++;
			
		}
	}
	System.out.println(count);

	
	
	
	
	if( count==arr1.length )
	{
		System.out.println("Anagram");
	}
	else
		System.out.println("not");
	
		
	}

}

