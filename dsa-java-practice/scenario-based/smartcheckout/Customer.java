package smartcheckout;

import java.util.HashMap;
public class Customer {

    protected String name;

    // Stores item names with their requested quantities
    protected HashMap<String, Integer> shoppingList = new HashMap<>();

    // Initializes customer with a name
    public Customer(String name) {
        this.name = name;
    }

    // Returns customer name
    public String getName() {
        return name;
    }

    // Adds a valid item and quantity to the shopping list
    public void addItem(String itemName, int quantity) {

        if (!isValidItemRequest(itemName, quantity)) {
            System.out.println("Invalid item or quantity");
            return;
        }

        shoppingList.merge(itemName, quantity, Integer::sum);
        System.out.println("Added " + quantity + " " + itemName + " to the shopping list of " + name);
    }

    // Calculates total bill based on store price and stock availability
    public double checkout(HashMap<String, Double> prices, HashMap<String, Integer> stock) {

        double total = 0.0;

        for (HashMap.Entry<String, Integer> entry : shoppingList.entrySet()) {
            total += processItem(entry, prices, stock);
        }

        return total;
    }

    // Prints the customer's current shopping list
    public void printList() {
        System.out.println("Shopping list for " + name + ": " + shoppingList);
    }

    // Validates item name and requested quantity
    private boolean isValidItemRequest(String itemName, int quantity) {
        return itemName != null && !itemName.isBlank() && quantity > 0;
    }

    // Processes a single item purchase and updates stock accordingly
    private double processItem(
            HashMap.Entry<String, Integer> entry,
            HashMap<String, Double> prices,
            HashMap<String, Integer> stock
    ) {

        String item = entry.getKey();
        int desiredQty = entry.getValue();

        double price = prices.getOrDefault(item, 0.0);
        int available = stock.getOrDefault(item, 0);

        if (price <= 0 || available <= 0) {
            return 0.0;
        }

        int purchasedQty = Math.min(desiredQty, available);
        stock.put(item, available - purchasedQty);

        return purchasedQty * price;
    }
}
