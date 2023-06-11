package com.khadijaMam;

import java.util.Scanner;

public class ArithmeticOperations {
	
	    public int add(int num1, int num2) {
	        return num1 + num2;
	    }

	    public int subtract(int num1, int num2) {
	        return num1 - num2;
	    }

	    public int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    public double divide(double num1, double num2) {
	        if (num2 != 0) {
	            return num1 / num2;
	        } else {
	            throw new ArithmeticException("Cannot divide by zero.");
	        }
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        ArithmeticOperations operations = new ArithmeticOperations();
	        System.out.print("Enter 1st number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter 2nd number: ");
	        int num2 = sc.nextInt();
	        int sum = operations.add(num1, num2);
	        System.out.println("Sum: " + sum);

	       
	        int difference = operations.subtract(num1, num2);
	        System.out.println("Difference: " + difference);

	       
	        int product = operations.multiply(num1, num2);
	        System.out.println("Product: " + product);

	  
	        double quotient = operations.divide(num1, num2);
	        System.out.println("Quotient: " + quotient);
	    }
	


}
