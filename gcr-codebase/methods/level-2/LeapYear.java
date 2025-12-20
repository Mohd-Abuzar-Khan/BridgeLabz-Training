// Importing dependencies to take input
import java.util.Scanner;
import java.lang.Math;

// Created a LeapYear class to check if any year is a leap year or not
public class LeapYear{
	
	public static void leapYear(int  year){
		// Checking if the year is a Leap Year using &&
        if (year >= 1582 && 
           ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {

            System.out.println(year + " is a Leap Year");

        } else {
            System.out.println(year + " is not a Leap Year");
        }
	}
	
	public static void main(String[] args){
		
		//Taking year as a input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year:");
        int year = sc.nextInt();
		
		// Calling leapYear to see if a number is Leap year or not
		leapYear(year);
		
		sc.close(); // Closing Scanner Object
	}

}
