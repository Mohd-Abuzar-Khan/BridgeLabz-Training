package com.inheritance.multilevelinheritance.retailordermanagement;

public class Main {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(
                "ORD123",
                "2026-01-02",
                "TCK88",
                "2026-01-05"
        );

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}