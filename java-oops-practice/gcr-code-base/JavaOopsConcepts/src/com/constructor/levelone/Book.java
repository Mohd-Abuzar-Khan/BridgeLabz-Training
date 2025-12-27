package com.constructor.levelone;

class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Default Constructor
    Book() {
        this("Norwegian Wood", "Haraki Murakami", 0.0);
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
}

