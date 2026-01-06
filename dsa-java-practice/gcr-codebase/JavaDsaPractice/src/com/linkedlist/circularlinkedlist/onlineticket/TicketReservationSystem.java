package com.linkedlist.circularlinkedlist.onlineticket;

//Online Ticket Reservation System using Circular Linked List
public class TicketReservationSystem {

 private TicketNode head;

 /* ================= ADD TICKET ================= */

 // Add a new ticket at the end
 public void addTicket(int id, String customer, String movie,
                       String seat, String time) {

     TicketNode newTicket = new TicketNode(id, customer, movie, seat, time);

     if (head == null) {
         head = newTicket;
         newTicket.next = head;
         return;
     }

     TicketNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     temp.next = newTicket;
     newTicket.next = head;
 }

 /* ================= REMOVE TICKET ================= */

 // Remove ticket by Ticket ID
 public void removeTicket(int ticketId) {

     if (head == null) {
         System.out.println("No tickets booked");
         return;
     }

     TicketNode temp = head;
     TicketNode prev = null;

     do {
         if (temp.ticketId == ticketId) {

             // Only one ticket
             if (temp == head && temp.next == head) {
                 head = null;
             }
             // Removing head
             else if (temp == head) {
                 TicketNode last = head;
                 while (last.next != head) {
                     last = last.next;
                 }
                 head = head.next;
                 last.next = head;
             }
             // Removing middle/last
             else {
                 prev.next = temp.next;
             }

             System.out.println("Ticket removed successfully");
             return;
         }

         prev = temp;
         temp = temp.next;

     } while (temp != head);

     System.out.println("Ticket not found");
 }

 /* ================= SEARCH ================= */

 // Search ticket by Customer Name
 public void searchByCustomer(String customerName) {
     if (head == null) {
         System.out.println("No tickets booked");
         return;
     }

     TicketNode temp = head;
     boolean found = false;

     do {
         if (temp.customerName.equalsIgnoreCase(customerName)) {
             displayTicket(temp);
             found = true;
         }
         temp = temp.next;
     } while (temp != head);

     if (!found)
         System.out.println("No ticket found for customer: " + customerName);
 }

 // Search ticket by Movie Name
 public void searchByMovie(String movieName) {
     if (head == null) {
         System.out.println("No tickets booked");
         return;
     }

     TicketNode temp = head;
     boolean found = false;

     do {
         if (temp.movieName.equalsIgnoreCase(movieName)) {
             displayTicket(temp);
             found = true;
         }
         temp = temp.next;
     } while (temp != head);

     if (!found)
         System.out.println("No ticket found for movie: " + movieName);
 }

 /* ================= DISPLAY ================= */

 // Display all tickets
 public void displayAllTickets() {
     if (head == null) {
         System.out.println("No tickets booked");
         return;
     }

     TicketNode temp = head;
     System.out.println("Booked Tickets:");

     do {
         displayTicket(temp);
         temp = temp.next;
     } while (temp != head);
 }

 /* ================= COUNT ================= */

 // Count total number of booked tickets
 public int countTickets() {
     if (head == null) return 0;

     int count = 0;
     TicketNode temp = head;

     do {
         count++;
         temp = temp.next;
     } while (temp != head);

     return count;
 }

 /* ================= HELPER ================= */

 // Display single ticket details
 private void displayTicket(TicketNode t) {
     System.out.println(
             "Ticket ID: " + t.ticketId +
             ", Customer: " + t.customerName +
             ", Movie: " + t.movieName +
             ", Seat: " + t.seatNumber +
             ", Time: " + t.bookingTime
     );
 }
}
