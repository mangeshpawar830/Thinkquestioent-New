package com.main;

import java.util.Scanner;
import com.DAO.CalculatorImplementation;
import com.DAO.CalculatorDetails;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorDetails c = new CalculatorImplementation();
        char ch;
        do {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int sum = c.add(num1, num2);
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    int diff = c.sub(num1, num2);
                    System.out.println("Result: " + diff);
                    break;
                case 3:
                    int product = c.mul(num1, num2);
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    int quotient = c.div(num1, num2);
                    System.out.println("Result: " + quotient);
                    break;
                default:
                    System.out.println("Invalid Input..");
            }
            System.out.print("Do you want to continue (Y/N): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        sc.close();
    }
}
