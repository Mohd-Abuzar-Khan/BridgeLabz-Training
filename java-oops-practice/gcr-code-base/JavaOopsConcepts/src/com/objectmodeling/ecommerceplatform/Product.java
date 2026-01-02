package com.objectmodeling.ecommerceplatform;

//Represents a product in the e-commerce system
public class Product {

 private int productId;
 private String name;
 private double price;

 // Constructor
 public Product(int productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }

 // Getter for product price
 public double getPrice() {
     return price;
 }

 // Getter for product name
 public String getName() {
     return name;
 }
}
