package org.example;

import java.util.Objects;

public class Car {
    private int year;
    private String model;
    private String color;
    // Properties
    private String brand;
    private int speed;
    private double price;

    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = 0;
    }

    // getter -> Lesezugriff! um private properties nutzen zu können und auszuschließen, dass properties von außerhalb geändert werden können.
    // setter -> Schreibzugriff!
    // Felder können komplett ohne Zugriff bleiben und sind nicht les- oder schreibbar. Bsp Passwort

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString -> wandelt Objekt in einen String um
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && speed == car.speed && Double.compare(price, car.price) == 0 && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, model, color, brand, speed, price);
    }

    public String startCar() {
        return "Wwwroooommmm!";
    }

    public void accelSpeed() {
        int accelerationRate = 10;
        speed += accelerationRate;
    }

}
