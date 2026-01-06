package com.linkedlist.circularlinkedlist.taskschedular;

//Task Scheduler using Circular Linked List
public class TaskScheduler {

 private TaskNode head;
 private TaskNode current; // Points to current task

 /* ================= ADD OPERATIONS ================= */

 // Add task at beginning
 public void addAtBeginning(int id, String name, int priority, String date) {
     TaskNode newNode = new TaskNode(id, name, priority, date);

     if (head == null) {
         head = newNode;
         newNode.next = head;
         current = head;
         return;
     }

     TaskNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     newNode.next = head;
     temp.next = newNode;
     head = newNode;
 }

 // Add task at end
 public void addAtEnd(int id, String name, int priority, String date) {
     TaskNode newNode = new TaskNode(id, name, priority, date);

     if (head == null) {
         head = newNode;
         newNode.next = head;
         current = head;
         return;
     }

     TaskNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     temp.next = newNode;
     newNode.next = head;
 }

 // Add task at specific position (1-based index)
 public void addAtPosition(int position, int id, String name, int priority, String date) {
     if (position <= 1) {
         addAtBeginning(id, name, priority, date);
         return;
     }

     TaskNode temp = head;
     for (int i = 1; i < position - 1 && temp.next != head; i++) {
         temp = temp.next;
     }

     TaskNode newNode = new TaskNode(id, name, priority, date);
     newNode.next = temp.next;
     temp.next = newNode;
 }

 /* ================= REMOVE ================= */

 // Remove task by Task ID
 public void removeById(int taskId) {
     if (head == null) {
         System.out.println("Task list is empty");
         return;
     }

     TaskNode temp = head;
     TaskNode prev = null;

     do {
         if (temp.taskId == taskId) {

             // If only one node
             if (temp == head && temp.next == head) {
                 head = current = null;
                 System.out.println("Task removed");
                 return;
             }

             // If removing head
             if (temp == head) {
                 TaskNode last = head;
                 while (last.next != head) {
                     last = last.next;
                 }
                 head = head.next;
                 last.next = head;
                 current = head;
             } else {
                 prev.next = temp.next;
             }

             System.out.println("Task removed");
             return;
         }

         prev = temp;
         temp = temp.next;
     } while (temp != head);

     System.out.println("Task not found");
 }

 /* ================= VIEW CURRENT ================= */

 // View current task
 public void viewCurrentTask() {
     if (current == null) {
         System.out.println("No tasks available");
         return;
     }

     displayTask(current);
 }

 // Move to next task (circular)
 public void moveToNextTask() {
     if (current == null) {
         System.out.println("No tasks available");
         return;
     }

     current = current.next;
     viewCurrentTask();
 }

 /* ================= SEARCH ================= */

 // Search task by priority
 public void searchByPriority(int priority) {
     if (head == null) {
         System.out.println("No tasks available");
         return;
     }

     TaskNode temp = head;
     boolean found = false;

     do {
         if (temp.priority == priority) {
             displayTask(temp);
             found = true;
         }
         temp = temp.next;
     } while (temp != head);

     if (!found)
         System.out.println("No tasks found with priority " + priority);
 }

 /* ================= DISPLAY ================= */

 // Display all tasks
 public void displayAllTasks() {
     if (head == null) {
         System.out.println("Task list is empty");
         return;
     }

     TaskNode temp = head;
     System.out.println("All Tasks:");
     do {
         displayTask(temp);
         temp = temp.next;
     } while (temp != head);
 }

 // Helper method
 private void displayTask(TaskNode task) {
     System.out.println(
             "ID: " + task.taskId +
             ", Name: " + task.taskName +
             ", Priority: " + task.priority +
             ", Due Date: " + task.dueDate
     );
 }
}

