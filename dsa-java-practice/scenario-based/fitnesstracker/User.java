package sorting.fitnesstracker;

public class User {

	protected String name;
	protected int steps;
	private String id;
	
	
	public User(String name, int steps, String id) {
		super();
		this.name = name;
		this.steps = steps;
		this.setId(id);
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
	

}
