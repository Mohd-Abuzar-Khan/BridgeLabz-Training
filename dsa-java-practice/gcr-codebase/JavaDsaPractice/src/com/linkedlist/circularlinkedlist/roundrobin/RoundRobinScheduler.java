package com.linkedlist.circularlinkedlist.roundrobin;

//Round Robin CPU Scheduling using Circular Linked List
public class RoundRobinScheduler {

 private ProcessNode head;
 private int timeQuantum;
 private int totalProcesses = 0;
 private int currentTime = 0;

 public RoundRobinScheduler(int timeQuantum) {
     this.timeQuantum = timeQuantum;
 }

 /* ================= ADD PROCESS ================= */

 // Add process at end of circular list
 public void addProcess(int id, int burstTime, int priority) {
     ProcessNode newNode = new ProcessNode(id, burstTime, priority);

     if (head == null) {
         head = newNode;
         newNode.next = head;
     } else {
         ProcessNode temp = head;
         while (temp.next != head) {
             temp = temp.next;
         }
         temp.next = newNode;
         newNode.next = head;
     }
     totalProcesses++;
 }

 /* ================= REMOVE PROCESS ================= */

 // Remove process after completion
 private void removeProcess(ProcessNode prev, ProcessNode current) {

     if (current == head && current.next == head) {
         head = null;
     } else {
         if (current == head) {
             ProcessNode last = head;
             while (last.next != head) {
                 last = last.next;
             }
             head = head.next;
             last.next = head;
         } else {
             prev.next = current.next;
         }
     }
     totalProcesses--;
 }

 /* ================= SCHEDULING ================= */

 // Simulate Round Robin Scheduling
 public void schedule() {

     if (head == null) {
         System.out.println("No processes to schedule");
         return;
     }

     ProcessNode current = head;
     ProcessNode prev = null;

     System.out.println("Starting Round Robin Scheduling...\n");

     while (totalProcesses > 0) {

         displayQueue();

         if (current.remainingTime > 0) {

             int execTime = Math.min(timeQuantum, current.remainingTime);
             current.remainingTime -= execTime;
             currentTime += execTime;

             // Update waiting time of other processes
             updateWaitingTimes(current, execTime);

             // If process finished
             if (current.remainingTime == 0) {
                 current.turnaroundTime = currentTime;
                 System.out.println("Process " + current.processId + " completed");

                 removeProcess(prev, current);
                 current = (prev == null) ? head : prev.next;
                 continue;
             }
         }

         prev = current;
         current = current.next;
     }

     displayAverages();
 }

 /* ================= HELPERS ================= */

 // Update waiting times
 private void updateWaitingTimes(ProcessNode running, int time) {
     ProcessNode temp = head;

     if (temp == null) return;

     do {
         if (temp != running) {
             temp.waitingTime += time;
         }
         temp = temp.next;
     } while (temp != head);
 }

 // Display circular queue
 private void displayQueue() {
     if (head == null) return;

     ProcessNode temp = head;
     System.out.print("Process Queue: ");

     do {
         System.out.print(
                 "[P" + temp.processId +
                 " | Remaining: " + temp.remainingTime + "] "
         );
         temp = temp.next;
     } while (temp != head);

     System.out.println();
 }

 // Calculate and display average waiting & turnaround time
 private void displayAverages() {

     double totalWT = 0;
     double totalTAT = 0;
     int count = 0;

     ProcessNode temp = head;
     if (temp == null) return;

     do {
         totalWT += temp.waitingTime;
         totalTAT += temp.turnaroundTime;
         count++;
         temp = temp.next;
     } while (temp != head);

     System.out.println("\nAverage Waiting Time: " + (totalWT / count));
     System.out.println("Average Turnaround Time: " + (totalTAT / count));
 }
}
