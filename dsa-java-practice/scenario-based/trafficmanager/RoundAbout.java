package trafficmanager;

public class RoundAbout {
	
	private Vehicle head = null;
	
	void addVehicle(String vehicleNumber) {
		Vehicle newVehicle = new Vehicle(vehicleNumber);
		
		// If there are no cars in round about
		if(head == null) {
			head = newVehicle;
			newVehicle.next = head;
			return;
			
		}
		
		// Insertion at the end of the list
		Vehicle temp = head;
	     while (temp.next != head) {
	         temp = temp.next;
	     }
	     
	     temp.next = newVehicle;
	     newVehicle.next = head;
	 }
	
	// Remove vehicle from roundabout
	 void removeVehicle(String vehicleNumber) {
	     if (head == null) {
	         System.out.println("Roundabout is empty");
	         return;
	     }

	     Vehicle curr = head;
	     Vehicle prev = null;

	     while (curr != head){
	         if (curr.vehicleNumber.equals(vehicleNumber)) {

	             // Only one vehicle
	             if (curr == head && curr.next == head) {
	                 head = null;
	             }
	             // Removing head
	             else if (curr == head) {
	                 Vehicle temp = head;
	                 while (temp.next != head) {
	                     temp = temp.next;
	                 }
	                 head = head.next;
	                 temp.next = head;
	             }
	             // Removing middle or last
	             else {
	                 prev.next = curr.next;
	             }

	             System.out.println("Vehicle removed: " + vehicleNumber);
	             return;
	         }

	         prev = curr;
	         curr = curr.next;

	     }

	     System.out.println("Vehicle not found in roundabout");
	 }
	 
	 // Display roundabout state
	 void display() {
	     if (head == null) {
	         System.out.println("Roundabout is empty");
	         return;
	     }

	     Vehicle temp = head;
	     System.out.print("Roundabout: ");
	     do {
	         System.out.print(temp.vehicleNumber + " -> ");
	         temp = temp.next;
	     } while (temp != head);
	     System.out.println("(back to " + head.vehicleNumber + ")");
	 }

	 // Check if roundabout is empty
	 boolean isEmpty() {
	     return head == null;
	 }

}
