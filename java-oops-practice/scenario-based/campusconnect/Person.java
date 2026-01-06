package campusconnect;

public class Person {
	protected String name;
	protected String email;
	private String id;
	
	public Person(String name, String email, String id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void printDeatails() {
		System.out.println("Details of the Person :");
		System.out.println("Name : " + name + "Email : " + email + " Id :" + id);
	}
	
	
	
}
