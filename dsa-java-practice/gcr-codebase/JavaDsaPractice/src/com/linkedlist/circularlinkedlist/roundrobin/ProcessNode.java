package com.linkedlist.circularlinkedlist.roundrobin;

//Node representing a Process in Circular Linked List
public class ProcessNode {

 int processId;
 int burstTime;          // Original burst time
 int remainingTime;      // Remaining burst time
 int priority;

 int waitingTime;
 int turnaroundTime;

 ProcessNode next;

 // Constructor
 public ProcessNode(int processId, int burstTime, int priority) {
     this.processId = processId;
     this.burstTime = burstTime;
     this.remainingTime = burstTime;
     this.priority = priority;
     this.next = null;
 }
}
