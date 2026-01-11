package artify;

public class Artify {

    public static void main(String[] args) {

        User zary = new User("Kutra Singh", 5000);

        Artwork digitalArt = new DigitalArt(
                "Fever Dreams",
                "Kanki KAur",
                1800,
                true
        );

        Artwork printArt = new PrintArt(
                "Silent Hills",
                "Libson prey",
                2500
        );

        digitalArt.showPreview();
        zary.purchaseArtwork(digitalArt);

        System.out.println("\nRemaining Balance: ₹" + zary.getWalletBalance());

        zary.purchaseArtwork(printArt);
    }
}
