package eventease;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Represents an event with scheduling and booking details
public class Event {

    private String eventName;
    private String location;
    private LocalDate date;
    private User organizer;
    private List<String> attendees;

    public Event(String eventName, String location, LocalDate date, User organizer) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.organizer = organizer;
        this.attendees = new ArrayList<>();
    }

    // Adds an attendee to the event
    public void addAttendee(String attendeeName) {
        if (attendeeName != null && !attendeeName.isEmpty()) {
            attendees.add(attendeeName);
        }
    }

    // Removes an attendee
    public void removeAttendee(String attendeeName) {
        attendees.remove(attendeeName);
    }

    // Displays full event details
    public void displayEventDetails() {
        System.out.println("\nEvent Details");
        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
        System.out.println("Date       : " + date);
        System.out.println("Organizer  : " + organizer.getName());
        System.out.println("Attendees  : " + attendees.size());

        for (String attendee : attendees) {
            System.out.println(" - " + attendee);
        }
    }
}
