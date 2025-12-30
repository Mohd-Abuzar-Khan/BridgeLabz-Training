import java.util.Scanner;

//Created a class SmartParkingLot Class to park user car
public class TrainReservation {

    public static void main(String[] args) {
		
		//Details regarding Seat Available in train
		int totalSpots = 20;
		int vacantSpots = 20;
		int occupiedSpots = 0;

        Scanner sc = new Scanner(System.in);
		boolean isExit = true;
		boolean isFull = true;
        
        while(isExit && isFull) {
			
			//Displaying option for user to choose from
			System.out.println("\nMenu");
			System.out.println("--------------------->");
			System.out.println("Choose an option from the menu:\n1.Book a Ticket \n2.Show Occupancy \n3.Exit");
			int choice = sc.nextInt();
			
			// Using Switch Case to decide which action to perform
			switch(choice){
				
				// When user decides to park his car
				case 1 : {
					
					System.out.println("-------------------------");
					if (occupiedSpots == totalSpots){
						System.out.println("Sorry! All the spots are occupied");
						isFull = false;
						break;
					} else {
						System.out.println("Congratulations! Your ticket is succesfully booked at Seat no. : " + (occupiedSpots + 1));
						occupiedSpots++;
						vacantSpots--;
						System.out.println(occupiedSpots);
						
					}
					break;
				}
				
				// When user decided to see the occupancy to check for space availabile
				case 2: {
					
					System.out.println("-------------------------");
					System.out.println("Total Number of Booking Spots :" + totalSpots);
					System.out.println("Number of Booked Spots are :" + occupiedSpots);
					System.out.println("Number of Available Spots are :" + vacantSpots);
					break;
				}
				
				// when user decide to exit our program
				case 3: {
					System.out.println("Thank you for using our service");
					isExit = false;
					break;
				}
				
				// Exception handeling for choice out of Menu
				default : {
					
					System.out.println("-------------------------");
					System.out.println("Please choose from option mention below");
				}
			}
		
		}

        sc.close();
    }
}
