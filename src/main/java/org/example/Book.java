package org.example;

public class Book {

    // Variables
    public String title;
    public String isbn;
    public boolean wasRead;
    public String color;
    public double price;

    // Constructor
    public Book(String title, String isbn, boolean wasRead, String color, double price) {
        this.title = title;
        this.isbn = isbn;
        this.wasRead = wasRead;
        this.color = color;
        this.price = price;
    }

    // Methods -> was kann mein Objekt
    public void printBook() {
        System.out.println("Das Buch mit dem Titel " + title + " und der isbn " + isbn + " hat die Farbe " + color + " und kostet " + price + ".");
    }
}
