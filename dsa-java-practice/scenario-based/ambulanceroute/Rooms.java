package ambulanceroute;

public class Rooms {
	private String data;
	public Rooms next;
	
	public Rooms(){
		this.data = null;
		this.next = null;
	}

	
	public Rooms(String data){
		this.setData(data);
		this.next = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
