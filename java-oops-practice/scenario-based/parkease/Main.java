package parkease;

public class Main {

    public static void main(String[] args) {

        // Create parking slots (Constructor usage)
        ParkingSlot carSlot = new ParkingSlot("C1", "Zone A", "Car");
        ParkingSlot bikeSlot = new ParkingSlot("B1", "Zone B", "Bike");

        // Create vehicles (Inheritance)
        Vehicle car = new Car("MP09-AB-1234");
        Vehicle bike = new Bike("MP09-BK-5678");

        // Park vehicles (Encapsulation: availability handled internally)
        if (carSlot.parkVehicle(car)) {
            System.out.println("Car parked successfully in slot C1");
        } else {
            System.out.println("Car parking failed");
        }

        if (bikeSlot.parkVehicle(bike)) {
            System.out.println("Bike parked successfully in slot B1");
        } else {
            System.out.println("Bike parking failed");
        }

        // Parking duration (in hours)
        int carHours = 6;
        int bikeHours = 4;

        // Polymorphic charge calculation
        System.out.println(
                "Car Parking Charges for " + carHours + " hours: ₹" +
                car.calculateCharges(carHours)
        );

        System.out.println(
                "Bike Parking Charges for " + bikeHours + " hours: ₹" +
                bike.calculateCharges(bikeHours)
        );

        // Slot availability logs (controlled access)
        System.out.println(carSlot.getSlotInfo());
        System.out.println(bikeSlot.getSlotInfo());

        // Vacating slots
        carSlot.vacateSlot();
        bikeSlot.vacateSlot();

        System.out.println("Slots vacated successfully.");

        // Availability after vacating
        System.out.println(carSlot.getSlotInfo());
        System.out.println(bikeSlot.getSlotInfo());
    }
}
