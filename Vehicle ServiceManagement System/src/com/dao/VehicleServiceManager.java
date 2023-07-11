package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.bean.ServiceRecord;
import com.bean.Vehicle;
import com.bean.VehicleType;

public class VehicleServiceManager {
	  private List<Vehicle> vehicles;
	  private List<ServiceRecord> serviceRecords;
	  
	  public VehicleServiceManager() {
	       this.vehicles = new ArrayList<>();
	       this.serviceRecords = new ArrayList<>();
	  }
	   public List<Vehicle> getVehicles() {
	        return vehicles;
	    }
	  
	   public void addVehicle(Vehicle vehicle) {
	        vehicles.add(vehicle);
	    }
	   public void removeVehicle(Vehicle vehicle) {
	        vehicles.remove(vehicle);
	    }

	    public void displayAllVehicles() {
	        for (Vehicle vehicle : vehicles) {
	            System.out.println("ID: " + vehicle.getId());
	            System.out.println("Make: " + vehicle.getMake());
	            System.out.println("Model: " + vehicle.getModel());
	            System.out.println("Type: " + vehicle.getType());
	            System.out.println("Year: " + vehicle.getYear());
	            System.out.println("Mileage: " + vehicle.getMileage());
	            System.out.println("---------------------------");
	        }
	    }
	    public void searchByMake(String make) {
	        for (Vehicle vehicle : vehicles) {
	            if (vehicle.getMake().equalsIgnoreCase(make)) {
	                System.out.println("ID: " + vehicle.getId());
	                System.out.println("Make: " + vehicle.getMake());
	                System.out.println("Model: " + vehicle.getModel());
	                System.out.println("Type: " + vehicle.getType());
	                System.out.println("Year: " + vehicle.getYear());
	                System.out.println("Mileage: " + vehicle.getMileage());
	                System.out.println("---------------------------");
	            }
	        }
	    }
	    public void searchByModel(String model) {
	        for (Vehicle vehicle : vehicles) {
	            if (vehicle.getModel().equalsIgnoreCase(model)) {
	                System.out.println("ID: " + vehicle.getId());
	                System.out.println("Make: " + vehicle.getMake());
	                System.out.println("Model: " + vehicle.getModel());
	                System.out.println("Type: " + vehicle.getType());
	                System.out.println("Year: " + vehicle.getYear());
	                System.out.println("Mileage: " + vehicle.getMileage());
	                System.out.println("---------------------------");
	            }
	        }
	    }
	    public void searchByType(VehicleType type) {
	        for (Vehicle vehicle : vehicles) {
	            if (vehicle.getType() == type) {
	                System.out.println("ID: " + vehicle.getId());
	                System.out.println("Make: " + vehicle.getMake());
	                System.out.println("Model: " + vehicle.getModel());
	                System.out.println("Type: " + vehicle.getType());
	                System.out.println("Year: " + vehicle.getYear());
	                System.out.println("Mileage: " + vehicle.getMileage());
	                System.out.println("---------------------------");
	            }
	        }
	    }
	    public void addServiceRecord(ServiceRecord serviceRecord) {
	        serviceRecords.add(serviceRecord);
	    }

	    public void displayServiceHistory(Vehicle vehicle) {
	        for (ServiceRecord record : serviceRecords) {
	            if (record.getVehicle() == vehicle) {
	                System.out.println("Vehicle ID: " + vehicle.getId());
	                System.out.println("Date: " + record.getDate());
	                System.out.println("Description: " + record.getDescription());
	                System.out.println("Cost: " + record.getCost());
	                System.out.println("---------------------------");
	            }
	        }
	    }
	        
}
