package tourmate;

import java.util.List;

public abstract class Trip {

    protected String destination;
    protected int duration;
    protected double budget;

    protected Hotel hotel;
    protected Transport transport;
    protected List<Activity> activities;

    public Trip(String destination, int duration,
                Hotel hotel, Transport transport,
                List<Activity> activities) {

        this.destination = destination;
        this.duration = duration;
        this.hotel = hotel;
        this.transport = transport;
        this.activities = activities;

        calculateBudget();
    }

    protected void calculateBudget() {
        budget = hotel.getTotalCost()
               + transport.getCost();

        for (Activity a : activities) {
            budget += a.getCost(); // operator usage
        }
    }

    public abstract void bookTrip(); // polymorphism
}
