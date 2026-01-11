package tourmate;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Hotel hotel, Transport transport,
                        java.util.List<Activity> activities) {
        super(destination, duration, hotel, transport, activities);
    }

    @Override
    public void bookTrip() {
        System.out.println("Booking Domestic Trip to " + destination);

        transport.book();
        hotel.book();

        for (Activity a : activities) {
            a.book();
        }

        System.out.println("Domestic Trip Budget: ₹" + budget);
    }
}
