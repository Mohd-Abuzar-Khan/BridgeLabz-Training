package ambulanceroute;

public class Hospital {
	
	private  Rooms head;
	private Rooms tail;
	
	public Hospital() {
		this.head = null;
		this.tail = null;
	}
	
	public  void addRooms() {
		Rooms newNode = new Rooms();
		if(head == null) {
			head = newNode;
			tail = newNode;
			
			newNode.next = head;
		} else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
			
		}
	}
	
	
	
}
