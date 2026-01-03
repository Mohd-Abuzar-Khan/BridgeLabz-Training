package ewallet;

//Main class to run the application
public class Main {

 public static void main(String[] args) {

     // Creating user with PersonalWallet and referral bonus
     User arif = new User(
             "Arif",
             new PersonalWallet(2000, true)
     );

     // Creating user with BusinessWallet (no referral bonus)
     User shop = new User(
             "TechStore",
             new BusinessWallet(10000, false)
     );

     // Display initial balances
     System.out.println("Arif Balance: ₹" + arif.getWallet().getBalance());
     System.out.println("Shop Balance: ₹" + shop.getWallet().getBalance());

     System.out.println("\n--- Transfers ---");

     // Personal wallet transfer
     arif.getWallet().transferTo(shop, 1000);

     // Business wallet transfer
     shop.getWallet().transferTo(arif, 2000);

     // Display final balances
     System.out.println("\n--- Final Balances ---");
     System.out.println("Arif Balance: ₹" + arif.getWallet().getBalance());
     System.out.println("Shop Balance: ₹" + shop.getWallet().getBalance());
 }
}
