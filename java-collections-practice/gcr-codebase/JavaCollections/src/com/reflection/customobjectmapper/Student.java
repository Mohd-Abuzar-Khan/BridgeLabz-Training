package com.reflection.customobjectmapper;

// Student class for custom object mapper demonstration
public class Student {
    private String name;
    private int rollNumber;
    
    public Student() {
        this.name = "Unknown";
        this.rollNumber = 0;
    }
    
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }
}
