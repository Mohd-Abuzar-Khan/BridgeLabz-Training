package foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
            System.out.println(item + " added to order");
        } else {
            System.out.println(item + " is out of stock");
        }
    }

    public void addCombo(ComboMeal combo) {
        System.out.println("Adding combo: " + combo.getComboName());
        for (FoodItem item : combo.getItems()) {
            addItem(item);
        }
    }

    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice(); // operator usage
        }
        total -= applyDiscount(); // polymorphism
    }

    // Polymorphism – discount varies by order value
    public double applyDiscount() {
        if (total >= 1000) return total * 0.15;
        if (total >= 500) return total * 0.10;
        return 0;
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully!");
        System.out.println("Total Items: " + items.size());
        System.out.println("Final Bill: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled. Refund initiated.");
    }
}
