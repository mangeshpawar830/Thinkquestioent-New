package LogicalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class NthLowestNumber {
	public static void findNthLowest(int arr[],int nth) {
		int nthsmallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
		}
		System.out.println(arr[nth-1]);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the nth element: ");
		int nth=sc.nextInt();
		NthLowestNumber.findNthLowest(arr,nth);
		
	}

}
