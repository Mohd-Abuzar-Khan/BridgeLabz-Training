package browserbuddy;

public class Page {
    String data;
    Page prev;
    Page next;

    Page(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    
}