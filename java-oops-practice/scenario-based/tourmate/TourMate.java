package tourmate;

import java.util.Arrays;

public class TourMate {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Sea View Resort", 4000, 5);
        Transport flight = new Transport("Flight", 18000);

        Activity scuba = new Activity("Scuba Diving", 6000);
        Activity cityTour = new Activity("City Tour", 3000);

        Trip trip = new InternationalTrip(
                "Bali",
                7,
                hotel,
                flight,
                Arrays.asList(scuba, cityTour)
        );

        trip.bookTrip();
    }
}
