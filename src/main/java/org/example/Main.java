package org.example;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", "lilac", 2002);
        myCar.startCar();
        Car yourCar = new Car("Subaru", "Forester", "silver", 1998);
        System.out.println("Your " + yourCar.getBrand() + " startet! " + yourCar.startCar());
        yourCar.accelSpeed();
        System.out.println("After acceleration your car has speed of: " + yourCar.getSpeed());
        yourCar.accelSpeed();
        System.out.println("After acceleration your car has speed of: " + yourCar.getSpeed());


        // Exercise OOP-II
        Book myBook = new Book("Bios", "343-343-3434-3434", "Daniel Suarez");
        Book myBook1 = new Book("Deamon", "343-343-999-3434", "Daniel Suarez");
        Book myBook2 = new Book("Darknet", "343-343-666-3434", "Daniel Suarez");
        Book myBook4 = new Book("Critical Mass", "343-343-666-3434", "Daniel Suarez");
        Book myBook5 = new Book("Delta-V", "343-343-666-3434", "Daniel Suarez");
        Book badBook = new Book("Langweilige Geschichten", "45646-4657-5456", "Bore Ing");
        System.out.println(myBook);

        Book[] myBooks = {myBook, myBook1, myBook2};
        Library myLibrary = new Library(myBooks);
        System.out.println(myLibrary);

        myLibrary.addBook(badBook);
        myLibrary.addBook(myBook4);
        myLibrary.addBook(myBook5);
        System.out.println(myLibrary);

        myLibrary.deleteBook(badBook);
        System.out.println(myLibrary);
    }
}