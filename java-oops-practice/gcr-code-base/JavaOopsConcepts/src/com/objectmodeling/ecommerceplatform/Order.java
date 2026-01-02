package com.objectmodeling.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

// Represents an order placed by a customer
public class Order {

    private int orderId;

    // An order can contain multiple products
    private List<Product> products;

    // Constructor
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to order.");
    }

    // Calculate total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Getter for order ID
    public int getOrderId() {
        return orderId;
    }
}
