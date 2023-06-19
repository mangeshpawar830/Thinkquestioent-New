package com.exception;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			System.out.println(arr[10]);
		
		}
		catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception..");
	}
		catch(Exception e) {
			System.out.println("Exception parent..");
		}
		System.out.println("All done");
		
	
		
		
	}

}