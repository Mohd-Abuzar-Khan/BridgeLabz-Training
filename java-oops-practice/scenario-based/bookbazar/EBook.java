package bookbazar;

public class EBook extends Book {

    private double fileSize;

    public EBook(String title, String author, double price, int stock, double fileSize) {
        super(title, author, price, stock);
        this.fileSize = fileSize;
    }

    // Polymorphism
    @Override
    public double applyDiscount() {
        return price * 0.90; // 10% discount
    }
}
