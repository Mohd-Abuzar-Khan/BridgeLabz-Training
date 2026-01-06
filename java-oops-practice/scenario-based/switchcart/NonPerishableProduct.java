package switchcart;

//NonPerishableProduct.java
//Represents products with long shelf life (e.g., Rice, Oil)
public class NonPerishableProduct extends Product {

 // Constructor initializes non-perishable product
 public NonPerishableProduct(String name, double price,
                             String category, int quantity) {
     super(name, price, category, quantity);
 }

 // Fixed discount for non-perishable products
 @Override
 public double getDiscount() {
     return getTotalPrice() * 0.05;
 }
}
