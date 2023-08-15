package com.factory.DesignPattern;

import java.util.Scanner;

public class FactoryMain {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter the options ");
				System.out.println("1. Windows\n2. Android");
					String option=sc.next();
					FactoryClass fc=new FactoryClass();
					OperatingSystem os=fc.getInstance(option);
					if(os==null)
					{
						System.out.println("No data found...");
					}
					else
					{
	
						System.out.println("Specifications......");
						os.specification();
						System.out.println("Features..");
						os.features();
	
}


	}

}
