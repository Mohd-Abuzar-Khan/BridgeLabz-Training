package com.objectmodeling.ecommerceplatform;

public class Main {
    public static void main(String[] args) {

        // Create customer
        Customer customer = new Customer(1, "Abuzar");

        // Create products
        Product p1 = new Product(101, "Laptop", 75000);
        Product p2 = new Product(102, "Mouse", 1500);
        Product p3 = new Product(103, "Keyboard", 2500);

        // Create order
        Order order1 = new Order(5001);

        // Add products to order
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        // Customer places the order
        customer.placeOrder(order1);

        // Display total amount
        System.out.println("Total Order Amount: ₹" + order1.calculateTotal());
    }
}
