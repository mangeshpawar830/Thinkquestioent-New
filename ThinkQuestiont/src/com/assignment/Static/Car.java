package com.assignment.Static;

public class Car {
    private String model;
    private static int totalCarSold;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public static int getTotalCarSold() {
        return totalCarSold;
    }

    public static void setTotalCarSold(int totalCarSold) {
        Car.totalCarSold = totalCarSold;
    }

    public static void main(String[] args) {
        Car.setTotalCarSold(10);
        System.out.println("Total cars sold: " + Car.getTotalCarSold());

        Car car1 = new Car("Model 1");
        car1.setTotalCarSold(5);

        Car car2 = new Car("Model 2");
        System.out.println("Total cars sold (from car2): " + car2.getTotalCarSold());
    }
}
