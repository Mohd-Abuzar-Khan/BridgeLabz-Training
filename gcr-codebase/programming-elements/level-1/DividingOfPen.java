// Created DividingOfPen Class to calculate dividing of pen among Students
public class DividingOfPen{
	public static void main(String[] args){
		
		// Created a variable for indicating number of pen
		int pen = 14;
		
		// Created a variable for indicating number of student 
		int students = 3;
		
		// Created a variable for indicating number of pen per person
		int penPerStudent = pen / students;
		
		// Created a variable for indicating not distributed pen
		int remainingPen = pen % students;
		
		// Displaying pen perstudent and remaining pen
		System.out.println("The Pen Per Students is " + penPerStudent + " and the remaining pen not disturbed is " + remainingPen);
		
	}
}