package com.casestudy.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private static LibraryCatalog instance;
    private List<Book> books;
    private List<Observer> observers;
    
    private LibraryCatalog() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
        System.out.println("Library Catalog initialized");
    }
    
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }
    
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        
        books.add(book);
        System.out.println("\nBook added to catalog: " + book);
        notifyObservers("New book available: " + book.getTitle());
    }
    
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
    
    public int getBookCount() {
        return books.size();
    }
    
    public void addObserver(Observer observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        
        if (!observers.contains(observer)) {
            observers.add(observer);
            if (observer instanceof User) {
                System.out.println(((User) observer).getName() + " subscribed to notifications");
            }
        }
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        if (observer instanceof User) {
            System.out.println(((User) observer).getName() + " unsubscribed from notifications");
        }
    }
    
    private void notifyObservers(String message) {
        System.out.println("\nSending notifications to " + observers.size() + " subscriber(s):");
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    
    public void displayStatistics() {
        System.out.println("\nLibrary Catalog Statistics:");
        System.out.println("   Total Books: " + books.size());
        System.out.println("   Subscribers: " + observers.size());
    }
    
    public void displayAllBooks() {
        System.out.println("\nBooks in Catalog:");
        if (books.isEmpty()) {
            System.out.println("   (No books in catalog)");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println("   " + (i + 1) + ". " + books.get(i));
            }
        }
    }
}