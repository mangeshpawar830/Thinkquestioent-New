package com.factory.DesignPattern;

public class FactoryClass {
	
		 public OperatingSystem getInstance(String s)
		 {
			 
			 if(s.equalsIgnoreCase("Android"))
				 return new Android();
			 else 
			    return new Windows();
		 }
		
			
		

	
	

}
