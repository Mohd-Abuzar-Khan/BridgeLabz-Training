import java.util.Scanner;

public class PhoneRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean continueRecharge = true;
		
		// Displaying Phone recharge Simulator details
        System.out.println("-------Welcome to Phone Recharge Simulator-------");

        while (continueRecharge) {
			
			// Taking operator and amount as an input using switch and case
            System.out.println("\nChoose your mobile operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. Vi");
            System.out.println("4. BSNL");
            System.out.print("Enter choice: ");

            int operator = sc.nextInt();

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            double bonus = 0;

            // Applying offers using switch
            switch (operator) {
                case 1:
                    System.out.println("Operator: Jio");
                    if (amount >= 299) {
                        bonus = 50;
                    }
                    break;

                case 2:
                    System.out.println("Operator: Airtel");
                    if (amount >= 249) {
                        bonus = 40;
                    }
                    break;

                case 3:
                    System.out.println("Operator: Vi");
                    if (amount >= 199) {
                        bonus = 30;
                    }
                    break;

                case 4:
                    System.out.println("Operator: BSNL");
                    if (amount >= 149) {
                        bonus = 20;
                    }
                    break;

                default:
                    System.out.println("Invalid operator selected. Please choose from the option");
                    continue;
            }

            balance += amount + bonus;

            System.out.println("Recharge Amount: ₹" + amount);
            System.out.println("Bonus Received: ₹" + bonus);
            System.out.println("Updated Balance: ₹" + balance);

            // Asking user to continue
            System.out.print("\nDo you want to recharge again? : ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                continueRecharge = false;
            }
        }

        System.out.println("\nThank you for using Phone Recharge Simulator!");
        System.out.println("Final Balance: ₹" + balance);

        sc.close();
    }
}
