package tourmate;

public class InternationalTrip extends Trip {

    private static final double VISA_FEE = 5000;

    public InternationalTrip(String destination, int duration,
                             Hotel hotel, Transport transport,
                             java.util.List<Activity> activities) {
        super(destination, duration, hotel, transport, activities);
    }

    @Override
    protected void calculateBudget() {
        super.calculateBudget();
        budget += VISA_FEE; // extra cost
    }

    @Override
    public void bookTrip() {
        System.out.println("Booking International Trip to " + destination);
        System.out.println("Visa processing started...");

        transport.book();
        hotel.book();

        for (Activity a : activities) {
            a.book();
        }

        System.out.println("International Trip Budget: ₹" + budget);
    }
}
