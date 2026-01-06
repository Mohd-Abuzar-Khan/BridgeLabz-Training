package com.linkedlist.circularlinkedlist.taskschedular;

//Main class to test Task Scheduler
public class TaskSchedulerApp {

 public static void main(String[] args) {

     TaskScheduler scheduler = new TaskScheduler();

     scheduler.addAtEnd(1, "Design Module", 1, "2026-01-10");
     scheduler.addAtEnd(2, "Write Code", 2, "2026-01-12");
     scheduler.addAtBeginning(3, "Requirement Analysis", 1, "2026-01-08");
     scheduler.addAtPosition(2, 4, "Testing", 3, "2026-01-15");

     scheduler.displayAllTasks();

     System.out.println("\nCurrent Task:");
     scheduler.viewCurrentTask();

     System.out.println("\nMove to Next Task:");
     scheduler.moveToNextTask();

     System.out.println("\nSearch Tasks by Priority 1:");
     scheduler.searchByPriority(1);

     scheduler.removeById(2);
     scheduler.displayAllTasks();
 }
}

