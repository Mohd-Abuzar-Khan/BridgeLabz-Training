package com.constructor.levelone;

public class EBook extends Books {

    String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);        // public
        System.out.println("Title: " + title);      // protected 
        System.out.println("Author: " + getAuthor()); // private 
        System.out.println("Format: " + fileFormat);
    }
}
