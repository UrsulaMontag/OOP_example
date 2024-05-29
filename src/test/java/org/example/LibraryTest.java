package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Book testBook1 = new Book("Test", "Test Man", "1234535786");
    Book testBook2 = new Book("Test2", "Test Woman", "2234535786");
    Book testBook3 = new Book("Test3", "Test Man-Woman", "3234535786");
    Book[] testBooks = new Book[]{testBook1, testBook2, testBook3};
    Library testLibrary = new Library(testBooks);

    @Test
    void addBook_addsBookToLibrary() {
        Book testBook = new Book("Test", "Test Divers", "4234535786");
        testLibrary.addBook(testBook);
        int indexOfLastBook = testLibrary.getBooks().length - 1;
        assertEquals(testBook, testLibrary.getBooks()[indexOfLastBook]);

    }

    @Test
    void deleteBook() {
        int before = testLibrary.getBooks().length;
        testLibrary.deleteBook(testBook2);
        int after = testLibrary.getBooks().length;
        assertEquals(before - 1, after);
        assertNotEquals(testBooks, testLibrary.getBooks());
    }
}