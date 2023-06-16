package com.Array.TwoDArray;

public class RowWiseSum {
	public static void rowSum(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
				System.out.print(a[i][j] + " ");
			}

			System.out.print("  sum=" + sum);
			System.out.println();
		}
	}

	

	public static void main(String[] args) {
		int arr[][] = { { 3, 4, 6 }, { 8, 5, 1 }, { 1, 4, 5 } };

		RowWiseSum.rowSum(arr);

	}



}
