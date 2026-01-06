package com.linkedlist.doublelinkedlist.librarymanagement;

//Library Management using Doubly Linked List
public class Library {

 private BookNode head;
 private BookNode tail;

 /* ================= ADD OPERATIONS ================= */

 // Add book at beginning
 public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
     BookNode newBook = new BookNode(id, title, author, genre, available);

     if (head == null) {
         head = tail = newBook;
         return;
     }

     newBook.next = head;
     head.prev = newBook;
     head = newBook;
 }

 // Add book at end
 public void addAtEnd(int id, String title, String author, String genre, boolean available) {
     BookNode newBook = new BookNode(id, title, author, genre, available);

     if (tail == null) {
         head = tail = newBook;
         return;
     }

     tail.next = newBook;
     newBook.prev = tail;
     tail = newBook;
 }

 // Add book at specific position (1-based index)
 public void addAtPosition(int position, int id, String title, String author, String genre, boolean available) {
     if (position <= 1) {
         addAtBeginning(id, title, author, genre, available);
         return;
     }

     BookNode temp = head;
     for (int i = 1; i < position - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null || temp.next == null) {
         addAtEnd(id, title, author, genre, available);
         return;
     }

     BookNode newBook = new BookNode(id, title, author, genre, available);
     newBook.next = temp.next;
     newBook.prev = temp;
     temp.next.prev = newBook;
     temp.next = newBook;
 }

 /* ================= REMOVE ================= */

 // Remove book by Book ID
 public void removeById(int bookId) {
     BookNode temp = head;

     while (temp != null) {
         if (temp.bookId == bookId) {

             if (temp == head) {
                 head = head.next;
                 if (head != null) head.prev = null;
             } 
             else if (temp == tail) {
                 tail = tail.prev;
                 tail.next = null;
             } 
             else {
                 temp.prev.next = temp.next;
                 temp.next.prev = temp.prev;
             }

             System.out.println("Book removed successfully");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Book not found");
 }

 /* ================= SEARCH ================= */

 // Search by Book Title
 public void searchByTitle(String title) {
     BookNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {
             displayBook(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("Book not found");
 }

 // Search by Author
 public void searchByAuthor(String author) {
     BookNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.author.equalsIgnoreCase(author)) {
             displayBook(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No books found by this author");
 }

 /* ================= UPDATE ================= */

 // Update availability status
 public void updateAvailability(int bookId, boolean status) {
     BookNode temp = head;

     while (temp != null) {
         if (temp.bookId == bookId) {
             temp.isAvailable = status;
             System.out.println("Availability updated successfully");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Book not found");
 }

 /* ================= DISPLAY ================= */

 // Display books forward
 public void displayForward() {
     BookNode temp = head;

     if (temp == null) {
         System.out.println("Library is empty");
         return;
     }

     System.out.println("Library Books (Forward):");
     while (temp != null) {
         displayBook(temp);
         temp = temp.next;
     }
 }

 // Display books in reverse
 public void displayReverse() {
     BookNode temp = tail;

     if (temp == null) {
         System.out.println("Library is empty");
         return;
     }

     System.out.println("Library Books (Reverse):");
     while (temp != null) {
         displayBook(temp);
         temp = temp.prev;
     }
 }

 /* ================= COUNT ================= */

 // Count total books
 public int countBooks() {
     int count = 0;
     BookNode temp = head;

     while (temp != null) {
         count++;
         temp = temp.next;
     }
     return count;
 }

 /* ================= HELPER ================= */

 // Display single book details
 private void displayBook(BookNode book) {
     System.out.println(
             "ID: " + book.bookId +
             ", Title: " + book.title +
             ", Author: " + book.author +
             ", Genre: " + book.genre +
             ", Available: " + (book.isAvailable ? "Yes" : "No")
     );
 }
}

