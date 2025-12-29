import java.util.Scanner;

public class DiscountDashboard {
	
	//Method to display final bill and discount details
    public static void displayDashboard(String[][] arr, int items, int totalBill) {

        System.out.println("\n---------------- Discount Dashboard ----------------");
        System.out.println("\tItem\t\tPrice");
		
		// Display all items with prices
        for (int i = 0; i < items; i++) {
            System.out.println("\t" + arr[i][0] + "\t\t" + arr[i][1]);
        }

        System.out.println("\nTotal Price: " + totalBill);

        double discount = 0;

        if (totalBill > 1500) {
            discount = 0.40;
        } else if (totalBill > 1000) {
            discount = 0.35;
        } else if (totalBill > 500) {
            discount = 0.25;
        }
	
		// Applying discount if applicable
        if (discount > 0) {
            double finalBill = totalBill - (totalBill * discount);
            System.out.println("Discount Applied: " + (int)(discount * 100) + "%");
            System.out.println("Final Bill: " + finalBill);
        } else {
            System.out.println("No Discount Applied");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		 // Display Christmas discount offers
        System.out.println("------------- Christmas Discount System -------------");
		System.out.println("Total Bill > 500   --> 25% OFF");
        System.out.println("Total Bill > 1000  --> 35% OFF");
        System.out.println("Total Bill > 1500  --> 40% OFF");
		System.out.println("----------------------------------\n");
		
		// Taking number of items as input
        System.out.print("Enter number of items: ");
        int items = sc.nextInt();
        sc.nextLine(); 
		
		// 2D array to store item name and price
        String[][] arr = new String[items][2];
		
        for (int i = 0; i < items; i++) {

            System.out.print("Enter name of item " + (i + 1) + ": ");
            arr[i][0] = sc.nextLine();

            System.out.print("Enter price of item " + (i + 1) + ": ");
            arr[i][1] = sc.nextLine();
        }

		// Calculate total bill
        int totalBill = 0;
        for (int i = 0; i < items; i++) {
            totalBill += Integer.parseInt(arr[i][1]);
        }

		 // Display final dashboard
        displayDashboard(arr, items, totalBill);

        sc.close();
    }
}
