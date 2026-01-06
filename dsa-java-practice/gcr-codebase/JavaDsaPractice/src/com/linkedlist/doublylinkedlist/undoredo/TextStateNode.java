package com.linkedlist.doublelinkedlist.undoredo;

//Doubly Linked List Node representing a text state
public class TextStateNode {

 String content;           // Text content at this state
 TextStateNode prev;       // Previous state (Undo)
 TextStateNode next;       // Next state (Redo)

 public TextStateNode(String content) {
     this.content = content;
     this.prev = null;
     this.next = null;
 }
}
