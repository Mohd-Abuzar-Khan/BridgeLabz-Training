package switchcart;

//Entry point of the SwiftCart application
public class Main {

 public static void main(String[] args) {

     // Create perishable product
     Product milk = new PerishableProduct(
             "Milk", 50, "Dairy", 2, 2
     );

     // Create non-perishable product
     Product rice = new NonPerishableProduct(
             "Rice", 60, "Grains", 5
     );

     // Create cart and add products
     Cart cart = new Cart();
     cart.addProduct(milk);
     cart.addProduct(rice);

     // Generate final bill
     cart.generateBill();
 }
}
