package artify;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int walletBalance;
    private List<Artwork> purchasedArtworks;

    public User(String name, int walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
        this.purchasedArtworks = new ArrayList<>();
    }

    public void purchaseArtwork(Artwork artwork) {

        if (artwork.isSold()) {
            System.out.println("Artwork already sold: " + artwork.getTitle());
            return;
        }

        if (walletBalance < artwork.getPrice()) {
            System.out.println("Insufficient balance to purchase " + artwork.getTitle());
            return;
        }

        walletBalance -= artwork.getPrice();   // operator usage
        artwork.markAsSold();
        artwork.license();

        purchasedArtworks.add(artwork);

        System.out.println(name + " successfully purchased \"" + artwork.getTitle() + "\"");
    }

    public int getWalletBalance() {
        return walletBalance;
    }
}
