package campusconnect;

import java.util.ArrayList;


public class Student extends Person implements ICourseAction {
	
	private ArrayList<Integer> grades = new ArrayList<>();

	public Student(String name, String email, String id) {
		super(name, email, id);
	}
	
	public void addGrade(int grade) {
		grades.add(grade);
	}

	@Override
	public void enrollcourse(Courses course) {
		course.addStudent(this);
		System.out.println("Congratulation! you have enrolled in " + course.courseName + " under the guidance of " + course.teacher.name);
		
	}

	@Override
	public void dropcourse(Courses course) {
		course.removeStudent(this);
		System.out.println("Congratulation! you have enrolled in " + course.courseName + " under the guidance of " + course.teacher.name);
		
	}
	
	public void calculateGrade() {
		
		int sum = 0;
		for(int i = 0; i < grades.size(); i++ ) {
			sum += grades.get(i);    
		}
		
		System.out.println("The average grade of student "+ this.name +" is " + (sum / grades.size()));
		
	}
	
	public void printDetails() {
		System.out.println("Details of the Student :");
		System.out.println("\nName : " + name + "\nEmail : " + email + "\nId :" + getId());
		System.out.println("Grades : \n");
		for(int i = 0; i < grades.size(); i++ ) {
			System.out.print(grades.get(i) + " "); 
		}
  
	}
	
	
	
	
}
