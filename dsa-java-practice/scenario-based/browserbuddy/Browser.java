package browserbuddy;

import java.util.Stack;

public class Browser {

    private Stack<Tabs> closedTabs;

    public Browser() {
        closedTabs = new Stack<>();
    }

    public void closeTab(Tabs tab) {
        closedTabs.push(tab);

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("🗂️  TAB CLOSED");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📌 Tab Name : " + tab.getTabName());
        System.out.println("📄 Pages   : " + tab.getSize());
    }

    public Tabs reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("\n⚠️  No closed tabs to reopen");
            return null;
        }

        Tabs restoredTab = closedTabs.pop();

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("♻️  TAB RESTORED");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📌 Tab Name : " + restoredTab.getTabName());
        System.out.println("📄 Pages   : " + restoredTab.getSize());

        return restoredTab;
    }

    public static void main(String[] args) {

        Browser browser = new Browser();

        // Pages
        Page oops          = new Page("OOPS in Java");
        Page encapsulation = new Page("Encapsulation in Java");
        Page inheritance   = new Page("Inheritance in Java");
        Page abstraction   = new Page("Abstraction in Java");
        Page polymorphism  = new Page("Polymorphism in Java");

        // Tabs
        Tabs javaTab     = new Tabs("Java OOPS");
        Tabs advancedTab = new Tabs("Advanced OOPS");

        // Tab 1 activity
        System.out.println("\n🌐 Opening Tab: " + javaTab.getTabName());
        javaTab.addPage(oops);
        javaTab.addPage(encapsulation);
        javaTab.addPage(inheritance);

        javaTab.moveBackward();
        System.out.println("📍 Current Page: " + javaTab.getCurrentPage().data);

        // Tab 2 activity
        System.out.println("\n🌐 Opening Tab: " + advancedTab.getTabName());
        advancedTab.addPage(abstraction);
        advancedTab.addPage(polymorphism);

        // Display history
        System.out.println("\n📜 Browsing History");
        System.out.println("━━━━━━━━━━━━━━━━━━");
        javaTab.displayHistory();
        advancedTab.displayHistory();

        // Close & restore
        browser.closeTab(javaTab);

        Tabs restoredTab = browser.reopenTab();
        if (restoredTab != null) {
            System.out.println("\n📜 Restored Tab History");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━");
            restoredTab.displayHistory();
        }
    }
}
