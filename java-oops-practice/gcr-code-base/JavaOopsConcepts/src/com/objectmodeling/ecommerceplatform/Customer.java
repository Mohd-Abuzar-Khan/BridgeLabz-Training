package com.objectmodeling.ecommerceplatform;
import java.util.ArrayList;
import java.util.List;

// Represents a customer in the e-commerce system
public class Customer {

    private int customerId;
    private String name;

    // A customer can place multiple orders
    private List<Order> orders;

    // Constructor
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with ID: " + order.getOrderId());
    }

    // Getter for customer name
    public String getName() {
        return name;
    }
}
