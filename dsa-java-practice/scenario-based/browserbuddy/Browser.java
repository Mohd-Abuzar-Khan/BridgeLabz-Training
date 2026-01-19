package browserbuddy;

import java.util.Stack;

public class Browser {

    // Stores recently closed tabs to allow reopening
    private Stack<Tabs> closedTabs;

    // Initializes browser with empty closed tab history
    public Browser() {
        closedTabs = new Stack<>();
    }

    // Closes a tab and saves it for future restoration
    public void closeTab(Tabs tab) {
        closedTabs.push(tab);
        printTabDetails("TAB CLOSED", tab);
    }

    // Reopens the most recently closed tab if available
    public Tabs reopenTab() {

        if (closedTabs.isEmpty()) {
            System.out.println("\nNo closed tabs to reopen");
            return null;
        }
        Tabs restoredTab = closedTabs.pop();
        printTabDetails("TAB RESTORED", restoredTab);
        return restoredTab;
    }

    // Prints tab information in a consistent format
    private void printTabDetails(String title, Tabs tab) {
        System.out.println("\n----------------------------");
        System.out.println(title);
        System.out.println("----------------------------");
        System.out.println("Tab Name : " + tab.getTabName());
        System.out.println("Pages    : " + tab.getSize());
    }

    public static void main(String[] args) {

        Browser browser = new Browser();

        // Create pages
        Page oops = new Page("OOPS in Java");
        Page encapsulation = new Page("Encapsulation in Java");
        Page inheritance = new Page("Inheritance in Java");
        Page abstraction = new Page("Abstraction in Java");
        Page polymorphism = new Page("Polymorphism in Java");

        // Create tabs
        Tabs javaTab = new Tabs("Java OOPS");
        Tabs advancedTab = new Tabs("Advanced OOPS");

        // Perform navigation on first tab
        openTab(javaTab, oops, encapsulation, inheritance);
        javaTab.moveBackward();
        System.out.println("Current Page: " + javaTab.getCurrentPage().data);

        // Perform navigation on second tab
        openTab(advancedTab, abstraction, polymorphism);

        // Display browsing history
        displayHistory(javaTab, advancedTab);

        // Close and restore tab
        browser.closeTab(javaTab);
        Tabs restoredTab = browser.reopenTab();

        if (restoredTab != null) {
            System.out.println("\nRestored Tab History");
            System.out.println("--------------------");
            restoredTab.displayHistory();
        }
    }

    // Opens a tab and adds provided pages sequentially
    private static void openTab(Tabs tab, Page... pages) {
        System.out.println("\nOpening Tab: " + tab.getTabName());
        for (Page page : pages) {
            tab.addPage(page);
        }
    }

    // Displays browsing history for given tabs
    private static void displayHistory(Tabs... tabs) {
        System.out.println("\nBrowsing History");
        System.out.println("----------------");
        for (Tabs tab : tabs) {
            tab.displayHistory();
        }
    }
}
