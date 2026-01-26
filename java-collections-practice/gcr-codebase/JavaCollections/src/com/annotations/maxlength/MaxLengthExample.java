package com.annotations.maxlength;

public class MaxLengthExample {
    public static void main(String[] args) {
        try {
            // Valid username
            User user1 = new User("john_doe");
            System.out.println("Valid username: " + user1.getUsername());
            
            // Invalid username (too long)
            User user2 = new User("this_username_is_way_too_long_for_validation");
            System.out.println("Username: " + user2.getUsername());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
