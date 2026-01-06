package com.linkedlist.circularlinkedlist.roundrobin;

//Main class to test Round Robin Scheduling
public class RoundRobinApp {

 public static void main(String[] args) {

     RoundRobinScheduler scheduler = new RoundRobinScheduler(4); // Time Quantum = 4

     scheduler.addProcess(1, 10, 1);
     scheduler.addProcess(2, 5, 2);
     scheduler.addProcess(3, 8, 1);
     scheduler.addProcess(4, 6, 3);

     scheduler.schedule();
 }
}
