package com.linkedlist.doublelinkedlist.librarymanagement;

//Main class to test Library Management System
public class LibraryManagementApp {

 public static void main(String[] args) {

     Library library = new Library();

     library.addAtEnd(101, "Clean Code", "Robert Martin", "Programming", true);
     library.addAtBeginning(102, "Effective Java", "Joshua Bloch", "Programming", true);
     library.addAtEnd(103, "The Alchemist", "Paulo Coelho", "Fiction", false);
     library.addAtPosition(2, 104, "Atomic Habits", "James Clear", "Self-help", true);

     library.displayForward();

     library.searchByAuthor("Robert Martin");
     library.searchByTitle("Atomic Habits");

     library.updateAvailability(103, true);

     library.displayReverse();

     library.removeById(102);
     library.displayForward();

     System.out.println("Total books in library: " + library.countBooks());
 }
}
