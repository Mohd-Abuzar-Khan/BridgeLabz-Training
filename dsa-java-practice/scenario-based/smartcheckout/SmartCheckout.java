package smartcheckout;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class SmartCheckout {

    public static void displayQueue(Queue<Customer> line) {
        System.out.println("--------------------------------");
        System.out.print("Queue: ");
        for (Customer customer : line) {
            System.out.print(" -> " + customer.getName() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Store price and stock maps
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("apple", 0.99);
        prices.put("bread", 2.49);
        prices.put("milk", 1.79);
        prices.put("eggs", 3.49);

        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("apple", 10);
        stock.put("bread", 5);
        stock.put("milk", 8);
        stock.put("eggs", 12);

        // Queue of customers
        Queue<Customer> line = new ArrayDeque<>();

        Customer abuzar = new Customer("Abuzar");
        abuzar.addItem("apple", 4);
        abuzar.addItem("bread", 1);
        line.add(abuzar);

        Customer ananya = new Customer("Ananya");
        ananya.addItem("milk", 2);
        ananya.addItem("eggs", 6);
        line.add(ananya);

        Customer laxmi = new Customer("Laxmi");
        laxmi.addItem("apple", 7);
        laxmi.addItem("milk", 3);
        line.add(laxmi);

        displayQueue(line);

        // Process checkout queue
        while (!line.isEmpty()) {

            Customer customer = line.poll();

            System.out.println("--------------------------------");
            System.out.println("Checking out: " + customer.getName());
            customer.printList();

            double bill = customer.checkout(prices, stock);
            System.out.printf("Total for %s: $%.2f%n", customer.getName(), bill);

            System.out.println("Updated stock: " + stock);
            System.out.println("--------------------------------");
        }

        System.out.println("All customers processed. Final stock: " + stock);
    }
}
