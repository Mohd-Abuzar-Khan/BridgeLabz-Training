package com.streamapi.foreach;

import java.util.ArrayList;
import java.util.List;

public class WelcomeEvent {

    public static void main(String[] args) {

        List<String> attendees = new ArrayList<>();

        attendees.add("Khadija");
        attendees.add("Ankita");
        attendees.add("Gumesh");
        attendees.add("Sara");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name )
        );
    }
}
