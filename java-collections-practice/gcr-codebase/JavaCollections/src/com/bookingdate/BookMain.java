package com.bookingdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class BookMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Bookings to be added");
        int reps = sc.nextInt();

        sc.nextLine();
        for(int i = 0; i < reps; i++ ){
            System.out.println("Enter the Booking details (Booking Id:Date of Booking)");
            String details = sc.nextLine();
            BookCabMain.addBookings(details);
        }

        System.out.println("Enter the date to check the booking (YYYY-MM-DD)");
        String date = sc.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate checkDate = LocalDate.parse(date, formatter);

        List<String> ans = BookCabMain.findCabBookingIdsForTheBookingDate(checkDate);

        System.out.println("Booking Ids booked on the " + date +" are by");
        
        for(String s : ans){
            System.out.println(s);
        }
    }
}