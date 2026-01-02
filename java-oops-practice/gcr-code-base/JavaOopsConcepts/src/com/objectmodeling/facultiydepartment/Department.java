package com.objectmodeling.facultiydepartment;

//Represents a Department inside a University
public class Department {

 private int deptId;
 private String deptName;

 // Constructor
 public Department(int deptId, String deptName) {
     this.deptId = deptId;
     this.deptName = deptName;
 }

 public String getDeptName() {
     return deptName;
 }

 // Simulate destruction of department
 public void closeDepartment() {
     System.out.println("Department " + deptName + " is now closed.");
 }
}

