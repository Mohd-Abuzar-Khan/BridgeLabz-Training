package campusconnect;

public class CampusConnect {
	public static void main(String[] args) {
		
		
		// Creating Object of class Teacher to represent teachers in class
		Teacher t1 = new Teacher("Prof. Yadav", "yadavteachs@gmail.com","JKQ893L","Mechanical");
		Teacher t2 = new Teacher("Prof. Mishra", "mishrateaches@gmail.com", "MQK973L", "Civil");
		
		// Creating object of class courses to represent courses available 
		Courses c1 = new Courses("Intro to Mechanics",t1);
		Courses c2 = new Courses("Science of Building Homes", t2);
		
		// Created object of Student to represent student in the system
		Student s1 = new Student("Ananya Shukla","shukla198@gmail.com","0192MC928");
		Student s2 = new Student("Maha Laxmi","Laxmi158@gmail.com","0192CL9728");
		
		s1.enrollcourse(c1);
		s2.enrollcourse(c2);
		
		s1.printDeatails();
		t1.printDeatails();
		
		s1.enrollcourse(c2);
		
		c2.displayStudent();
		
		s1.addGrade(55);
		s2.addGrade(74);
		s1.addGrade(65);
		s1.addGrade(97);
		s2.addGrade(77);
		
		s1.calculateGrade();
		s2.calculateGrade();
		
	}
}
