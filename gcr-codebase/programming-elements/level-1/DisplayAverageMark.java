
// Created DisplayAverageMark class to calculate average marks scored by Sam in PCM 
public class DisplayAverageMark {
	public static void main(String[] args){

		// Creating a String variable name to indicate the name of the person 
		String name = "Sam";

		// Creating a integer variable math to indicate mark obtain in math
		int math = 94;

		// Creating a integer variable physics to indicate mark obtain in physics
		int physics = 95;

		// Creating a integer variable Chemistry to indicate mark obtain in Chemistry 
		int chemistry = 100;

		// Creating a integer variable averagemarks to indicate average mark obtain in PCM
		int averageMarks = (math + physics + chemistry)/3;

		// Displaying the result
		System.out.println(name + "'s average mark in PCM is " + averageMarks);
	}
}