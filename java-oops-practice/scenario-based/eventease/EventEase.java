package eventease;

import java.time.LocalDate;

// Demonstrates EventEase booking and scheduling module
public class EventEase {

    public static void main(String[] args) {

        // Create an event organizer
        User organizer = new User(
                "U101",
                "Abuzar Khan",
                "abuzar@email.com"
        );

        // Create an event
        Event event = new Event(
                "Tech Conference 2026",
                "Bangalore",
                LocalDate.of(2026, 3, 15),
                organizer
        );

        // Add attendees
        event.addAttendee("Rakesh Sharma");
        event.addAttendee("Ananya Verma");
        event.addAttendee("Jigyasa Singh");

        // Display event details
        event.displayEventDetails();
    }
}
