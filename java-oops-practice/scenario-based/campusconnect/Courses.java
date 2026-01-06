package campusconnect;

import java.util.ArrayList;

public class Courses {
	protected String courseName;
	protected Teacher teacher;
	public ArrayList<Student> course = new ArrayList<>();
	
	public Courses(String courseName, Teacher teacher) {
		this.courseName = courseName;
		this.teacher = teacher;
	}
	
	public void addStudent(Student student) {
		course.add(student);
	}
	
	public void removeStudent(Student student) {
		course.remove(student);
	}
	
	public void displayStudent() {
		for(int i = 0; i < course.size(); i++ ) {
			course.get(i).printDetails();
		}
	}
	
}
