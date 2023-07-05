package com.JDBC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingUsingScanner {
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\ThinkQuestiont\\Assignment_loops2.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());

		}
	}

}
