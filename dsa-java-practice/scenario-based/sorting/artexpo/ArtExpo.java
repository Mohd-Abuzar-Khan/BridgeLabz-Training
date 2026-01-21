package sorting.artexpo;

//Importing localTime from java.time package
import java.time.LocalTime;

//Main class
public class ArtExpo {

	static int listSize = 0;
	static Artist[] artistList = new Artist[listSize];

	// Static method to add artist to array list
	public static void addArtist(String name, LocalTime time) {
		
		Artist artist = new Artist(name, time);
		
		if (listSize <= artistList.length) {
			
			Artist[] temp = new Artist[++listSize];
			
			for (int i = 0; i < listSize - 1; i++) {
				temp[i] = artistList[i];
			}
			
			temp[listSize - 1] = artist;
			artistList = temp;
			System.out.println(listSize + ") Artist registered successfully ");
		}

		// Applying insertion sort at real time
		int j = listSize - 2;
		
		while (j >= 0 && artistList[j].registrationTime.isAfter(artist.registrationTime)) {

			artistList[j + 1] = artistList[j];
			j--;
		}
		artistList[j + 1] = artist;
	}

	// Static method to display artist details
	public static void displayInfo() {
		System.out.println("----------------------------------------------------------");
		System.out.println("-------------- Artist Registration Details ---------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("Artist Name\tRegistration Time");
		System.out.println("------------------------------------");
		for (int i = 0; i < listSize; i++) {
			System.out.println(artistList[i].name + "\t\t" + artistList[i].registrationTime);
		}
		System.out.println("------------------------------------");
	}

	// Main method
	public static void main(String[] args) {

		// Adding artist to array list
		addArtist("Abuzar", LocalTime.of(1, 20, 33));
		addArtist("Rahul", LocalTime.of(10, 20, 33));
		addArtist("Kartik", LocalTime.of(19, 20, 33));
		addArtist("Karan", LocalTime.of(1, 23, 33));
		addArtist("Tanishk", LocalTime.of(1, 22, 33));
		addArtist("Suraj", LocalTime.of(1, 20, 31));
		addArtist("Gopal", LocalTime.of(1, 20, 13));

		// Calling method to display artist details
		displayInfo();

	}

}