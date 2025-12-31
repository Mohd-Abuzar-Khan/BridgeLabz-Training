package com.objectmodeling.levelone;

public class Book {

    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

