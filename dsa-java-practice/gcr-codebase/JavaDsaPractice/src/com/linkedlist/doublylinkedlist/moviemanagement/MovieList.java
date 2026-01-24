package com.linkedlist.doublylinkedlist.moviemanagement;

//Doubly Linked List to manage movies
public class MovieList {

 private MovieNode head;
 private MovieNode tail;

 /* ================= ADD OPERATIONS ================= */

 // Add movie at beginning
 public void addAtBeginning(String title, String director, int year, double rating) {
     MovieNode newNode = new MovieNode(title, director, year, rating);

     if (head == null) {
         head = tail = newNode;
         return;
     }

     newNode.next = head;
     head.prev = newNode;
     head = newNode;
 }

 // Add movie at end
 public void addAtEnd(String title, String director, int year, double rating) {
     MovieNode newNode = new MovieNode(title, director, year, rating);

     if (tail == null) {
         head = tail = newNode;
         return;
     }

     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
 }

 // Add movie at specific position (1-based index)
 public void addAtPosition(int position, String title, String director, int year, double rating) {
     if (position <= 1) {
         addAtBeginning(title, director, year, rating);
         return;
     }

     MovieNode temp = head;
     for (int i = 1; i < position - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null || temp.next == null) {
         addAtEnd(title, director, year, rating);
         return;
     }

     MovieNode newNode = new MovieNode(title, director, year, rating);
     newNode.next = temp.next;
     newNode.prev = temp;
     temp.next.prev = newNode;
     temp.next = newNode;
 }

 /* ================= REMOVE ================= */

 // Remove movie by title
 public void removeByTitle(String title) {
     MovieNode temp = head;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {

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

             System.out.println("Movie removed successfully");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Movie not found");
 }

 /* ================= SEARCH ================= */

 // Search movies by director
 public void searchByDirector(String director) {
     MovieNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.director.equalsIgnoreCase(director)) {
             displayMovie(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No movies found for this director");
 }

 // Search movies by rating
 public void searchByRating(double rating) {
     MovieNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.rating == rating) {
             displayMovie(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No movies found with this rating");
 }

 /* ================= UPDATE ================= */

 // Update movie rating by title
 public void updateRating(String title, double newRating) {
     MovieNode temp = head;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {
             temp.rating = newRating;
             System.out.println("Rating updated successfully");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Movie not found");
 }

 /* ================= DISPLAY ================= */

 // Display movies forward
 public void displayForward() {
     MovieNode temp = head;

     if (temp == null) {
         System.out.println("Movie list is empty");
         return;
     }

     System.out.println("Movies (Forward):");
     while (temp != null) {
         displayMovie(temp);
         temp = temp.next;
     }
 }

 // Display movies in reverse order
 public void displayReverse() {
     MovieNode temp = tail;

     if (temp == null) {
         System.out.println("Movie list is empty");
         return;
     }

     System.out.println("Movies (Reverse):");
     while (temp != null) {
         displayMovie(temp);
         temp = temp.prev;
     }
 }

 // Helper method to print movie details
 private void displayMovie(MovieNode movie) {
     System.out.println(
             "Title: " + movie.title +
             ", Director: " + movie.director +
             ", Year: " + movie.year +
             ", Rating: " + movie.rating
     );
 }
}
