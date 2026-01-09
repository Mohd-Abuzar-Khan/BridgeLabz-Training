package parkease;

public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    // Internal booking record (restricted)
    private Vehicle parkedVehicle;

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Encapsulation: no external toggle of availability
    public boolean parkVehicle(Vehicle vehicle) {
        if (!isOccupied &&
            vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {

            this.parkedVehicle = vehicle;
            this.isOccupied = true;
            return true;
        }
        return false;
    }

    public void vacateSlot() {
        this.parkedVehicle = null;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    // Logs only (no direct access to internals)
    public String getSlotInfo() {
        return "Slot ID: " + slotId +
                ", Location: " + location +
                ", Available: " + !isOccupied;
    }
}
