package com.main;
import java.util.Scanner;

import com.bean.Vehicle;
import com.bean.VehicleType;
import com.dao.VehicleServiceManager;

public class ServiceMain {

    public static void main(String[] args) {
        VehicleServiceManager manager = new VehicleServiceManager();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("==== Vehicle Service Management System ====");
            System.out.println("1. Add a new vehicle");
            System.out.println("2. Remove a vehicle");
            System.out.println("3. Display all vehicles");
            System.out.println("4. Search for a vehicle");
            System.out.println("5. Record service history for a vehicle");
            System.out.println("6. Display service history for a vehicle");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                case 1:
                    
                	 Vehicle newVehicle = createVehicleFromUserInput(scanner);
                     manager.addVehicle(newVehicle);
                     System.out.println("Vehicle added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the ID of the vehicle to remove: ");
                    int vehicleId = scanner.nextInt();
                    scanner.nextLine(); 
                    break;
                case 3:
                    manager.displayAllVehicles();
                    break;
                case 4:
                    System.out.print("Enter the make, model, or type to search for: ");
                    String searchQuery = scanner.nextLine();
                    break;
                case 5:
                    System.out.print("Enter the ID of the vehicle for service history: ");
                    int serviceVehicleId = scanner.nextInt();
                    scanner.nextLine(); 
                    break;
                case 6:
                    System.out.print("Enter the ID of the vehicle to display service history: ");
                    int historyVehicleId = scanner.nextInt();
                    scanner.nextLine(); 
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }

	private static Vehicle createVehicleFromUserInput(Scanner scanner) {
		 System.out.print("Enter vehicle make: ");
	        String make = scanner.nextLine();

	        System.out.print("Enter vehicle model: ");
	        String model = scanner.nextLine();

	        System.out.print("Enter vehicle type (CAR, TRUCK, MOTORCYCLE): ");
	        String typeString = scanner.nextLine();
	        VehicleType type = VehicleType.valueOf(typeString.toUpperCase());

	        System.out.print("Enter vehicle year: ");
	        int year = scanner.nextInt();

	        System.out.print("Enter vehicle mileage: ");
	        int mileage = scanner.nextInt();
	        System.out.println("Enter the id: ");
	        int id = scanner.nextInt();

	        return new Vehicle(id, make, model, type, year, mileage);
	    
	
	}

	
}
