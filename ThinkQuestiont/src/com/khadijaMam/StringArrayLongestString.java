package com.khadijaMam;

public class StringArrayLongestString {
	static String longestString(String arr[]){
		String longest="";
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i].length()>longest.length()) {
					longest=arr[i];
							
				}
					
			}
			return longest;
		}
	
	public static void main(String[] args) {
		String arr[]= {"India","is","beautiful","country"};
		String longest=longestString(arr);
		System.out.println(longest);

}
}
