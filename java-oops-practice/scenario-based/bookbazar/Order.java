package bookbazar;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private String status;
    private List<Book> books;

    public Order(int orderId) {
        this.orderId = orderId;
        this.status = "CREATED";
        this.books = new ArrayList<>();
    }

    public void addBook(Book book, int quantity) {
        if (book.getStock() >= quantity) {
            book.updateStock(quantity);
            books.add(book);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Book book : books) {
            total += book.applyDiscount();
        }
        return total;
    }

    public String getStatus() {
        return status;
    }

    // Restricted access
    private void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}
