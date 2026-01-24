package sorting.movietime;

import java.time.LocalTime;

public class MovieTime {

	static int numberOfShows = 0;
	static Show[] shows = new Show[numberOfShows];
	
	public static void addShow(String name, LocalTime time) {
		Show show = new Show(name, time);
		
		// Dynamically increasing the size of an array
		if(numberOfShows <= shows.length) {
			Show[] temp = new Show[numberOfShows + 1];

			for (int i = 0; i < numberOfShows; i++) {
			    temp[i] = shows[i];
			}

			shows = temp;
			shows[numberOfShows] = show;
			numberOfShows++;

			
			System.out.println(show.name + " added to leader board successfully ");

			
		}

		int j = numberOfShows - 2;
		while(j >= 0 && shows[j].time.isAfter(show.time)) {
			
			shows[j+1] = shows[j];
			j--;
		}
		
		shows[j + 1] = show;
		
	}
	
	// Static method to display Show details
		public static void displayInfo() {
			System.out.println("----------------------------------------------------------");
			System.out.println("-------------- Show Registration Details ---------------");
			System.out.println("----------------------------------------------------------");
			System.out.println("Show Name\tShow Time");
			System.out.println("------------------------------------");
			for (int i = 0; i < numberOfShows; i++) {
				System.out.println(shows[i].name + "\t\t" + shows[i].time);
			}
			System.out.println("------------------------------------");
		}

	


	public static void main(String[] args) {
		
		// Adding Show to array list
		addShow("Salaar", LocalTime.of(1, 20, 33));
		addShow("Welcome", LocalTime.of(10, 20, 33));
		addShow("KGF", LocalTime.of(19, 20, 33));
		addShow("Tiger", LocalTime.of(1, 23, 33));
		addShow("Sultan", LocalTime.of(1, 22, 33));
		addShow("Pathan", LocalTime.of(1, 20, 31));
		addShow("Dangal", LocalTime.of(1, 20, 13));

		// Calling method to display Show details
		displayInfo();
		

	}

}
