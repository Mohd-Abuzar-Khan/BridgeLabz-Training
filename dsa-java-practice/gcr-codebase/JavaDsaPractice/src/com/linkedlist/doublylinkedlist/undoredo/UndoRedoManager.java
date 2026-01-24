package com.linkedlist.doublylinkedlist.undoredo;

//Manages Undo and Redo operations using Doubly Linked List
public class UndoRedoManager {

 private TextStateNode head;
 private TextStateNode tail;
 private TextStateNode current;

 private final int MAX_HISTORY = 10;
 private int size = 0;

 /* ================= ADD NEW STATE ================= */

 // Add new text state (after typing or action)
 public void addState(String content) {

     TextStateNode newNode = new TextStateNode(content);

     // If current is not at the latest state, discard redo history
     if (current != null && current.next != null) {
         current.next.prev = null;
         current.next = null;
         tail = current;
         size = countNodes();
     }

     // Add new state at end
     if (head == null) {
         head = tail = current = newNode;
         size = 1;
         return;
     }

     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
     current = newNode;
     size++;

     // Enforce history size limit
     if (size > MAX_HISTORY) {
         head = head.next;
         head.prev = null;
         size--;
     }
 }

 /* ================= UNDO ================= */

 // Undo operation
 public void undo() {
     if (current == null || current.prev == null) {
         System.out.println("Nothing to undo");
         return;
     }
     current = current.prev;
 }

 /* ================= REDO ================= */

 // Redo operation
 public void redo() {
     if (current == null || current.next == null) {
         System.out.println("Nothing to redo");
         return;
     }
     current = current.next;
 }

 /* ================= DISPLAY ================= */

 // Display current text state
 public void displayCurrentState() {
     if (current == null) {
         System.out.println("Editor is empty");
     } else {
         System.out.println("Current Text: " + current.content);
     }
 }

 /* ================= HELPER ================= */

 // Count nodes (used when trimming redo history)
 private int countNodes() {
     int count = 0;
     TextStateNode temp = head;
     while (temp != null) {
         count++;
         temp = temp.next;
     }
     return count;
 }
}

