package artify;

public class PrintArt extends Artwork {

    private static final String PRINT_LICENSE =
            "Limited Physical Print License";

    private static final int MAX_PRINT_COPIES = 50;

    public PrintArt(String title, String artist, int price, boolean preview) {
        super(title, artist, price, PRINT_LICENSE, preview);
    }

    public PrintArt(String title, String artist, int price) {
        super(title, artist, price, PRINT_LICENSE);
    }

    @Override
    public void license() {
        System.out.println("Applying Print Art License");
        System.out.println("License Type : " + license);
        System.out.println("Print Limit  : " + MAX_PRINT_COPIES + " copies");
    }
}
