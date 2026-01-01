package com.objectmodeling.librarymanagement;

public class LibraryMain {

    public static void main(String[] args) {

        // Creating Book objects (independent entities)
        Book book1 = new Book("How to win friend", "Daniel Carnegie");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Deep Work", "Cal Newport");

        // Creating Library objects
        Library centralLibrary = new Library("Central Library");
        Library cityLibrary = new Library("City Library");

        // Adding books to libraries (Aggregation)
        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

        cityLibrary.addBook(book2);
        cityLibrary.addBook(book3);

        // Display books in each library
        centralLibrary.showBooks();
        cityLibrary.showBooks();
    }
}
