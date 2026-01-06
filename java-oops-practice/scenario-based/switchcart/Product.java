package switchcart;

//It defines common properties and enforces discount behavior via abstraction
public abstract class Product {

 // Name of the product (e.g., Milk, Rice)
 private String name;

 // Price per unit (protected so subclasses can access but outsiders cannot)
 protected double price;

 // Category of product (e.g., Dairy, Grains)
 private String category;

 // Number of units added to cart
 protected int quantity;

 // Constructor to initialize common product attributes
 public Product(String name, double price, String category, int quantity) {
     this.name = name;
     this.price = price;
     this.category = category;
     this.quantity = quantity;
 }

 // Getter for product name
 public String getName() {
     return name;
 }

 // Getter for product category
 public String getCategory() {
     return category;
 }

 // Getter for quantity
 public int getQuantity() {
     return quantity;
 }

 // Calculates total price of this product (price * quantity)
 // Price calculation is encapsulated inside the class
 public double getTotalPrice() {
     return price * quantity;
 }

 // Abstract method to enforce discount logic in
 // Enables polymorphism in discount calculation
 public abstract double getDiscount();
}