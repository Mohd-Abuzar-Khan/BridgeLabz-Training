package com.casestudy.librarymanagementsystem;

public class UserFactory {
    
    public static User createUser(String type, String name) {
        if (type == null || name == null) {
            throw new IllegalArgumentException("Type and name cannot be null");
        }
        
        switch (type.toLowerCase().trim()) {
            case "student":
                return new Student(name);
            case "faculty":
                return new Faculty(name);
            case "librarian":
                return new Librarian(name);
            default:
                throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}