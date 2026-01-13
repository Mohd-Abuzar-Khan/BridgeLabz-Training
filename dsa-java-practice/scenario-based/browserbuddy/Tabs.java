package browserbuddy;

public class Tabs {

    private Page head;
    private Page tail;
    private Page current;
    private int size;
    private final String name;

    // Initializes a tab with a name and empty browsing history
    public Tabs(String name) {
        this.name = name;
        this.size = 0;
    }

    // Visits a new page and appends it to the browsing history
    public void addPage(Page page) {

        if (isFirstPage()) {
            initializeFirstPage(page);
        } else {
            appendPageToHistory(page);
        }

        size++;
        System.out.println("Visited: " + page.data);
    }

    // Moves forward in browsing history if possible
    public void moveForward() {

        if (!canMoveForward()) {
            System.out.println("Already at the last page");
            return;
        }

        current = current.next;
        System.out.println("Moved forward to: " + current.data);
    }

    // Moves backward in browsing history if possible
    public void moveBackward() {

        if (!canMoveBackward()) {
            System.out.println("Already at the first page");
            return;
        }

        current = current.prev;
        System.out.println("Moved back to: " + current.data);
    }

    // Displays the complete browsing history from first to last page
    public void displayHistory() {

        Page temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Returns the currently active page
    public Page getCurrentPage() {
        return current;
    }

    // Returns total number of pages visited in this tab
    public int getSize() {
        return size;
    }

    // Returns the tab name
    public String getTabName() {
        return name;
    }

    // Checks if the tab has no browsing history yet
    private boolean isFirstPage() {
        return head == null;
    }

    // Initializes pointers when the first page is added
    private void initializeFirstPage(Page page) {
        head = tail = current = page;
    }

    // Appends a page to the end of the doubly linked history
    private void appendPageToHistory(Page page) {
        tail.next = page;
        page.prev = tail;
        tail = page;
        current = page;
    }

    // Validates forward navigation availability
    private boolean canMoveForward() {
        return current != null && current.next != null;
    }

    // Validates backward navigation availability
    private boolean canMoveBackward() {
        return current != null && current.prev != null;
    }
}
