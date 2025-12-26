import java.util.Scanner;

public class CoffeeCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gstRate = 0.05;
		
		String[][] menu = {
            {"Latte", "80"},
            {"Black Coffee", "150"},
            {"Chai", "90"},
            {"Cappuccino", "120"},
            {"Espresso", "140"},
            {"Mocha", "160"},
            {"Americano", "130"},
            {"Cold Coffee", "110"},
            {"Flat White", "145"},
            {"Irish Coffee", "180"}
        };
		
		 while (true) {
            System.out.println("\n MENU ");

            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i][0] + " - " + menu[i][1] + " Rupees");
            }

            System.out.println("\nType coffee name to order or type 'exit' to quit:");
            String coffee = sc.nextLine();

            if (coffee.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting!  Have a great day!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < menu.length; i++) {
                if (menu[i][0].equalsIgnoreCase(coffee)) {

                    double price = Double.parseDouble(menu[i][1]);
                    double total = price * quantity;
                    double gst = total * gstRate;
                    double finalAmount = total + gst;

                    System.out.println("\nFinal Bill");
                    System.out.println("Coffee: " + menu[i][0]);
                    System.out.println("Quantity: " + quantity);
           
		    System.out.println("Base Price: " + (int)total + " Rupees");
                    System.out.println("GST : " + (int)gst);
                    System.out.println("Total Amount: " + (int)finalAmount + " Rupees");

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Coffee not available. Please choose from the menu.");
            }
        }

        sc.close();
		
	}
}