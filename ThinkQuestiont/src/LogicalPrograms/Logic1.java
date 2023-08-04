package LogicalPrograms;

import java.util.Scanner;

/*For each element arr[i] in an integer array, Find whether the sum of all the numbers in the array, except for arr[i] is divisible by arr[i] or not.

Input: Integer array of length n
Output: boolean array of length n

Example:-
Input: 2  4  1  9  10

So, For arr[0], which is 2:
Sum of all numbers except 2 = 4+1+9+10 = 24, which is divisible by 2, so outarr[0] = true.
Similarly, For arr[1], which is 4:
Sum of all numbers except 4 = 2+1+9+10 = 22, which is not divisible by 4, so outarr[1] = false.

Overall, the output for this example will be:
True, false, true, false, false*/

public class Logic1 {
	public static void abc(int arr[],boolean brr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			brr[i]=((sum-arr[i])%arr[i]==0);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		boolean brr[]=new boolean[arr.length];
		Logic1.abc(arr,brr);
		for(boolean result:brr) {
			System.out.println(result);
		}
		
	}

}
