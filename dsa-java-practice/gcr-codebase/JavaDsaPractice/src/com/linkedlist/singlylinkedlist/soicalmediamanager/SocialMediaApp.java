package com.linkedlist.singlylinkedlist.soicalmediamanager;

public class SocialMediaApp {

    public static void main(String[] args) {

        SocialMediaNetwork network = new SocialMediaNetwork();

        // Adding users
        network.addUser(1, "Abuzar", 22);
        network.addUser(2, "Karan", 21);
        network.addUser(3, "Riya", 20);
        network.addUser(4, "Kunal", 23);
        network.addUser(5, "Abhinav", 22);

        // Adding friend connections
        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(2, 4);
        network.addFriendConnection(3, 5);

        // Display friends
        System.out.println("Friends List:");
        network.displayFriends(1);
        network.displayFriends(2);
        network.displayFriends(3);

        // Search operations
        System.out.println("Search by User ID (3):");
        UserNode user = network.searchById(3);
        if (user != null) {
            System.out.println("Found User: " + user.name);
        }

        System.out.println("Search by Name (Sara):");
        network.searchByName("Sara");
      

        // Remove friend connection
        System.out.println("Removing Friend Connection between 1 and 3:");
        network.removeFriendConnection(1, 3);
        network.displayFriends(1);
        network.displayFriends(3);

        // Count friends for each user
        System.out.println("Friend Count:");
        network.countFriends();

        System.out.println("Social Media Friend Management System Execution Complete.");
    }
}
