package LogicalPrograms;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binary = convertDecimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binary);
    }

    public static String convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryBuilder = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryBuilder.insert(0, remainder); // Insert the remainder at the beginning of the StringBuilder
            decimalNumber = decimalNumber / 2;
        }

        return binaryBuilder.toString();
    }
}

