package com.bookingdate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookCabMain{
    private static Map<String , LocalDate> bookingMap = new HashMap<>();

    public static  List<String> findCabBookingIdsForTheBookingDate(LocalDate date){
        List<String> res = new ArrayList<>();
        for (String k : bookingMap.keySet() ){
            if (bookingMap.get(k).isEqual(date)){
                res.add(k);
            }
        }
        return res;
    }

    public static void addBookings(String booking){
        String[] bookingDetails = booking.split(":");
        bookingMap.put(bookingDetails[0], LocalDate.parse(bookingDetails[1]));
        System.out.println("Succesfully Added a Booking");
    }
}