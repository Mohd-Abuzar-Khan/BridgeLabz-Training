import java.util.Scanner;

public class DistanceTracker{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Creating String Array Station for storing name of all the metro spots
        String[] stations = {
            "Central Station",
            "AIIMS",
            "Old Bhopal",
            "Moti Masjid",
            "City Market",
            "Rani Kamlapati",
            "Habibganj",
            "Airport Terminal"
        };

		// Created a Double Array for Storing distance travel in between station
        double[] distances = {1.5, 2.0, 1.2, 2.8, 1.6, 2.3, 1.9};
		
		// Created a flag for Checking if a person is still traveling
		boolean traveling = true;
		
		//Showing the Track route of Metro Line to the person
        System.out.println("\n------------ Bhopal Line Metro Route -------------\n");
	
		
		// Printing all the station in a map format using for loop
        for (int i = 0; i < stations.length; i++) {
            System.out.println("[" + stations[i] + "]");
            if (i < distances.length) {
                System.out.println("   |");
                System.out.println("   | " + distances[i] + " km");
                System.out.println("   |");
            }
        }
		
		System.out.println("");
		
		System.out.println("\n------------ Bhopal Line Metro Route -------------\n");
		
		int ind = 0;
		double total = 0;
		
		// Notifiying user at every stop about the station and asking if they want to get off
		while(traveling){
			System.out.println("We have arrived at " + stations[ind] + " Do you want to get off here!\n1.Yes\n2.No");
			int choice = sc.nextInt();
			ind++;
			switch(choice){
				case 1:
					System.out.println("\n--------------------------------------------------------------------------\n");
					System.out.println("Thank you for using our service! You have covered total distance of " + total + " km");
					System.out.println("\n--------------------------------------------------------------------------\n");
					traveling = false;
					break;
				case 2:
					
					// When person reaches the last stop
					if (ind < 7){
						total += distances[ind];
					break;
					}else{
					System.out.println("\n--------------------------------------------------------------------------\n");
					System.out.println("\n You Have reached the Final Station with Total Distance of 13.3 Km\n");
					System.out.println("\n--------------------------------------------------------------------------\n");
					traveling = false;
					}
				default:
					
					// When user enter input any other than 1 or 2
					if (ind < 7){
						total += distances[ind];
					break;
					}else{
					System.out.println("\n--------------------------------------------------------------------------\n");
					System.out.println("\n You Have reached the Final Station with Total Distance of 13.3 Km\n");
					System.out.println("\n--------------------------------------------------------------------------\n");
					traveling = false;
					}
			}
			
		}
		
		// Priniting total number of spots travled by 
        System.out.println("\nNumber of Total Stops Traveled: " + ind + "\n");
    }
}
