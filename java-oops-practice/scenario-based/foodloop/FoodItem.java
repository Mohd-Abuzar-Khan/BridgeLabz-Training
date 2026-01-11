package foodloop;

public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;
    private int stock; // hidden (encapsulation)

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    protected void reduceStock() {
        if (stock > 0) {
            stock--;
        }
    }

    public double getPrice() {
        return price;
    }

    public abstract String getType(); // Polymorphism hook

    @Override
    public String toString() {
        return name + " (" + getType() + ") - ₹" + price;
    }
}
