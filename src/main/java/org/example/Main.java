package org.example;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", "lilac", 2002);
        myCar.startCar();

        Car yourCar = new Car("Subaru", "Forester", "silver", 1998);
        yourCar.startCar();
        yourCar.accelerateSpeed(25);
        yourCar.accelerateSpeed(25);
        System.out.println(yourCar.getSpeed());

        Book myBook = new Book("Bios", "343-343-3434-3434", "Daniel Suarez");
        System.out.println(myBook);

    }


}