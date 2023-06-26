package com.Array;

public class Nearest {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 5, 6, 8, 1, 9 };

		int target=7;

	
		int idx = 0;
		int dist = Math.abs(arr[0] - target);//8

		for (int i = 1; i< arr.length; i++) {
			int cdist = Math.abs(arr[i] - target);
                        
			if (cdist < dist) {  //1 5  3
				idx = i;
				dist = cdist;
			}
		}

		System.out.println(arr[idx]);
	}

	}
