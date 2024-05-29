package org.example;

public class Car {
    // Properties
    public String brand;
    public String model;
    public String color;
    public int year;
    public int speed;

    public Car(String brand, String model, String color, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = speed;
    }

    public void startCar() {
        System.out.println("Wwwroooommmm!");
    }

    public void accelerateSpeed(int accelerationRateMperS) {
        for (int i = 0; i < speed; i += accelerationRateMperS) {
            System.out.println("Wooohou, your " + brand + " " + model + " is that fast! Your actual speed is: " + i + "!!");
        }

    }

}
