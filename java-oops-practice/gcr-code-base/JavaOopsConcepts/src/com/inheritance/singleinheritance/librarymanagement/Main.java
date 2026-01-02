package com.inheritance.singleinheritance.librarymanagement;

public class Main {
    public static void main(String[] args) {
        Author book = new Author(
                "Harry Potter and the Philosopher's Stone",
                1997,
                "J.K. Rowling",
                "British author famous for the Harry Potter series."
        );

        book.displayInfo();
    }
}