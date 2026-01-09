package bookbazar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;
    private int stock;   // Encapsulated

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Inventory update only via method
    public void updateStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Not enough stock available!");
        }
    }
}
