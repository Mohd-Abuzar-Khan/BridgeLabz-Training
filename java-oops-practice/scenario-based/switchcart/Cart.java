package switchcart;
//Manages products, pricing, and checkout operations

//ONLY this class can update total price (encapsulation)
import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

 // List holding all products added to the cart
 private List<Product> products;

 // Total price before discounts
 private double totalPrice;

 // Default constructor initializes empty cart
 public Cart() {
     products = new ArrayList<>();
     totalPrice = 0.0;
 }

 // Constructor for cart with pre-selected products
 public Cart(List<Product> products) {
     this.products = products;
     calculateTotal();
 }

 // Adds a product to the cart and recalculates total price
 public void addProduct(Product product) {
     products.add(product);
     calculateTotal();
 }

 // Calculates total price using price * quantity for each product
 // Kept private to prevent external price manipulation
 private void calculateTotal() {
     totalPrice = 0;
     for (Product p : products) {
         totalPrice += p.getTotalPrice();
     }
 }

 // Applies discount polymorphically based on product type
 @Override
 public double applyDiscount() {
     double totalDiscount = 0;
     for (Product p : products) {
         totalDiscount += p.getDiscount();
     }
     return totalDiscount;
 }

 // Generates and prints the final bill
 @Override
 public void generateBill() {
     double discount = applyDiscount();
     double finalAmount = totalPrice - discount;

     System.out.println("----- SwiftCart Bill -----");

     // Display individual product details
     for (Product p : products) {
         System.out.println(
             p.getName() + " | Qty: " + p.getQuantity() +
             " | Price: ₹" + p.getTotalPrice()
         );
     }

     System.out.println("--------------------------");
     System.out.println("Total Price: ₹" + totalPrice);
     System.out.println("Discount: ₹" + discount);
     System.out.println("Final Amount: ₹" + finalAmount);
 }
}
