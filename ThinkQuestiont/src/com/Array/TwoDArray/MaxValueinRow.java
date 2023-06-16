package com.Array.TwoDArray;

public class MaxValueinRow {
	
		public static void maxColsValue(int a[][]) {
			for (int i = 0; i < a.length; i++) {
				int max = a[0][i];

				for (int j = 0; j < a[i].length; j++) {
					if (max < a[j][i]) {
						max = a[j][i];
					}

				}
				System.out.println(max);
			}
		}
		public static void main(String[] args) {
			int arr[][] = { { 3, 4, 6 }, { 8, 5, 1 }, { 1, 4, 5 } };
			MaxValueinRow.maxColsValue(arr);
	}

}
