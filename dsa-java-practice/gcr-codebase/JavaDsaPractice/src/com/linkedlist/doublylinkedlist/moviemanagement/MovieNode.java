package com.linkedlist.doublylinkedlist.moviemanagement;

//Doubly Linked List Node representing a Movie
public class MovieNode {

 String title;
 String director;
 int year;
 double rating;

 MovieNode prev;
 MovieNode next;

 // Constructor
 public MovieNode(String title, String director, int year, double rating) {
     this.title = title;
     this.director = director;
     this.year = year;
     this.rating = rating;
     this.prev = null;
     this.next = null;
 }
}
