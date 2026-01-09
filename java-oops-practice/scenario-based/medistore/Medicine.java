package medistore;

import java.util.Date; // Used to handle medicine expiry dates

public class Medicine implements ISellable {

    // Name of the medicine (accessible to subclasses)
    protected String name;

    // Price is kept private to protect sensitive pricing logic
    private int price;

    // Expiry date of the medicine
    protected Date expiryDate;

    // Quantity in stock (encapsulated to control stock updates)
    private int quantity;

    // Constructor with default quantity set to 1
    public Medicine(String name, int price, Date expiryDate) {
        this.name = name;           // Assign medicine name
        this.price = price;         // Assign medicine price
        this.expiryDate = expiryDate; // Assign expiry date
        this.quantity = 1;          // Default quantity
    }

    // Constructor allowing custom quantity
    public Medicine(String name, int price, Date expiryDate, int quantity) {
        this.name = name;           // Assign medicine name
        this.price = price;         // Assign medicine price
        this.expiryDate = expiryDate; // Assign expiry date
        this.quantity = quantity;   // Assign initial stock quantity
    }

    // Getter method to access price safely
    public int getPrice() {
        return price;
    }

    // Setter method to update price in a controlled way
    public void setPrice(int price) {
        this.price = price;
    }

    // Getter method to check current stock quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method to update stock quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to add new stock to existing quantity
    public void addStock(int amount) {
        quantity += amount; // Increase stock by given amount
    }

    // Method to calculate and display discount on price
    public void applyDiscount() {
        double discount = (price * 0.15); // Calculate 15% discount
        System.out.println("Your discounted price is " + discount);
    }

    // Method to sell medicine and reduce stock
    @Override
    public void sell(int quantity) {
        this.quantity -= quantity; // Reduce stock after selling
        System.out.println(
            "Here is your medicine. Now you have total of " 
            + this.quantity + " left in the stock"
        );
    }

    // Method to check whether the medicine is expired
    @Override
    public void checkExpiry() {
        // Compare expiry date with current date
        if (expiryDate.before(new Date())) {
            System.out.println("This Medicine is Expired");
        } else {
            System.out.println("This Medicine is not Expired");
        }
    }
}
