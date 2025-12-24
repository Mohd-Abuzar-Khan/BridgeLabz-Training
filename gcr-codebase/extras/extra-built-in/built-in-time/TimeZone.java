// Created a program to display time in different time zone
import java.time.*;

public class TimeZone {
	
	// Created a method to display time in diffrent timezone 
	public static void displayTime(String zoneName, String zoneId) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zoneId));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(zoneName + " Time: " + time.format(formatter));
    }
	
	public static void main(String[] args) {
		
		// Calling method to display time in different timezone
		displayTime("GMT", "GMT");
        displayTime("IST", "Asia/Kolkata");
        displayTime("PST", "America/Los_Angeles");
		
	}
}

