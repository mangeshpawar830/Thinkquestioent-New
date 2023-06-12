package com.khadijaMam;

public class DuplicateElemetsInString {
	
	public void dupliacte(String arr[]) {
	
		for(int i=0;i<arr.length;i++) {
			boolean isPresent=false;
			int count=1;
			for(int j=i-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					isPresent=true;
					break;
				}
			}
			if(isPresent==false) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i]==arr[k])
						count++;
					
				}
				if(count>1)
					System.out.print(arr[i]+" ");
				
				
			}
		}
	
	}
	
	public static void main(String[] args) {
		String arr[]= {"india","is","beutiful","country","india","is","historical","place"};
		DuplicateElemetsInString ds=new DuplicateElemetsInString();
		ds.dupliacte(arr);
	}
	

}
