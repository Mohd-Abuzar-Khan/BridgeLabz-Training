package com.streamapi.foreach;

import java.util.ArrayList;
import java.util.List;

public class EmailNotification {

    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();

        emails.add("user1@gmail.com");
        emails.add("user2@gmail.com");
        emails.add("user3@gmail.com");

        emails.forEach(email ->
                sendEmailNotification(email)
        );
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Sending notification email to: " + email);
    }
}
