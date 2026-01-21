package sorting.artexpo;

//Importing local time from java.time package
import java.time.LocalTime;

//Artist class to store artist details
public class Artist {

	//Instance of Class
	String name;
	LocalTime registrationTime;

	//Parameterized constructor
	public Artist(String name, LocalTime registrationTime) {
		this.name = name;
		this.registrationTime = registrationTime;
	}

}