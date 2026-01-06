package switchcart;
//Represents products that expire (e.g., Milk, Vegetables)

//Provides higher discounts when expiry is near
public class PerishableProduct extends Product {

 // Days remaining before the product expires
 private int expiryDays;

 // Constructor initializes perishable product details
 public PerishableProduct(String name, double price, String category,
                          int quantity, int expiryDays) {
     super(name, price, category, quantity);
     this.expiryDays = expiryDays;
 }

 // Override discount logic based on expiry duration
 @Override
 public double getDiscount() {

     // Higher discount if product is close to expiry
     if (expiryDays <= 3) {
         return getTotalPrice() * 0.20;
     }

     // Standard perishable discount
     return getTotalPrice() * 0.10;
 }
}


