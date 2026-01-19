package parceltracker;

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
        if (current == null) {
            System.out.println("\nItem is missing");
            return;
        }
        System.out.println("\nCurrent Status -> " + current.parcelStage);
    }

    void displayAllStatus() {
        if (head == null) {
            System.out.println("Item is lost");
            return;
        }

        Parcel temp = head;
        while (temp != null) {
            System.out.print(temp.parcelStage);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Properly simulate parcel loss after a given stage
    void markParcelLostAfter(String stage) {
        Parcel temp = head;

        while (temp != null) {
            if (temp.parcelStage.equalsIgnoreCase(stage)) {
                temp.next = null;
                current = temp;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        System.out.println("Parcel Delivery Flow:");
        tracker.displayAllStatus();

        tracker.displayStatus();

        System.out.println("\nParcel lost during transit...");
        tracker.markParcelLostAfter("In Transit");

        tracker.displayStatus();
        tracker.displayAllStatus();
    }
}
