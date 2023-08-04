package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example1 {
	public void read(File f) {
		try {
		if(f.exists()) {
			FileInputStream fi=new FileInputStream(f);
			int i;
			int sum=0;
			while((i=fi.read())!=-1) {
				if(i>='0'&&i<='9') {
					sum=sum+i-48;
				}

			}
			System.out.print(sum);

			fi.close();
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void Write(File f) {
		try {
		if(!f.exists()) {
			f.createNewFile();
			String data="Hello java programming 88";
			FileOutputStream fout=new FileOutputStream(f);
			byte arr[]=data.getBytes();
			fout.write(arr);
			System.out.println("data added");
			fout.close();
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		File f=new File("D:\\ThinkQuestiontNew\\File Handling\\afc.txt");
		Example1 e1=new Example1();
		//e1.Write(f);
		e1.read(f);

		
	}

}
