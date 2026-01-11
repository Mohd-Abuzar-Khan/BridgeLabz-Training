package artify;

public class DigitalArt extends Artwork {

    private static final String DIGITAL_LICENSE =
            "Personal + Commercial Digital License";

    public DigitalArt(String title, String artist, int price, boolean preview) {
        super(title, artist, price, DIGITAL_LICENSE, preview);
    }

    public DigitalArt(String title, String artist, int price) {
        super(title, artist, price, DIGITAL_LICENSE);
    }

    @Override
    public void license() {
        System.out.println("Applying Digital Art License");
        System.out.println("License Type : " + license);
        System.out.println("Features:");
        System.out.println("- Unlimited downloads");
        System.out.println("- Commercial use allowed");
    }
}
