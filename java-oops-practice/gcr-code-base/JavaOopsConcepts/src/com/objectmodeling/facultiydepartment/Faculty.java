package com.objectmodeling.facultiydepartment;

//Represents a Faculty member (can exist independently)
public class Faculty {

 private int facultyId;
 private String name;

 // Constructor
 public Faculty(int facultyId, String name) {
     this.facultyId = facultyId;
     this.name = name;
 }

 public String getName() {
     return name;
 }

 public void teach() {
     System.out.println(name + " is teaching.");
 }
}

