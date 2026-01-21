package parcletracker;

public class ParcelTracker {
	Parcel head;
	Parcel current;
	
	void addStage(String stage) {
		Parcel parcel = new Parcel(stage);
		if (head == null) {
			head = current = parcel;
		} else {
			current.next = parcel;
			current = parcel;
		}
		
	}
	
	void displayStatus() {
		if(current == null) {
			System.out.println("\n Item is Missing");
			return;
		}
		System.out.println("Current status - > " + current.parcelStage);
	}
	
	//Method to display parcel all stages
	void displayAllStatus() {
		if (current == null) {
			System.out.println("Item is lost");
			return;
		}
		Parcel temp = head;
		while (temp != null) {
			System.out.print(temp.parcelStage + " -> ");
			temp = temp.next;
		} 
		System.out.println();

	}

	public static void main(String[] args) {

		// Creating object of parcel
		ParcelTracker parcel1 = new ParcelTracker();

		// Adding parcel 1 stages
		parcel1.addStage("Packed");
		parcel1.addStage("Shipped");
		parcel1.addStage("In Transit");
		parcel1.addStage("Delivered");

		// Displaying parcel 1 current stage
		parcel1.displayStatus();

		// Displaying parcel 1 all stages
		parcel1.displayAllStatus();

		// Creating object of parcel
		ParcelTracker parcel2 = new ParcelTracker();

		// Displaying parcel current and all status
		parcel2.displayStatus();
		parcel2.displayAllStatus();

		// Creating object of parcel
		ParcelTracker parcel3 = new ParcelTracker();

		// Adding parcel stages
		parcel3.addStage("Packed");
		parcel3.addStage("Shipped");
		parcel3.addStage("In Transit");

		// Displaying current and all stages of parcel
		parcel3.displayStatus();
		parcel3.displayAllStatus();

	}
	
	
}
