package browserbuddy;

public class Tabs {

    private Page head;
    private Page tail;
    private Page current;
    private int size;
    private final String name;

    public Tabs(String name) {
        this.name = name;
        this.size = 0;
    }

    // Visit a new page
    public void addPage(Page page) {

        if (head == null) {
            head = tail = current = page;
        } else {
            tail.next = page;
            page.prev = tail;
            tail = page;
            current = page;
        }
        size++;
        System.out.println("Visited: " + page.data);
    }

    // Move forward in history
    public void moveForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved forward to: " + current.data);
        } else {
            System.out.println("Already at the last page");
        }
    }

    // Move backward in history
    public void moveBackward() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved back to: " + current.data);
        } else {
            System.out.println("Already at the first page");
        }
    }

    // Display full history
    public void displayHistory() {
        Page temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Page getCurrentPage() {
        return current;
    }

    public int getSize() {
        return size;
    }

    public String getTabName() {
        return name;
    }
}
