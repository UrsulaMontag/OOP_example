package org.example;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", "lilac", 2002);
        myCar.startCar();

        Car yourCar = new Car("Subaru", "Forester", "silver", 1998);
//        yourCar.startCar();
//        yourCar.accelerateSpeed(25);
//        yourCar.accelerateSpeed(25);
//        System.out.println(yourCar.getSpeed());

        // Exercise OOP-II
        Book myBook = new Book("Bios", "343-343-3434-3434", "Daniel Suarez");
        Book myBook1 = new Book("Deamon", "343-343-999-3434", "Daniel Suarez");
        Book myBook2 = new Book("Darknet", "343-343-666-3434", "Daniel Suarez");
        System.out.println(myBook);

        Book[] myBooks = {myBook, myBook1, myBook2};

        Library myLibrary = new Library(myBooks);
        System.out.println(myLibrary);

    }


}