package com.linkedlist.singlylinkedlist.soicalmediamanager;

class SocialMediaNetwork {
    private UserNode head;

	public void addUser(int id, String name, int age) {
	    UserNode newUser = new UserNode(id, name, age);
	    newUser.next = head;
	    head = newUser;
	}
	
    public UserNode searchById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found.");
    }
    
    public void addFriendConnection(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        addFriend(user1, id2);
        addFriend(user2, id1);

        System.out.println("Friend connection added.");
    }

    private void addFriend(UserNode user, int friendId) {
        FriendNode temp = user.friendHead;
        while (temp != null) {
            if (temp.friendId == friendId)
                return; // already friends
            temp = temp.next;
        }

        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }

    public void removeFriendConnection(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        removeFriend(user1, id2);
        removeFriend(user2, id1);

        System.out.println("Friend connection removed.");
    }

    private void removeFriend(UserNode user, int friendId) {
        FriendNode temp = user.friendHead;

        if (temp == null)
            return;

        if (temp.friendId == friendId) {
            user.friendHead = temp.next;
            return;
        }

        while (temp.next != null && temp.next.friendId != friendId)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;

            while (f != null) {
                count++;
                f = f.next;
            }

            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }
    

    
    public void displayFriends(int userId) {
        UserNode user = searchById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;

        if (temp == null) {
            System.out.println("No friends.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    private void displayUser(UserNode u) {
        System.out.println("--------------------");
        System.out.println("ID: " + u.userId);
        System.out.println("Name: " + u.name);
        System.out.println("Age: " + u.age);
    }
 
}
