package foodloop;

import java.util.Arrays;

public class FoodLoop {

    public static void main(String[] args) {

        FoodItem paneer = new VegItem("Paneer Butter Masala", 250, 5);
        FoodItem burger = new VegItem("Veg Burger", 120, 10);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 350, 3);

        ComboMeal lunchCombo = new ComboMeal(
                "Lunch Combo",
                Arrays.asList(paneer, burger, chicken)
        );

        Order order = new Order();

        order.addItem(burger);
        order.addCombo(lunchCombo);

        order.placeOrder();
    }
}
