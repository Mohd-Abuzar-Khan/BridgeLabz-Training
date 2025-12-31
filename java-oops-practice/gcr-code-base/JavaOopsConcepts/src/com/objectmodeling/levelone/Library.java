package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Add book to library (Aggregation)
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in library
    public void showBooks() {
        System.out.println("\nBooks available in " + libraryName + ":");

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}

