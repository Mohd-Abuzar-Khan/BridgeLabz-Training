package com.linkedlist.doublelinkedlist.moviemanagement;

//Main class to test Movie Management System
public class MovieManagementApp {

 public static void main(String[] args) {

     MovieList movies = new MovieList();
     
     //Adding movie at the end, beginning and at specific position
     movies.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
     movies.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
     movies.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
     movies.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.9);

     movies.displayForward();

     movies.searchByDirector("Christopher Nolan");
     movies.searchByRating(7.8);

     movies.updateRating("Avatar", 8.0);

     movies.displayReverse();

     movies.removeByTitle("Titanic");
     movies.displayForward();
 }
}
