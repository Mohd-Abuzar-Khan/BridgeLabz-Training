package com.linkedlist.singlylinkedlist.soicalmediamanager;

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}
