package org.example;

public class Main {
    public static void main(String[] args) {

        Book dominicsBook = new Book("Das merk ich mir", "656-543-7865-4565", false, "White", 24.99);
        dominicsBook.printBook();

        Car myCar = new Car("Toyota", "Corolla", "lilac", 2002, 220);
        myCar.startCar();
        myCar.accelerateSpeed(30);

        Car yourCar = new Car("Subaru", "Forester", "silver", 1998, 200);
        yourCar.startCar();
        yourCar.accelerateSpeed(25);
    }


}