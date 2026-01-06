package campusconnect;

public class Teacher extends Person {
	
	protected String department;

	public Teacher(String name, String email, String id, String department) {
		super(name, email, id);
		this.department = department;
	}
	
	public void printDetails() {
		System.out.println("Details of the Tecaher/Faculty :");
		System.out.println("\nName : " + name + "\nEmail : " + email + "\nId :" + getId() + "\nDeapartment : " + department);
	}
	
}
