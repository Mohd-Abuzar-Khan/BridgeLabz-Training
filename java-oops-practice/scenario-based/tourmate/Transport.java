package tourmate;

public class Transport implements IBookable {

    private String mode;
    private double baseFare;

    public Transport(String mode, double baseFare) {
        this.mode = mode;
        this.baseFare = baseFare;
    }

    protected double getCost() {
        return baseFare;
    }

    @Override
    public void book() {
        System.out.println("Transport booked via " + mode);
    }

    @Override
    public void cancel() {
        System.out.println("Transport booking cancelled: " + mode);
    }
}
