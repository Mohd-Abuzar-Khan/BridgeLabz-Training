package bookbazar;

public class PrintedBook extends Book {

    private double shippingCost;

    public PrintedBook(String title, String author, double price, int stock, double shippingCost) {
        super(title, author, price, stock);
        this.shippingCost = shippingCost;
    }

    @Override
    public double applyDiscount() {
        return (price + shippingCost) * 0.95; // 5% discount
    }
}
