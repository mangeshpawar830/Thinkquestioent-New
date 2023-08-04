package com.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mysql.cj.protocol.a.BinaryRowFactory;

public class BufferReaderConsole {
	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		File f1=new File("D:\\ThinkQuestiontNew\\File Handling\\bc.txt");
		if(f1.exists()) {
			f1.createNewFile();
		}
		FileWriter fw=new FileWriter(f1,true);
		System.out.println("Enter data(Enter stop to finish)");
		String data="";
		//String output="";
		while(!(data.equalsIgnoreCase("stop"))) {
			data=bf.readLine();
			fw.write(data);
			fw.write("\n");
			//output=output.concat(data);
			//output=output.concat("\n");
			
		}
		System.out.println("------------");
		//System.out.println(output);
		bf.close();
		fw.close();
	}

}
