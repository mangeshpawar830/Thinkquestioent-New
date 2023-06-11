package com.khadijaMam;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Set values using setter methods
        employee.setId(1);
        employee.setName("Mangesh Pawar");
        employee.setSalary(5000.0);

        // Get values using getter methods
        int id = employee.getId();
        String name = employee.getName();
        double salary = employee.getSalary();

        // Display employee information
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
